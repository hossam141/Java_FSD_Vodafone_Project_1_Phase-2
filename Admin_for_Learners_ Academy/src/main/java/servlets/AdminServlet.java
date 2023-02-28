package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.ClassDB;
import entity.Class;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
    	System.out.println("Admin Servlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// display list of all the customers registered?
		System.out.println(getServletContext().getContextPath() );
		
		ClassDB db = new ClassDB();
		try {
			List<Class> classes = db.getAllClasses();
			RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
			request.setAttribute("classes", classes);
			dispatcher.forward(request, response);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}