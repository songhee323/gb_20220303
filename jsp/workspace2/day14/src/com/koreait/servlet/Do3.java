package com.koreait.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Do3 {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		req.setAttribute("result", "do3으로 요청보내기!"); 	//업무처리
		return "do3.jsp";		// 응답
	}
	
}
