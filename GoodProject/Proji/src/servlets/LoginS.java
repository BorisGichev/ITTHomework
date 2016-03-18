package servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDAO;
import dao.IAccountDAO;
import dao.IUserDAO;
import dao.UserDAO;
import exceptions.InvalidDAOException;
import model.Account;
import model.IUser;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServlet")
public class LoginS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginS() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("mail");
		String password = request.getParameter("password");

		IUserDAO userDAO = new UserDAO();
		IAccountDAO accDAO = new AccountDAO();
		
		Integer userID = userDAO.checkIfEmailIsUnique(email);
		IUser user = null;
		Account acc = null;

		if (userID == -1) {
			request.getSession().setAttribute("msg", "No such user ");
			response.sendRedirect("./BadLogin");
			return;

		}
		try {
			user = userDAO.getUserById(userID);
			acc=accDAO.getAccountById(user.getAccID());
			System.out.println(acc.toString());

		} catch (InvalidDAOException e) {
			e.printStackTrace();
		}
		if (user.getPassword().equals(password)) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("acc", acc);
			response.sendRedirect("./Profile");

		}

	}

}
