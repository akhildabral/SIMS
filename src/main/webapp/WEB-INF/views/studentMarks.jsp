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
	margin-top:50px;
}

#nav {
    float: left;
    width: 30%;
    margin: 0;
    padding: 0;
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
</style>
</head>
<body>
	<spring:url value="/" var="studentExamMarks"></spring:url>
<div class="container">
  
<div id="nav">
  <ul>
  	<c:forEach items="${testName}" var="test">
    <li><a href="studentExamMarks" target="marksFrame">
    <button type="button" class="btn btn-success">${test.testName}</button>
    <input type='text' id='newfield' name='newfield' value="${test.testId}" />
    </a></li>
    </c:forEach> 
  </ul>
</div>

<div id="section">
 <iframe height="600px" width="100%" src="welcome" name="marksFrame" style="border:0;"></iframe>
 </div>

</div>

</body>
</html>