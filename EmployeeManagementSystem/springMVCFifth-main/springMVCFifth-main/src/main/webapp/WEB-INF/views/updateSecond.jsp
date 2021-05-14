<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
<h1>Employee Management System</h1>
<form:form action="/updateemployee" modelAttribute="employee" method="post">
<p><label>Employee Id :</label> <form:hidden path="eid"/> </p>
<p><label>Employee Name :</label> <form:input path="ename"/> </p>
<p><label>Department : </label><form:input path="edept" /></p>
<p><label>Designation :</label><form:input path="edesignation"></form:input></p>
<p><label>Salary :</label><form:input path="esalary"></form:input></p>
<input type="submit" value="update"/>
</form:form>


</body>
</html>