package com.traning.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class calculationServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter output = response.getWriter();
		if(request.getParameter("number1")!=null && request.getParameter("number2")!=null &&request.getParameter("number3")!=null)
		{
		int numb1 = Integer.parseInt(request.getParameter("number1"));
		int numb2 = Integer.parseInt(request.getParameter("number2"));
		int numb3 = Integer.parseInt(request.getParameter("number3"));
		
		int sum = numb1 + numb2 +numb3;
		int subtraction=numb1-numb2-numb3;
		int multiplication= numb1 *numb2*numb3;
		//int division=numb1/numb2;
		
		
		//PrintWriter output = response.getWriter();
		output.println("The Answer :"+sum +"\n Subtraction :"+subtraction+"\n Multiplication :"+multiplication);
		}
		else{
			
			output.println("enter the valid input");
			
		}
	}

}
