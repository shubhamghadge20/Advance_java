package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // No need for calling doGet if you don't have a separate doGet method.

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String s1 = request.getParameter("t1");
        String s2 = request.getParameter("t2");

        out.println("<html><body>");

        if (s1.equals("admin") && s2.equals("admin")) {
            out.println("<h1>Welcome</h1>");

        } else {
            out.println("<h1>Login failed</h1>");
        }

        out.println("</body></html>");
        out.close();
    }

}
