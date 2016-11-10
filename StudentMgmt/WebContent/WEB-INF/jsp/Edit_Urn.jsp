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
<form:form name="form1"  method="POST" action="/StudentMgmt/Edit" >
Urn<form:input path="urn" type="text" placeholder="Enter the urn"/><br><br>
<input type="submit" value="submit"/> 
</form:form>
${message}
</body>
</html>