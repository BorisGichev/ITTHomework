package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDAO;
import dao.IAccountDAO;
import exceptions.InvalidDAOException;
import model.Account;
import model.User;

/**
 * Servlet implementation class UpdateS
 */
@WebServlet("/UpdateS")
public class UpdateS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String country = request.getParameter("country");
		
		User user = (User) request.getSession(false).getAttribute("user");
		Account acc = (Account) request.getSession(false).getAttribute("acc");
		
		acc.setCountry(country);
		
		IAccountDAO accDao=new AccountDAO();
		
		try {
			accDao.updateAccount(acc);
		} catch (InvalidDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getSession().setAttribute("user", user);
		request.getSession().setAttribute("acc", acc);
		
		response.sendRedirect("./Profile");
		
//		response.getWriter().println("<h1>"+acc.toString()+"</h1> ");
//		response.getWriter().println("<h1>"+country+"</h1> ");
	}

}
