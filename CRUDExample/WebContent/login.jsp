<%@page import="com.Bean"%>
<%@page import="com.Dao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login jsp</title>
</head>
<body>
<% 
String name= request.getParameter("name") ;
String password = request.getParameter("password");
System.out.println(name);
out.println(name);
out.println(password);
%>



<%
	Dao dao = new Dao();
	Bean bean1 =   dao.validateData(name, password);
	String email = bean1.getEmail();  
	out.println(email);

%>
${param.email}
</body>
</html>