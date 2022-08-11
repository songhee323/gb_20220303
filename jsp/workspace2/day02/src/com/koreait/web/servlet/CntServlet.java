package com.koreait.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cnt")
public class CntServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
	
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html charset=UTF-8");
		
		String paramCnt = arg0.getParameter("cnt");
		int cnt = 100;
		
		if( paramCnt != null && !paramCnt.equals("") ) {
			cnt = Integer.parseInt(paramCnt);
		}
		
		PrintWriter out = arg1.getWriter();
		for( int i = 0; i<cnt; i++ ) {
			out.println((i + 1) + " : �ȳ� servlet<br>");
		}
		
		
	/*
	 * CntServlet�� servlet class�� ����Ͽ�
	 * ����� url��û	: http://localhost:9090/cnt?cnt=5
	 * ȭ�� ��� ����	: 1: �ȳ� servlet
	 * 				  2: �ȳ� servlet
	 * 				  3: �ȳ� servlet
	 * 				  4: �ȳ� servlet
	 * 				  5: �ȳ� servlet
	 * 		
	 * ����� url��û	: http://localhost:9090/cnt?	null or ""
	 *  ȭ�� ��� ����	: 1: �ȳ� servlet
	 *  				...
	 *  			  100: �ȳ� servlet
	 * */
	
	
	
	
	
	
	}
	
}
