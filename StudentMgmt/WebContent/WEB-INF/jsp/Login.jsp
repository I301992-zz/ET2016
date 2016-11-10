<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form name="form1"  method="POST" action="/Springmvc21/success" >
Name<form:input path="name" type="text"  /><br><br>
Password<form:input path="password" type="password"/><br><br>

<input type="submit" value="SUBMIT">
</form:form>

<p><H2>${message}</H2></p>
</body>
</html>