package model;

import dao.IUserDAO;
import dao.UserDAO;
import exceptions.DriverDAOException;
import exceptions.InvalidDAOException;


public class Demo {

	public static void main(String[] args) {
		User test= new User("lqlql", "grah", "lqdsx@gmail.com");
		
		
		IUserDAO user=new UserDAO();
		try {
			user.createUser(test);
		} catch (InvalidDAOException e) {
			e.printStackTrace();
		}
		System.out.println(test);
		
//	user.createAccount("Boris", "rigor@abv.bg", "1marioA");

//	user.login("rigor@abv.bg", "1marioA");
//user.addContent("girl");
//user.seeFreshContent();
//user.seeTrendingContent();
		
		

	}

}
