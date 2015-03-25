<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BootStrap PlayGround</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="./bootstrap//dist/css/bootstrapValidator.min.css"
	type="text/css" />
<script type="text/javascript" src="./jquery.min.js"></script>
<script type="text/javascript" src="./bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="./bootstrap//dist/js/bootstrapValidator.min.js"></script>
<style type="text/css">
</style>
</head>
<body>
	<nav>
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
		</div>
	</nav>
	
		<div class="container">
		<div class="row"></div>
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-6 jumbotron">
				<h2 align="center">Log-in</h2>
				<div class="alert alert-warning" role="alert">Incorrect Credentials</div>
					<form class="form-horizontal" action="incorrectcredentialspage_login" method="POST">
                       
						<div class="form-group">
                            <label for="email" class="col-sm-2 control-label">Email</label>
                            <div class="col-sm-10">
                                <input type="email" name="email" class="form-control" id="email"
                                    placeholder="Email">
                            </div>
                        </div>
						
						<div class="form-group">
                            <label for="password" class="col-sm-2 control-label">Password</label>
                            <div class="col-sm-10">
                                <input type="password" name="password" class="form-control" id="password"
                                    placeholder="Password">
                            </div>
                        </div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label> <input type="checkbox"> Remember me
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Sign in</button>
							</div>
						</div>
					</form>
				</div>
				<div class="col-sm-3"></div>
			</div>
		</div>
</body>
</html>