<%@page import="com.service.EmployeeUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.model.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show All Employee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>Show All Employees</h1>
<table border="2px solid black" style="width: 100%">
<thead style="border: 2px solid green">
<th style="border: 2px solid black">Employee_Id</th><br>
<th style="border: 2px solid black">Employee_Name</th>
<th style="border: 2px solid black">Employee_LastName</th>
<th style="border: 2px solid black">Employee_City</th>
<th style="border: 2px solid black">Employee_Email</th>
<th style="border: 2px solid black">Employee_Password</th>
<th style="border: 2px solid black">Gender</th>
<th style="border: 2px solid black">Update</th>
<th style="border: 2px solid black">Delete</th>
</thead>
<tbody>

<%
List<Employee> li = EmployeeUtil.getAllEmployee();
for(Employee emp : li){
%>
<tr>
<td style="border: 2px solid black"><%=emp.getEmployee_id()%></td>
<td style="border: 2px solid black"><%=emp.getEmployee_fname()%></td>
<td style="border: 2px solid black"><%=emp.getEmployee_lname()%></td>
<td style="border: 2px solid black"><%=emp.getCity()%></td>
<td style="border: 2px solid black"><%=emp.getEmail()%></td>
<td style="border: 2px solid black"><%=emp.getPass()%></td>
<td style="border: 2px solid black"><%=emp.getGender()%></td>
<td style="border: 2px solid black"><a href = "update.jsp" class="btn btn-primary">Update</a></td>
<td style="border: 2px solid black"><a href="deleteEmployee?id =<%=emp.getEmployee_id()%>" class="btn btn-primary">Delete</a></td>
</tr>
<%
}
%>

</tbody>
</table>
</div>
</body>
</html>