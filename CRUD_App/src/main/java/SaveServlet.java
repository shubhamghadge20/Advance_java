import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String rno=request.getParameter("t1");
		String nm=request.getParameter("t2");
		String ct=request.getParameter("t3");
		
		Student s=new Student();
		s.setRollno(Integer.parseInt(rno));
		s.setName(nm);
		s.setCity(ct);
		
		int res=StudentDAO.SaveStud(s);
		if(res==1)
		{
			out.println("Record is saved....");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		else
		{
			out.println("unable to save");
			
		}
	}

}