<%@page import="entity.Class"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<h1>Welcome ADMIN</h1>
	<%
		List<Class> classes = (List<Class>)request.getAttribute("classes");
	%>
	<div class="container">
	<table class="table">
		<tr>
			<th>ID</th>
			<th>Starting_Date</th>
			<th>Ending_Date</th>
			<th>Time</th>
		</tr>
		<%
			for(Class cl : classes)
			{
		%>
			<tr>
				<td><%= cl.getId() %></td>
				<td><%= cl.getStarting_day() %></td>
				<td><%= cl.getEnding_day() %></td>
				<td><%= cl.getTime() %></td>
			</tr>
		<%
			}
		%>

	</table>
	</div>
</body>
</html>