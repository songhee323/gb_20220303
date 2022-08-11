package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet('/calc2')
public class CalcServlet2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse agr1)
			throws ServletException, IOException {
	
		arg0.setCharacterEncoding("UTF-8");
		
		arg1.setCharacterEencoding("UTF-8");
		arg1.setContentType("text/html charset=UTF-8");
		
		// Application 저장소 선언
		ServletContext application = arg0.getServletContext();
		
		PrintWriter out = arg1.getWriter();
		
		String value_ = arg0.getParameter("value");
		String op = arg0.getParameter("operator");
		
		int value = 0;
		
		
		
		
		
		
		
		
	
	
	}
	
}
