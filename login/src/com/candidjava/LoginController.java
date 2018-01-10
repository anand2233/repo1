package com.candidjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
		if(un.equals("admin") && pw.equals("admin"))
		{
			response.sendRedirect("success.html");
			return;
		}
		else
		{
			
			System.out.println("<script>alert('Invalid username or password')</script>");
			//response.sendRedirect("alert("Invalid password/Username");");
			//return;
		}
	}

}
