<%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <link href="webjars/bootstrap/5.0.1/css/bootstrap.min.css" rel="stylesheet">
    <style>
	    h1 {
	    	text-align:center;
		}
    </style>
</head>
<body>
<div >
        <h1 class ="bg-secondary text-white  align-text-center">HR PORTAL</h1>
</div>
<h1 style="text-align:left">Login to Continue</h1>
<div class="container-fluid h-100">
    <div class="row p-3 justify-content-center align-items-center h-50 mw-100" style="background-color: #eee;">
    	<form:form modelAttribute="login" method="post">
					<table>
						<tr><td><font color="red">${invalidCredentialMessage}</font></td></tr>
						<tr>
							<td>User Id</td>
							<td>: 
								<form:input path="name"  type='text' />
								<font color="red">${userNameErrorMessage}</font>
							</td>
						</tr>
						<tr>
							<td>Password</td>
							<td>: <form:input path="password"  type='password' />
							<font color="red">${passwordErrorMessage}</font>
							</td>
						</tr>
						<tr>
							<td>
								<input type="submit" value="Submit">
							</td>
						</tr>
					</table>
			</form:form>
    </div>
</div>
<div class="footer-copyright text-center py-0 bg-secondary text-white fixed-bottom"> Copyright 2020-2021 by Varun Rawat<!--© 2020 Copyright:--></div>
<script src="webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>
</body>
</html>
