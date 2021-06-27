<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customer form</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
	
	Asterisk(*) means the field is required.
	<form:form action="processForm" modelAttribute="customer">
		First Name:<form:input path="firstName"/>
		<br><br>
		
		Last Name(*):<form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>