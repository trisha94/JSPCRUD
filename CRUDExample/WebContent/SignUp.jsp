<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.Dao" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
</head>
<body>
${param.name}
${param.email}

<jsp:useBean id="obj" class="com.Bean"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<jsp:getProperty property="name" name="obj"/>
<%
Dao daoObj = new Dao();
String rows = daoObj.insertData(obj);
%>
<h1>Data Inserted Successfully Rows Affected= ${rows}
</h1>



</body>
</html>