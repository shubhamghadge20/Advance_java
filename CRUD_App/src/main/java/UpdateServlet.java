import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int rno=Integer.parseInt(request.getParameter("id"));
		String nm1=request.getParameter("nm");
		String ct1=request.getParameter("ct");
		
		out.print("<html><body>");
		out.print("<form action='Update1' method='post'>");
		out.print("Rollno<input type='text' name='t1' value="+rno+">");
		out.print("Name<input type='text' name='t2' value="+nm1+">");
		out.print("City<input type='text' name='t3' value="+ct1+">");
		out.print("<input type='submit' value='Update'>");
		out.print("</form></body></html>");
	}

}
