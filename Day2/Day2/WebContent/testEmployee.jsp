<%@page import="com.lti.employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
	How to embed java in jsp
	</h1>
	<%
	Employee employee=new Employee();
	employee.setEmpId(1234);
	employee.setEmpName("Pooja");
	employee.setEmpSalary(2456.999);
	%>
	<h2>Employee Details</h2>
	<%
	out.print("<br>EmployeeID:" + employee.getEmpId());
	out.print("<br>Name:" + employee.getEmpName());
	out.print("<br>Salary:" + employee.getEmpSalary());
	%>
</body>
</html>