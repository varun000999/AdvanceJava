<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head lang="en">
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
		.close{
			margin-bottom : 25px;
		}
		.upper{
			margin-top: 40px;
		}
		button {
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

<div class="user"> 
<div>
<tr>
	<h4>Welcome ${loged_in_user}</h4>
	<button onclick="location.href ='/'" type="button" class="btn btn-danger btn-circle btn-sm user">X</button>
</tr>
</div>
</div>
<div class="container upper">
	<div class="float-right">
		<button method = "post" onclick="location.href ='/addemployee'" >Upload Employee details</button>
		<button onclick="location.href ='/downloadcsv'">Download Employee details</button>
	</div>
	<div>
		<h1 class ="border border-3 text-center ">Employee Listing</h1>
	</div>
	    <table class="table table-bordered">
	        <colgroup span="5"></colgroup>
	        <tr>
	            <th class="text-center">Employee Code</th>
	            <th class="text-center">Employee Name</th>
	            <th class="text-center">Location</th>
	            <th class="text-center">Email</th>
	            <th class="text-center">Date Of Birth</th>
	            <th class="text-center">Action</th>
	        </tr>
	        <c:forEach items="${employee_list}" var="itrtr">
	            <tr>
	                <td class="text-center">${itrtr.employee_code}</td>
	                <td class="text-center">${itrtr.employee_name}</td>
	                <td class="text-center">${itrtr.location}</td>
	                <td class="text-center">${itrtr.email}</td>
	                <td class="text-center">${itrtr.date_of_birth}</td>
	                <td class="text-center"><button method = "post" onclick="location.href ='/employeedetails/${itrtr.employee_code}'" >Edit</button></td>
	            </tr>
			</c:forEach>
	    </table>
	</div>
	<div class="footer-copyright text-center py-0 bg-secondary text-white fixed-bottom"> Copyright 2020-2021 by Varun Rawat<!--© 2020 Copyright:--></div>
    <script src="webjars/jquery/3.1.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>
</body>
</html>
