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
		
		
		<form action="add">
		
			Enter Number 1: <input type="text" name="num1"/><br>
			Enter Number 2: <input type="text" name="num2"/><br>
			<input type="submit" value="submit"/>
		</form>
		
		
		<form action="addDepartment">
		
			Enter Department Id: <input type="text" name="department_id"/><br>
			Enter Department Name: <input type="text" name="department_name"/><br>
			<input type="submit" value="submit"/>
		</form>
</body>
</html>