<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String username = request.getParameter("username");
	String userbirth = request.getParameter("userbirth");
	
	// DB처리
	//
	//
	
	//  forward방식	: request 객체유지			
	// 게시판에 대한 조회 사용		데이터유지
	//pageContext.forward("object_result.jsp");
	
	//	redirect 방식 : request 객체 재생성		
	// 결제페이지에 사용			데이터 손실
	response.sendRedirect("object_result.jsp");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>