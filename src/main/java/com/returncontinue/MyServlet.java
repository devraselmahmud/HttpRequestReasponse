package com.returncontinue;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myName = req.getParameter("name1");
		String myEmail = req.getParameter("email1");
		
		System.out.println("Name is: "+myName);
		System.out.println("Email is: "+myEmail);
		
		PrintWriter out = resp.getWriter();
		out.println("Name: "+myName);
		out.println("Email: "+myEmail);
	}
}
