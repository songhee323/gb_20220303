package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc4")
public class CalcServlet4 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {

		arg0.setCharacterEncoding("UTF-8");
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html charset=UTF-8");
		
		PrintWriter out = arg1.getWriter();
		
		out.write("");
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title> Insert title here</title>");
		
		
		
		
	}
	
}
