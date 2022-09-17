<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processCustomer" modelAttribute="customer">
		First Name : <form:input path="firstName" />
		<br />
		Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br />
		Free Passes : <form:input path="freePass" />
		<form:errors path="freePass" cssClass="error" />
		<br />
		Free postalCode : <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br />
		Course Code : <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />
		<br />
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>