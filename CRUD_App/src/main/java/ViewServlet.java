

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<a href='Index.html'>Add New Student</a>");
		out.println("<h2>Student List</h2>");
		List<Student>list=StudentDAO.showStud();
		
		out.print("<table border='1' width='100%'>");
		out.print("<tr><td>Rollno</td><td>Name</td><td>City</td><td>Delete<td>edit</td></tr>");
		for(Student s:list) {
			out.print("<tr><td>" + s.getRollno() + "</td><td>" + s.getName() + "</td><td>" + s.getCity() + "</td><td><a href='DeleteServlet?id=" + s.getRollno() + "'>Delete</a></td></tr>");

		}
		out.print("</table>");
		out.close();
	}

}
