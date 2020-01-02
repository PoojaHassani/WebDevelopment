<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.lti.employee.Employee"/>
<jsp:setProperty property="empId" name="user" value="12"/>
<jsp:getProperty property="empId" name="user"/>


<jsp:setProperty property="empName" name="user" value="T'challa"/>
<jsp:getProperty property="empName" name="user"/>

<jsp:setProperty property="empSalary" name="user" value="123456"/>
<jsp:getProperty property="empSalary" name="user"/>




</body>
</html>