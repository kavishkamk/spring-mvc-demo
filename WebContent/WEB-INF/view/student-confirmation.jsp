<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The student is confirmed : ${ student.firstName } ${ student.lastName }
	<br /> country : ${student.country }
	<br /> favourite Language : ${ student.favLanguage }
	<br /> used OS types :
	<ul>
		<c:forEach var="temp" items="${ student.osType }">
				${temp }
			</c:forEach>
	</ul>

</body>
</html>