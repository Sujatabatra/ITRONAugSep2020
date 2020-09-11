<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<spring:form action="./login" method="post" modelAttribute="user">
 Enter UserName : <spring:input path="username"/><br><br>
 Enter Password : <spring:password path="password"/><br><br>
 <input type="submit" value="Login">
</spring:form>
<%-- 
<form action="./login" method="post">
	Enter User Name : <input type="text" name="uname"><br><br>
	Enter Password : <input type="password" name="pwd"><br><br>
	<input type="submit" value="Login">
</form>
--%>
</body>
</html>