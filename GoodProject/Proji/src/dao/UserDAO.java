package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import exceptions.InvalidDAOException;
import model.Account;
import model.User;

public class UserDAO extends AbstractDAO implements IUserDAO {

	private static final String SELECT_FROM_MAIL = "select email,user_id from ninegag.users where email =?;";
	private static final String GET_USER_BY_ID = "SELECT * FROM users WHERE user_id = ?";
	private static final String UPDATE_USER_SQL = "UPDATE users SET email = ?, pass = ?,username=?,your_name=? WHERE id = ?;";
	private static final String CREATE_NEW_USER_SQL = "INSERT INTO ninegag.users VALUES (null, ?, ?,?,null,?);";

	@Override
	public User createUser(User user) throws InvalidDAOException {
		if (user != null) {
			try {
				PreparedStatement ps = getCon().prepareStatement(CREATE_NEW_USER_SQL,
						PreparedStatement.RETURN_GENERATED_KEYS);

				// user id, email String,pass String,username string,yourname
				// String,account id

				AccountDAO accDao = new AccountDAO();
				Integer accID = accDao.createAccount(new Account(true, true, true, null));

				ps.setString(1, user.getEmail());
				ps.setString(2, user.getPassword());
				ps.setString(3, user.getUsername());
				ps.setInt(4, accID);

				ps.executeUpdate();
				ResultSet result = ps.getGeneratedKeys();

				result.next();
				int id = result.getInt(1);

				user.setId(id);

				user.setAccID(accID);

				return user;

			} catch (SQLException e) {

				e.printStackTrace();
				throw new InvalidDAOException("You user cannot be created right now. Sorry about that. ");
			}
		} else {
			throw new InvalidDAOException("This user is null. Try again.");
		}

	}

	@Override
	public void updateUser(User user) throws InvalidDAOException {
		if (user != null) {
			try {
				PreparedStatement ps = getCon().prepareStatement(UPDATE_USER_SQL);
				ps.setString(1, user.getEmail());
				ps.setString(2, user.getPassword());
				ps.setString(3, user.getUsername());
				ps.setString(4, user.getYourName());
				ps.setInt(5, user.getId());

				ps.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
				throw new InvalidDAOException("Your user cannot be updated right now. Sorry about that");
			}
		} else {
			throw new InvalidDAOException("Your user is null.Try again.");
		}

	}

	@Override
	public User getUserById(int userId) throws InvalidDAOException {
		User userToReturn = null;

		try {
			PreparedStatement ps = getCon().prepareStatement(GET_USER_BY_ID);
			ps.setInt(1, userId);
			ResultSet result = ps.executeQuery();
			result.next();

			String email = result.getString(2);
			String password = result.getString(3);
			String username = result.getString(4);
			String yourName = result.getString(5);
			Integer accID = result.getInt(6);

			userToReturn = new User(password, username, yourName, email);
			userToReturn.setAccID(accID);
			userToReturn.setId(userId);
			return userToReturn;

		} catch (SQLException e) {

			e.printStackTrace();
			throw new InvalidDAOException("The user with id " + userId + " cannot be found . Try again later.");

		}
	}
@Override
	public int getLastId() throws InvalidDAOException {
		Integer lastID = null;

		try {
			PreparedStatement ps = getCon().prepareStatement("SELECT user_id FROM users");

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

	@Override
	public int checkIfEmailIsUnique(String eMail) {
		ResultSet myRs = null;
		try {
			PreparedStatement ps = getCon().prepareStatement(SELECT_FROM_MAIL, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, eMail);
			myRs = ps.executeQuery();
			int id;

			if (myRs.next()) {
				id = myRs.getInt(2);
				return id;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return -1;
	}

	@Override
	public boolean isPaswordStrong(String pass) {
		if (pass.length() < 6 || pass.trim().length() == 0) {
			return false;
		}
		boolean upper = false;
		boolean lower = false;
		boolean number = false;

		for (int i = 0; i < pass.length(); i++) {
			if (upper == false && pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
				upper = true;
			}
			if (lower == false && pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
				lower = true;
			}
			if (number == false && pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
				number = true;
			}

			if (number && upper && lower) {
				return true;
			}
		}
		return false;

	}


}
