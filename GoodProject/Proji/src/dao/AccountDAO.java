package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import exceptions.InvalidDAOException;
import model.Account;

public class AccountDAO extends AbstractDAO implements IAccountDAO {

	private static final String FIND_ACCOUNT_BY_ID_SQL = "SELECT * FROM accounts WHERE account_id = ?";
	private static final String UPDATE_ACCOUNT_SQL = "UPDATE accounts SET show_nsfw = ?, hide_uprated = ?, country_id=?  WHERE id = ?;";
	private static final String CREATE_NEW_ACCOUNT_SQL = "INSERT INTO accounts VALUES (null, ?, ?,null,?,?);";

	@Override
	public int createAccount(Account account) throws InvalidDAOException {
		if (account != null) {
			try {
				PreparedStatement ps = getCon().prepareStatement(CREATE_NEW_ACCOUNT_SQL,
						PreparedStatement.RETURN_GENERATED_KEYS);

				ps.setBoolean(1, account.isFemale());
				ps.setString(2, account.getBirthday());
				ps.setBoolean(3, account.isShowNSFW());
				ps.setBoolean(4, account.isHideUprated());
				ps.executeUpdate();

				ResultSet result = ps.getGeneratedKeys();
				result.next();

				// account.setId(result.getInt(1));
				return result.getInt(1);

			} catch (SQLException e) {

				e.printStackTrace();
				throw new InvalidDAOException("You account cannot be created right now. Sorry about that. ");
			}
		} else {
			throw new InvalidDAOException("This account is null. Try again.");
		}

	}

	@Override
	public void updateAccount(Account account) throws InvalidDAOException {
		if (account != null) {
			try {
				Integer country_id = 0;

				PreparedStatement psCountry = getCon()
						.prepareStatement("select country_id from ninegag.countries where short_name=?;");
				psCountry.setString(1, account.getCountry());

				ResultSet psCResults = psCountry.executeQuery();
				if (psCResults.next()) {
					country_id = psCResults.getInt(1);
				}
				// "UPDATE accounts SET show_nsfw = ?, hide_uprated = ?,
				// country_id=? WHERE id = ?;"
				PreparedStatement ps = getCon().prepareStatement(UPDATE_ACCOUNT_SQL);

				ps.setBoolean(1, account.isShowNSFW());
				ps.setBoolean(2, account.isHideUprated());
				ps.setInt(3, country_id);
				ps.setInt(4, account.getId());
				ps.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
				throw new InvalidDAOException("Your account cannot be updated right now. Sorry about that");
			}
		} else {
			throw new InvalidDAOException("Your account is null.Try again.");
		}

	}

	@Override
	public Account getAccountById(int accountId) throws InvalidDAOException {
		Account accountToReturn = null;

		try {
			PreparedStatement ps = getCon().prepareStatement(FIND_ACCOUNT_BY_ID_SQL);
			ps.setInt(1, accountId);
			ResultSet result = ps.executeQuery();

			if (result.next()) {
				int gender = result.getInt(2);
				boolean genderB = (gender == 1) ? true : false;

				String birtday = result.getString(3);

				int showNSFW = result.getInt(5);
				boolean showNSFWB = (showNSFW == 1) ? true : false;

				int hideUprated = result.getInt(6);
				boolean hideUpratedB = (hideUprated == 1) ? true : false;

				accountToReturn = new Account(genderB, showNSFWB, hideUpratedB, birtday);

				accountToReturn.setId(result.getInt(1));
				accountToReturn.setCountryID(result.getInt(4));

				PreparedStatement psCountry = getCon()
						.prepareStatement("select name from ninegag.countries where short_name=?;");
				psCountry.setInt(1, accountToReturn.getCountryID());

				ResultSet psCResults = psCountry.executeQuery();
				if (psCResults.next()) {
					accountToReturn.setCountry(psCResults.getString(1));
				}

				return accountToReturn;

			}

		} catch (SQLException e) {

			e.printStackTrace();
			throw new InvalidDAOException("The account with id " + accountId + " cannot be found . Try again later.");

		}
		return null;

	}

	@Override
	public int getLastId() throws InvalidDAOException {
		Integer lastID = null;

		try {
			PreparedStatement ps = getCon().prepareStatement("SELECT account_id FROM accounts");

			ResultSet result = ps.executeQuery();
			while (result.next()) {
				lastID = result.getInt(1);
			}
			;
			return lastID;
		} catch (SQLException e) {

			e.printStackTrace();
			throw new InvalidDAOException("something went wrong.");

		}
	}

}
