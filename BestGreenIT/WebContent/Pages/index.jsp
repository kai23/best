<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title></title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width">

<link rel="stylesheet" href="../css/BootStrapCss/bootstrap.min.css">
<link rel="stylesheet" href="../css/JQuery/jquery-ui.css" />
<link rel="stylesheet"
	href="../css/BootStrapCss/bootstrap-responsive.min.css">
<link rel="stylesheet"
	href="../css/main.css">

</head>
<body>
	<!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->

	<!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->
	<div class="container">
		
		<div class="navbar navbar-inverse">
			<div class="navbar-inner">
				<div class="container">
					<div class="nav-collapse collapse">
						<!--<form method="POST" action="" class="navbar-form">-->
						<ul class="nav">
							<li class="dropdown"><a class="dropdown-toggle"
								data-toggle="dropdown" id="SelectCare">Voiture <b
									class="caret"></b></a>
								<ul id="search_vehicul" class="dropdown-menu">
									<li id="Renault"><a>Renault</a></li>
									<li id="Peugeot"><a>Peugeot</a></li>
									<li id="Citro�n"><a>Citro�n</a></li>
								</ul>
							</li>
							<li class="dropdown" >
							<span class="datepickerText">Begin Date:</span><input type="text" id="datepickerBegin" class="datepicker" size="10" class="hasDatepicker"/>
							</li>
							<li class="dropdown" >
							<span class="datepickerText">End Date:</span><input type="text" id="datepickerEnd" class="datepicker"  size="10" class="hasDatepicker"/>
							</li>
						</ul>
						<!--<button id="Search" type="submit" class="btn pull-right">Search</button>-->
						<!--</form>-->

					</div>
					<!--/.nav-collapse -->
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
</body>
<script>window.jQuery || document.write('<script src="../js/JQuery/jquery-1.8.3.min.js"><\/script>')</script>
<script src="../js/BootStrapJs/bootstrap.min.js"></script>
<script src="../js/DatePicker/datePicker.js"></script>
<script src="../js/ParameterBar/parameterBar.js"></script>
<script src="../js/ParameterBar/modernizr-2.6.2-respond-1.1.0.min.js"></script>
<script src="../js/JQuery/jquery-ui.js"></script>

</html>
