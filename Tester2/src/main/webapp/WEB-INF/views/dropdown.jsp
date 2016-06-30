<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Drop down</title>
</head>
<body>
<prefix:form method="POST" commandName="UserQuery">
  <sf:input path="message" /><br/>
  <input type="submit"/>
</prefix:form>

	<form:form method="GET" commandName="noAction">	
		<form:select path="name">
	    	<form:options items="${nameList}" />
		</form:select>
	</form:form>
</body>
</html>