package dao;

import exceptions.InvalidDAOException;
import model.Account;

public interface IAccountDAO {

	int createAccount(Account account) throws InvalidDAOException;

	
	void updateAccount(Account account) throws InvalidDAOException;

	
	Account getAccountById(int accountId) throws InvalidDAOException;


	int getLastId() throws InvalidDAOException;

	

}
