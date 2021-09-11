<%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <link href="webjars/bootstrap/5.0.1/css/bootstrap.min.css"
	rel="stylesheet">
     <style>
	    h1 {
	    	text-align:center;
		}
		.user{
			float:right;
		}
		button {
			  margin-bottom : 25px;
		}
		.close{
			margin-bottom : 25px;
		}
		.btn-circle.btn-sm {
            width: 30px;
            height: 30px;
            padding: 6px 0px;
            border-radius: 15px;
            font-size: 8px;
            text-align: center;
            margin-right:10px;
        }
    </style>
</head>
<body>
<div >
        <h1 class ="bg-secondary text-white  align-text-center">HR PORTAL</h1>
</div >
<div class="user close"> 
<div>
<tr>
<h4>Welcome ${loged_in_user}</h4>
<button onclick="location.href ='/'" type="button" class="btn btn-danger btn-circle btn-sm user">X</button>
</tr>
</div>
</div>
<div class="container">
<div>
		<h1 class =" text-center " style="text-align:left">Add Employee Details </h1>
</div>

<form:form id="myform" action="addemployee" modelAttribute="addemployee" method="post"><!-- modelAttribute="addemployee" -->
	<table>
		<tr>
			<td >Employee Code </td>
			<td >: <form:input type='number' path="employee_code" />
			<font color="red">${codeerrorMessage}</font>
			</td>
		</tr>
		<tr>
			<font color="red">${errorMessage}</font>
			<td >Employee Name </td>
			<td >: 
			<form:input type='text' path="employee_name" />
			<font color="red">${nameerrorMessage}</font>
			</td>
		</tr>
		<tr>
			<td >Location </td>
			<td >: <form:input type='text' path="location" />
			<font color="red">${locationerrorMessage}</font>
			</td>
		</tr>
		<tr>
			<td >Email </td>
			<td >: <form:input type='text' path="email"  />
			<font color="red">${emailerrorMessage}</font>
			</td>
		</tr>
		<tr>
			<td >Date Of Birth </td>
			<td ">: <form:input type='text' path="date_of_birth" /></td>
		</tr>
		<tr>
		<td>
		 <%--action ="employeedetais/${id}" --%>
		</tr>
	</table>
</form:form>
<input  form="myform" type="submit" value="Save"> <!-- onclick="location.href ='/employeelisting'" -->
<button onclick="location.href ='/employeelisting'" >Cancel</button>
</div>
<div class="footer-copyright text-center py-0 bg-secondary text-white fixed-bottom"> Copyright 2020-2021 by Varun Rawat<!--© 2020 Copyright:--></div>
    <script src="webjars/jquery/3.1.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>
</body>
</html>
