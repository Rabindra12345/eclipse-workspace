<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student-form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name :<form:input path="firstName"/>
		
		<br><br>
		Last name :<form:input path="lastName"/>
		<br><br>
		
		<br><br>
		Country:
		<form:select path="country">
			<form:options items="${student.countryOptions }"/>
		</form:select>
		
		<br><br>
		Favorite Language:<br>
		JAVA<form:checkbox path="favoriteLang" value="Java"/>
		C#<form:checkbox path="favoriteLang" value="C#"/>
		Php<form:checkbox path="favoriteLang" value="Php"/>
		Python<form:checkbox path="favoriteLang" value="Python"/>
		JS<form:checkbox path="favoriteLang" value="JS"/>
		
		<br><br>
		<input type="submit" value="Submit"/>
		<br/><br/>
	</form:form>
</body>
</html>