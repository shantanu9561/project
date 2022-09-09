package com.traning.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.ws.Response;

public class example01 extends GenericServlet {

	@Override
	public void service(ServletRequest res, ServletResponse req) throws ServletException, IOException {
		req.setContentType("text/html");
		PrintWriter writer = req.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1> Aditya Patil</h1>");
		writer.println("</body>");
		writer.println("</html>");

	}

}
