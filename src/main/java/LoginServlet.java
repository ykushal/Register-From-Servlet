import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=res.getWriter();
String username =req.getParameter("x");
String password =req.getParameter("y");
List l= new LinkedList();
if(username.equals("nik") &&   password.equals("kushal"))
{
	RequestDispatcher dispatcher = req.getRequestDispatcher("viewusers.jsp");
	dispatcher.forward(req, res);
	}
else
{
	req.setAttribute("error",l);
	l.add("Login Error!!!");
	RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
	dispatcher.forward(req, res);
}
}

	
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
doGet(req, res);
}
}
