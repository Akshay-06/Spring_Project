<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		Welcome to Spring Boot Application
		
		<h1>Adding two numbers</h1>
		
		<form action="add">
		
			Enter Number 1: <input type="text" name="num1"/><br>
			Enter Number 2: <input type="text" name="num2"/><br>
			<input type="submit" value="submit"/>
		</form>
		
		<h1>Adding Department</h1>
		
		<form action="addDepartment">
		
			Enter Department Id: <input type="text" name="department_id"/><br>
			Enter Department Name: <input type="text" name="department_name"/><br>
			<input type="submit" value="submit"/>
		</form>
		
		<h1>Adding Student</h1>
		
		
		<form action="addStudent" method="post">
		
			Enter Student Id: <input type="text" name="sid"/><br>
			Enter Student Name: <input type="text" name="sname"/><br>
			<input type="submit" value="submit"/>
		</form>
		
		<h1>Fetch Student By Id</h1>
		
		
		<form action="getStudentById" >
		
			Enter Student Id: <input type="text" name="sid"/><br>
			<input type="submit" value="submit"/>
		</form>
		
		
		<h1>Fetch Student By Name</h1>
		
		
		<form action="getStudentByName" >
		
			Enter Student Id: <input type="text" name="sname"/><br>
			<input type="submit" value="submit"/>
		</form>
		
		
		<h1>Delete Student By Id</h1>
		
		
		<form action="deleteStudentById" method="post">
		
			Enter Student Id: <input type="text" name="sid"/><br>
			<input type="submit" value="submit"/>
		</form>
		
		
</body>
</html>