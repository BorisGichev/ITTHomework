package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IUserDAO;
import dao.UserDAO;
import exceptions.InvalidDAOException;
import model.User;

/**
 * Servlet implementation class SignUpS
 */
@WebServlet("/SignUpS")
public class SignUpS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("mail");
		String password = request.getParameter("password");
		
		User test= new User(password, username, email);
		
		IUserDAO userDAO=new UserDAO();
		
		if (userDAO.checkIfEmailIsUnique(email)!=-1) {
			request.getSession().setAttribute("msg", "E-mail taken ");
			response.sendRedirect("./BadLogin");
			return;
			
		}
		
		if (username=="") {
			request.getSession().setAttribute("msg", "No user name ");
			response.sendRedirect("./BadLogin");
			return;
			
		}
		
		if (!userDAO.isPaswordStrong(password)) {
			request.getSession().setAttribute("msg", "Weak or empty pass, man");
			response.sendRedirect("./BadLogin");
			return;
			
		}
		
		
		try {
			test=userDAO.createUser(test);
			request.getSession().setAttribute("user", test);
			
		} catch (InvalidDAOException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("./Profile");
		
	}
	
	

}
