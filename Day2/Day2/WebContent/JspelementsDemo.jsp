<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Scriplets -->
	<%! int months=5; %>
	<!-- Declaration tag -->
	<% if(months==2)
	{
	%>
	<a>It's February</a>
	<%
	}
	else
	{
	%>
	<a>Any month other then february</a>
	<%
	}
	%>
</body>
</html>