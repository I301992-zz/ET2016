<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<input type="submit" value="EDIT"
		onclick="window.location='/StudentMgmt/beforecollegeEdit';" />
	<input type="submit" value="ADD"
		onclick="window.location='/StudentMgmt/addCollege';" />
	<input type="submit" value="DELETE"
		onclick="window.location='/StudentMgmt/deleteCollege';" />
	<br>
	<br>
	<c:forEach items="${collegelist}" var="item">
		<a href="/StudentMgmt/student/${item.name}">${item.name}
			${item.id} ${item.address}</a>
		<br>
		<br>
	</c:forEach>
</body>
</html>