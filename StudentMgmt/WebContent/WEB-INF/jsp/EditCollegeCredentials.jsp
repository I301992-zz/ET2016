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
<h4>ID: ${id}</h4>
<form:form name="form1" method="POST"  action="aftercollegeEdit" >
ID<form:input path="id" type="text" value="${id}"/><br><br>
Address<form:input path="address" type="text"/><br><br>
Courses<form:input path="courses" type="text" placeholder="Enter a comma separated list"></form:input><br><br>
<input type="submit" value="SUBMIT">
</form:form>

</body>
</html>