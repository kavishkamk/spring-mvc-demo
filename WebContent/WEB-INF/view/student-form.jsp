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
	<form:form action="processForm" modelAttribute="student">
		First Name : <form:input path="firstName" />
		<br />
		<br />
		Last Name:   <form:input path="lastName" />
		<br />
		<br />
		Country : <form:select path="country">
			<br />
			<br />
			<!-- 
						<form:option value="America">America</form:option>
						<form:option value="Australia">Australia</form:option>
						<form:option value="Canada">Canada</form:option>
						<form:option value="Nedarland">Nedarland</form:option>
					 -->
			<form:options items="${ student.countryOptions }" />
		</form:select>
		<br />
		<form:radiobutton path="favLanguage" value="java" />Java<br />
		<form:radiobutton path="favLanguage" value="php" />PHP<br />
		<form:checkbox path="osType" value="linux" />Linux<br />
		<form:checkbox path="osType" value="mswindow" />MS Windows<br />
		<form:checkbox path="osType" value="mac" />MAC<br />
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>