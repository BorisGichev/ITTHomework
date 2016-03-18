package dao;

import exceptions.InvalidDAOException;
import model.Account;
import model.User;

public interface IUserDAO {
	
	
	User createUser(User user) throws InvalidDAOException;

	
	void updateUser(User user) throws InvalidDAOException;

	
	User getUserById(int userId) throws InvalidDAOException;


	int checkIfEmailIsUnique(String eMail);


	boolean isPaswordStrong(String pass);


	int getLastId() throws InvalidDAOException;


}
