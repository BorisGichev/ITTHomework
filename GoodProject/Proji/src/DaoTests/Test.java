package DaoTests;

import static org.junit.Assert.*;

import dao.AccountDAO;
import dao.IAccountDAO;
import dao.IUserDAO;
import dao.UserDAO;
import exceptions.InvalidDAOException;
import model.Account;
import model.User;

public class Test {

	@org.junit.Test
	public void testUserDao() {
		IUserDAO userDao= new UserDAO();
		User temp=null;
		User temp2=null;
		try {
			temp = userDao.createUser(new User("Elen123", "zagor", "zmo19@abv.bg"));
		} catch (InvalidDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			assertEquals(temp.getId(),userDao.getLastId() );
		} catch (InvalidDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			temp2=userDao.getUserById(userDao.getLastId());
		} catch (InvalidDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(temp2,temp);
	}
	
	@org.junit.Test
	public void testAccountDao() {
		IAccountDAO accDao= new AccountDAO();
		AccountDAO temp=null;
		AccountDAO temp2=null;
		Integer id=null;
		
		try {
			id = accDao.createAccount(new Account(true, true, true, "12.12.2"));
		} catch (InvalidDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			assertEquals(id,accDao.getAccountById(id).getId());
		} catch (InvalidDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
