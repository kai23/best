<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>

<!-- Le styles -->
<!-- Le styles -->
    <link href="../assets/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>
<link href="../css/bootstrapCss/bootstrap.css" rel="stylesheet">
<link href="../css/bootstrapCss/bootstrap-responsive.css" rel="stylesheet">

</head>
<body>
	<div class="container">
		<form class="form-signin">
			<h3 class="form-signin-heading">Create new account</h3>
			<div class="control-group">
				<label class="control-label" for="intputFirstName">First name</label>
				<div class="controls">
					<input type="text" id="intputFirstName" placeholder="First name">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="intputLastName">Last Name</label>
				<div class="controls">
					<input type="text" id="intputLastName" placeholder="Last name">
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<label class="radio inline"> <input type="radio" name="optionsRadios" id="optionsRadiosMale" value="male" checked>
						Male
					</label>
					<label class="radio inline"> <input type="radio" name="optionsRadios" id="optionsRadiosFemale" value="female">
						Female
					</label>
					</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputEmail">Email</label>
				<div class="controls">
					<input type="text" id="inputEmail" placeholder="Email">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputPassword">Password</label>
				<div class="controls">
					<input type="password" id="inputPassword" placeholder="Password">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputConfirmPassword">Confirm password</label>
				<div class="controls">
					<input type="password" id="inputConfirmPassword" placeholder="Confirm password">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputAddress">Address</label>
				<div class="controls">
					<input type="text" id="inputAddress" placeholder="Address">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputAddress2"> </label>
				<div class="controls">
					<input type="text" id="inputAddress2" placeholder="">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputZipCode">Zip code</label>
				<div class="controls">
					<input type="text" id="inputZipCode" placeholder="Zip code">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputCity">City</label>
				<div class="controls">
					<input type="text" id="inputCity" placeholder="City">
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button type="submit" class="btn btn-large btn-primary">Create new account</button>
				</div>
			</div>
		</form>
	</div>
	<!-- /container -->
</body>
</html>