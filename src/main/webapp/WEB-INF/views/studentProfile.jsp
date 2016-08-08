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
  </style>
    
</head>
<body>

<div class="container-fluid">

  <div class="row" style="margin-top: 50px">
    <div class="col-md-2"> <blockquote class="blockquote-reverse" style="border-right: 0px; padding-right: 0px;"> Name </blockquote> </div>
    <div class="col-md-3"><input type="text" class="form-control input-lg" id="inputlg" value="${user.firstName}"></div>
	    <div class="col-md-3"><input type="text" class="form-control input-lg" id="inputlg" value="${user.lastName}"></div>
    <div class="col-md-4 " style="height: 195px; padding-left: 110px;"><img src="img.jpg" class="img-rounded" alt="Profile Photo" width="190px" height="190px"></div>
  </div>
  
    <div class="row">
    <div class="col-md-2" style="margin-top: -130px;"><blockquote class="blockquote-reverse" style="border-right: 0px; padding-right: 0px;"> Email </blockquote></div>
    <div class="col-md-6 disabled" style="margin-top: -130px; margin-left: 214px;"><input type="text" class="form-control input-lg" id="inputlg" value="${user.email}" disabled></div>
  </div>
  
    <div class="row">
    <div class="col-md-2" style="margin-top: -65px;"><blockquote class="blockquote-reverse" style="border-right: 0px; padding-right: 0px;"> Parent's Name </blockquote></div>
    <div class="col-md-6 disabled" style="margin-top: -65px; margin-left: 214px;"><input type="text" class="form-control input-lg" id="inputlg" value="${user.parent.firstName} ${user.parent.lastName}" disabled></div>
  </div>
  
    <div class="row">
    <div class="col-md-2"><blockquote class="blockquote-reverse" style="border-right: 0px; padding-right: 0px;"> Password </blockquote></div>
    <div class="col-md-6"><input type="password" class="form-control input-lg" id="inputlg" value="${user.password}"></div>
	<div class="col-md-4"><button type="button" class="btn btn-primary btn-block" style="padding-top: 10px; padding-bottom: 10px; height: 46px;">Upload</button></div>
  </div>
  
    <div class="row">
    <div class="col-md-2"><blockquote class="blockquote-reverse" style="border-right: 0px; padding-right: 0px;"> Phone </blockquote></div>
    <div class="col-md-10"><input type="text" class="form-control input-lg" id="inputlg" value="${user.phone}"></div>
  </div>
  
    <div class="row">
    <div class="col-md-2"><blockquote class="blockquote-reverse" style="border-right: 0px; padding-right: 0px;"> Class </blockquote></div>
    <div class="col-md-10 disabled"><input type="text" class="form-control input-lg" id="inputlg" value="${user.lecture.lectureName}" disabled></div>
  </div>
  
    <div class="row">
    <div class="col-md-2"><blockquote class="blockquote-reverse" style="border-right: 0px; padding-right: 0px;"> Subjects </blockquote></div>
    <div class="col-md-10">
    
	<c:forEach items="${subjects}" var="sub">
	    <div class="row">
    <div class="col-md-6 disabled"><input type="text" class="form-control input-lg" id="inputlg" value="${sub.subjectName}" disabled></div>
  </div><br>
	</c:forEach> 
	
	</div>
  </div>
  
    <div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-10"><button type="button" class="btn btn-primary btn-block" style="padding-top: 10px; padding-bottom: 10px; height: 46px;">Update</button></div>
    </div>
  
</div>

</body>
</html>

