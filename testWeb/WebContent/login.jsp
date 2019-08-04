<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" content ="text/html;charset= UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:usebean id="service" class="com.demo.service.UserService"/>
<%
  // String uname = request.getParameter("username");
   //String pword = request.getParameter("password");
   //UserService service = new UserService();
   if(uname.equals("Admin") && pword.equals("Admin")){
	   response.sendRedirect("dashboard.jsp");
   }else
	   response.sendRedirect("error.jsp");
%>
</body>
</html>