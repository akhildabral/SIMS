<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
	<style>
#time {
	color: yellow;
	font-size: 1000%;
	margin-bottom: 0px;
	margin-top: 0px;
}

#quote {
	color: #00CD00;
	font-size: 200%;
}

#user {
	margin-top: 100px;
	margin-bottom: 20px;
	color: #B53389;
	font-size: 300%;
}

#nav {
	color: white;
	height: 700px;
	text-align: center;
	padding: 20px;
	/* background-color: rgba(0, 0, 0, 0.6); */
}

/* #test {
	background-image: url(../images/welcomeNav.jpg);
	background-repeat: no-repeat;
	background-size: 100% 100%
} */

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
<div id="test">
<div id="nav">
<p style="font-size: 120%; color: green;">${msg}</p>
<p id=user>Welcome ${name} ${QWE}</p>
<p id=time></p>
<p id=quote>the OBSTACLE is the Path!</p>
</div>

<div id="section">
</div>
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

