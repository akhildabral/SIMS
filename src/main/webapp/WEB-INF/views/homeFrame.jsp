<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
	<style>
#time {
	color: #f4511e;
	font-size: 150px;
	margin-bottom: 0px;
	margin-top: 0px;
}

#quote {
	color: #00CD00;
	font-size: 40px;
}

#user {
	margin-top: 50px;
	margin-bottom: 20px;
	color: #B53389;
	font-size: 60px;
}

#nav {
	color: white;
	text-align: center;
	padding: 20px;
}

body {
	margin: 0px;
}
p{
text-transform: capitalize;
font-variant: small-caps;
}
	</style>
</head>

<body onload="init();">

<div id="nav">

<p id=user>Welcome ${displayName}</p>
<p id=time></p>
<p id=quote>the OBSTACLE is the Path!</p>
</div>



</body>

<script type=text/javascript>

function init()
{
    updateTime();
    window.setInterval(updateTime,100);
}

function updateTime()
{
    var time = document.getElementById('time');
    time.innerText = new Date().toLocaleTimeString();
}

</script>
</html>

