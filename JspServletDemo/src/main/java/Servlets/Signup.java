package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.Util;

import model.User;

@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<User> users;

	@Override
	public void init() throws ServletException {

		super.init();

		this.getServletContext().setAttribute("user_list", new ArrayList<User>());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		if (this.getServletContext().getAttribute("user_list") != null) {

			users = (ArrayList<User>) this.getServletContext().getAttribute("user_list");

		}

		PrintWriter out = response.getWriter();

		out.println("<html><body>");

		for (User user : users) {
			out.print("<h1>" + user.getName() + user.getEmail() +user.getPassword() + "</h1>");
		}
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = Utilities.Encript.doMD5Encript(request.getParameter("password"));

		if (this.getServletContext().getAttribute("user_list") != null) {

			users = (ArrayList<User>) this.getServletContext().getAttribute("user_list");

		}

		users.add(new User(uname, email, password));

		this.getServletContext().setAttribute("user_list", users);

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.print("<h1>" + uname + " Saved!</h1>");
		out.println("<a href=\"Signup\">User List</a>");
		out.println("</body></html>");

	}

}
