<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<table class="table table-striped border border-1 mt-3">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
			<c:forEach var="student" items="${students}" varStatus="status">
				<tr>
					<td>${student.studentId }</td>
					<td>${student.studentName}</td>
					<td>${student.studentAddress}</td>
					<td colspan="2">
						<a href="./edit?id" type="button" class="btn btn-primary">edit</a>
						<a href="./delete?id" type="button" class="btn btn-danger">delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>