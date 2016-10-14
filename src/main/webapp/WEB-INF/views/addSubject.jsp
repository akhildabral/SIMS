<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <link href="<c:url value="/*" />">
  
  <style>
  blockquote .blockquote-reverse, blockquote.pull-right {
  border-right: 0px; padding-right: 0px;
  }
  input{
  text-transform: uppercase;
  }
  #nav {
  	padding: 30px;
  }
  </style>
    
</head>
<body>
<div class="container-fluid">
<div id="nav">
	<div class="row">
    <div class="col-md-2"><blockquote class="blockquote-reverse" style="border-right: 0px; padding-right: 0px;"> Subject Name </blockquote></div>
    <div class="col-md-10"><input type="text" class="form-control input-lg" id="inputlg"></div>
  	</div>
      <div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-10"><button type="button" class="btn btn-primary btn-block" style="padding-top: 10px; padding-bottom: 10px; height: 46px;">Add Record</button></div>
    </div>
</div>
</div>
</body>
</html>