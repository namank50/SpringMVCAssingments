<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Management System</h1>
<h2>Employee Details</h2>
<table border="1">
	<thead>
	<tr>
		<td>Employee Id</td>
		<td>Employee Name</td>
		<td>Employee Department</td>
		<td>Employee Designation</td>
		<td>Employee Salary</td>
	</tr>
	</thead>
	
	<c:forEach var="employees" items="${employees}">
		<tr>
				<td>${employees.eid}</td>
				<td>${employees.ename}</td>
				<td>${employees.edept}</td>
				<td>${employees.edesignation}</td>
				<td>${employees.esalary}</td>
		
		</tr>
	</c:forEach>
	
</table>	
	
</body>
</html>