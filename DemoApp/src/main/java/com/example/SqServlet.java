package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get the attribute "k" from the request
        int k = (int) request.getAttribute("k");
        
        // Calculate the square
        k = k * k;

        // Send the result as a response
        PrintWriter out = response.getWriter();
        out.println("Result is: " + k);
    }
}
