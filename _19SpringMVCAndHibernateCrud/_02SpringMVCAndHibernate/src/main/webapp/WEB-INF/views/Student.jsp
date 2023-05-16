<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Student Form</h1>
	</center>
	 
	<h2 style="color: red">${msg}</h2>
	<a href="./list">Student List</a>
	<hr />
	<form:form action="savestudent" method="post" modelAttribute="student">
		<table>
			<tr>
				Student Id:
				<form:input path="studentId" />
			</tr>
			<tr>
				Student Name:
				<form:input path="studentName" />
			</tr>
			<tr>
				Student Address:
				<form:input path="studentAddress" />
			</tr>
			<tr>
				<input type="submit" value="Register">
			</tr>
		</table>
	</form:form>
</body>
</html>