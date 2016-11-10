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
<h4>URN: ${urn}</h4>
<form:form name="form1" method="POST"  action="/StudentMgmt/afterEdit" >
urn<form:input path="urn" type="text" value="${urn}"/><br><br>
FirstName<form:input path="firstname" type="text"  /><br><br>
Lastname<form:input path="lastname" type="text"/><br><br>
age<form:input path="age" type="number"/><br><br>
batchyear<form:input path="batchyear" type="number" /><br><br>
Stream<form:input path="stream" type="text"/><br><br>
<input type="submit" value="SUBMIT">
</form:form>

</body>
</html>