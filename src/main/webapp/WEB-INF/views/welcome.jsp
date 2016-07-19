<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<title>Gigyasa</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link href="http://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/stylesheet/style.css"/>" />
	
	<style>
	td {
    padding-top: .5em;
    padding-bottom: .5em;
}
	</style>

</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#myPage"><span
					class="glyphicon glyphicon-home"></span></a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#about">ABOUT</a></li>
					<li><a href="#achievements">ACHIEVEMENTS</a></li>
					<li><a href="#fees">FEES</a></li>
					<li><a href="#contact">CONTACT</a></li>
					<li><a href="#myModal" data-toggle="modal"
						data-target="#myModal"><span
							class="glyphicon glyphicon-log-in"></span>LOGIN</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="jumbotron text-center">
		<h1>Gigyasa</h1>
		<p>where dreamers architect their dreams</p>
	</div>

	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content" style="margin-top: 100px">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Please fill the below fields</h4>
				</div>
				<form:form id="mysignin" action="" method="post">
					<div class="modal-body">
						<table id="myTable">
							<tr>
								<td width="100px">Email</td>
								<td><input class="textbox" id="email" name="email" placeholder="example@domain.com" type="email" style="width: 300px"></td>
							</tr>
							<tr>
								<td width="100px">Password</td>
								<td><input class="textbox" type="password" id="password" placeholder="Password" name="password" style="width: 300px"></td>
							</tr>
						</table>
					</div>
					
					<div class="modal-footer">
						<input type="submit" class="btn btn-default" name="login" value="Login">
					</div>
				</form:form>
			</div>
		</div>
	</div>

	<!-- Container (About Section) -->
	<div id="about" class="container-fluid">
		<div class="row">
			<h2>About us</h2>
			<br>
			<h4>A school is an institution designed to provide learning
				spaces and learning environments for the teaching of students under
				the direction of teachers.</h4>
			<p>In addition to these core schools, students in a given country
				may also attend schools before and after primary and secondary
				education. Kindergarten or pre-school provide some schooling to very
				young children (typically ages 3-5). University, vocational school,
				college or seminary may be available after secondary school. A
				school may also be dedicated to one particular field, such as a
				school of economics or a school of dance. Alternative schools may
				provide non traditional curriculum and methods.</p>
		</div>
	</div>

	<!-- Container (Achievements Section) -->
	<div id="achievements" class="container-fluid text-center">
		<h2>ACHIEVEMENTS</h2>
		<h4>What we have</h4>
		<br>
		<div class="row slideanim">
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-off logo-small"></span>
				<h4>POWER</h4>
				<!--  <p>Lorem ipsum dolor sit amet..</p> -->
			</div>
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-heart logo-small"></span>
				<h4>LOVE</h4>
			</div>
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-lock logo-small"></span>
				<h4>JOB DONE</h4>
			</div>
		</div>
		<br> <br>
		<div class="row slideanim">
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-leaf logo-small"></span>
				<h4>GREEN</h4>
			</div>
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-certificate logo-small"></span>
				<h4>CERTIFIED</h4>
			</div>
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-wrench logo-small"></span>
				<h4 style="color: #303030;">HARD WORK</h4>
			</div>
		</div>
	</div>

	<!-- Container (Fees Section) -->
	<div id="fees" class="container-fluid">
		<div class="text-center">
			<h2>Fees</h2>
			<h4>And this amount we take</h4>
		</div>
		<div class="row slideanim">
			<div class="col-sm-4 col-xs-12">
				<div class="panel panel-default text-center">
					<div class="panel-heading">
						<h1>Primary</h1>
					</div>
					<div class="panel-body">
						<p>
							<strong>Tution</strong> $100
						</p>
						<p>
							<strong>Session</strong> $40
						</p>
						<p>
							<strong>Sports</strong> $5
						</p>
						<p>
							<strong>Lab</strong> $15
						</p>
						<p>
							<strong>Transport</strong> $20
						</p>
					</div>
					<div class="panel-footer">
						<h3>$180</h3>
						<h4>per month</h4>
					</div>
				</div>
			</div>
			<div class="col-sm-4 col-xs-12">
				<div class="panel panel-default text-center">
					<div class="panel-heading">
						<h1>Secondary</h1>
					</div>
					<div class="panel-body">
						<p>
							<strong>Tution</strong> $200
						</p>
						<p>
							<strong>Session</strong> $50
						</p>
						<p>
							<strong>Sports</strong> $5
						</p>
						<p>
							<strong>Lab</strong> $15
						</p>
						<p>
							<strong>Transport</strong> $20
						</p>
					</div>
					<div class="panel-footer">
						<h3>$290</h3>
						<h4>per month</h4>
					</div>
				</div>
			</div>
			<div class="col-sm-4 col-xs-12">
				<div class="panel panel-default text-center">
					<div class="panel-heading">
						<h1>Senior Secondary</h1>
					</div>
					<div class="panel-body">
						<p>
							<strong>Tution</strong> $300
						</p>
						<p>
							<strong>Session</strong> $60
						</p>
						<p>
							<strong>Sports</strong> $5
						</p>
						<p>
							<strong>Lab</strong> $15
						</p>
						<p>
							<strong>Transport</strong> $20
						</p>
					</div>
					<div class="panel-footer">
						<h3>$400</h3>
						<h4>per month</h4>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Container (Contact Section) -->
	<div id="contact" class="container-fluid">
		<h2 class="text-center">CONTACT</h2>
		<div class="row">
			<div class="col-sm-5">
				<p>Contact us and we'll get back to you within 24 hours.</p>
				<p>
					<span class="glyphicon glyphicon-map-marker"></span> Chicago, US
				</p>
				<p>
					<span class="glyphicon glyphicon-phone"></span> +00 1515151515
				</p>
				<p>
					<span class="glyphicon glyphicon-envelope"></span> info@gigyasa.com
				</p>
			</div>
			<div class="col-sm-7 slideanim">
				<div class="row">
					<div class="col-sm-6 form-group">
						<input class="form-control" id="name" name="name"
							placeholder="Name" type="text" required>
					</div>
					<div class="col-sm-6 form-group">
						<input class="form-control" id="email" name="email"
							placeholder="Email" type="email" required>
					</div>
				</div>
				<textarea class="form-control" id="comments" name="comments"
					placeholder="Comment" rows="5"></textarea>
				<br>
				<div class="row">
					<div class="col-sm-12 form-group">
						<button class="btn btn-default pull-right" type="submit">Send</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<footer class="container-fluid text-center"
		style="background-color: #e4e4e4;">
		<a href="#myPage" title="To Top"> <span
			class="glyphicon glyphicon-chevron-up"></span>
		</a>
		<p>
			Theme Made By <a href="http://www.gigyasa.com" title="Visit Gigyasa">www.gigyasa.com</a>
		</p>
	</footer>

	<script>
		$(document).ready(
				function() {
					// Add smooth scrolling to all links in navbar + footer link
					$(".navbar a, footer a[href='#myPage']").on('click',
							function(event) {
								// Make sure this.hash has a value before overriding default behavior
								if (this.hash !== "") {
									// Prevent default anchor click behavior
									event.preventDefault();

									// Store hash
									var hash = this.hash;

									// Using jQuery's animate() method to add smooth page scroll
									// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
									$('html, body').animate({
										scrollTop : $(hash).offset().top
									}, 900, function() {

										// Add hash (#) to URL when done scrolling (default click behavior)
										window.location.hash = hash;
									});
								} // End if
							});

					$(window).scroll(function() {
						$(".slideanim").each(function() {
							var pos = $(this).offset().top;

							var winTop = $(window).scrollTop();
							if (pos < winTop + 600) {
								$(this).addClass("slide");
							}
						});
					});
				})
	</script>

</body>
</html>

