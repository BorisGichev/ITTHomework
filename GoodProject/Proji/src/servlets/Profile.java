package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Account;
import model.User;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		if (request.getSession(false) == null) {
			response.sendRedirect("./");
			return;
		}

		User user = (User) request.getSession(false).getAttribute("user");
		Account acc = (Account) request.getSession(false).getAttribute("acc");
		request.getSession().setAttribute("user", user);
		request.getSession().setAttribute("acc", acc);
		
		response.getWriter().println("<h1> Heloo "+user.getUsername()+"</h1> ");
		
		if (acc.isFemale()) {

			response.getWriter()
					.println("<input name=\"name\" id=\"id\" type=\"checkbox\" checked=\"checked\">Is female <br> ");
		} else {
			response.getWriter()
					.println("<input name=\"name\" id=\"id\" type=\"checkbox\" checked=\"checked\">Is female <br>");
		}

		response.getWriter()
				.append("<form method=\"post\" action=\"./UpdateS\">"
						+ "<label for=\"Country\">Selected country is "
						+ acc.getCountry() + "</label> <br>"
						+ "<select name= country>"
						+ "<option >Select</option>"
						+ "<option value=\"AF\">Afghanistan</option>"
						+ "<option value=\"AX\">Aland Islands</option>"
						+ "<option value=\"AL\">Albania</option>"
						+ "<option value=\"DZ\">Algeria</option>"
						+ "<option value=\"AS\">American Samoa</option>"
						+ "<option value=\"AD\">Andorra</option>"
						+ "<option value=\"AO\">Angola</option>"
						+ "<option value=\"AI\">Anguilla</option>"
						+ "<option value=\"AQ\">Antarctica</option>"
						+ "</select><br>"
						+"<label for=\"user name\">User name </label> <br>"
						+"<input type=\"text\" name=\"user name\" placeholder=\""+user.getUsername()+"\"/><br>"
						+ "<input type=\"submit\"  value=\"Update info\">"
						+ "</form>");
	
		response.getWriter().append("<form action=\"./uploadContent.html\">"
	    +"<input type=\"submit\" value=\"Upload Content\">"
	+"</form>");
		
		
//		response.getWriter()
//		.append("<form method=\"POST\" action=\"Upload\" enctype=\"multipart/form-data\" >"
//        +"File:"
//		+"<input type=\"file\" name=\"file\" id=\"file\" /> <br/>"
//        +"Destination:"
//        +"<input type=\"text\" value=\"/tmp\" name=\"destination\"/>"
//        +"</br>"
//        +"<input type=\"submit\" value=\"Upload\" name=\"upload\" id=\"upload\" />"
//        +"</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
