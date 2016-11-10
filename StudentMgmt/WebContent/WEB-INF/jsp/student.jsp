<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>

<%@page import="java.util.Iterator" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
${message}
<body>${college}
<input type="submit" value="EDIT"
		onclick="window.location='/StudentMgmt/beforeEdit';" />
	<input type="submit" value="ADD"
		onclick="window.location='/StudentMgmt/addStudent/${college}';" />
	<input type="submit" value="DELETE"
		onclick="window.location='/StudentMgmt/deleteStudent';" />
	<br>
	<br>
<c:forEach items="${studentlist}" var="item">
    <a href="/StudentMgmt/displayStudent/${item.urn}">${item.firstname} ${item.lastname} ${item.urn}</a><br><br>
</c:forEach>

</body>
</html>