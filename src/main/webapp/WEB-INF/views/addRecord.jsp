<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
div.container {
    width: 100%;
	padding: 0;
}

#nav {
    float: left;
    width: 25%;
    margin: 0;
    padding: 30px;
	text-align:center;
}

#nav ul {
    list-style-type: none;
    padding: 0;
}
   
#nav ul a {
    text-decoration: none;
}
li {
	padding-top: 15px;
	padding-down: 15px;
}

#section {
    padding: 0;
    overflow: hidden;
}
body {
	margin: 0;
}

#mybtn {
	margin-bottom: 20px;
	height: 62px;
	padding-top: 20px;
}
</style>
</head>
<body>
	<spring:url value="/admin" var="homeFrame"></spring:url>
	<spring:url value="/admin" var="addSubject"></spring:url>
	<spring:url value="/admin" var="addParent"></spring:url>
	<spring:url value="/admin" var="addStudent"></spring:url>
	<spring:url value="/admin" var="addClass"></spring:url>
	<spring:url value="/admin" var="addTeacher"></spring:url>
	
<div class="container">  
  
<div id="nav">
<a id="mybtn" type="button" class="btn btn-primary btn-lg btn-block" href="addSubject" target="iframe_sub">Add Subject</a>
<a id="mybtn" type="button" class="btn btn-primary btn-lg btn-block" href="addParent" target="iframe_sub">Add Parent</a>
<a id="mybtn" type="button" class="btn btn-primary btn-lg btn-block" href="addStudent" target="iframe_sub">Add Student</a>
<a id="mybtn" type="button" class="btn btn-primary btn-lg btn-block" href="addClass" target="iframe_sub">Add Class</a>
<a id="mybtn" type="button" class="btn btn-primary btn-lg btn-block" href="addFaculty" target="iframe_sub">Add Faculty</a>

</div>

<div id="section">
  <iframe height="600px" width="100%" src="homeFrame" name="iframe_sub" style="margin: 0px; border: 0px "></iframe>
 </div>

</div>

</body>
</html>