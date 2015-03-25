<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="WebApp">
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
<script src="./angular/angular/angular.min.js"></script>
<script src="./ui-bootstrap-tpls-0.12.1.min.js"></script>
<script src="./controllers.js"></script>
<style type="text/css">
</style>
</head>
<body>
	<nav>
	<div class="container">
		<div class="row">
			<div class="col-sm-2">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">WebSiteName</a>
				</div>
			</div>
			<div class="col-sm-6">
				<form class="navbar-form">
					<div class="input-group" style="width: 100%;"
						ng-controller="SearchCtrl">

						<input type="text" ng-model="asyncSelected"
							placeholder="Search .."
							typeahead="result for result in getResults($viewValue)"
							typeahead-loading="loadingLocations" class="form-control"
							typeahead-min-length='3'> <i ng-show="loadingLocations"
							class="glyphicon glyphicon-refresh"></i>
					</div>
				</form>
			</div>

			<div class="col-sm-4">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-expanded="false"><%=session.getAttribute("email") %>
							<span class="caret"></span> </a>
						<ul class="dropdown-menu" role="menu">
							<li class="divider"></li>
							<li><a href="#">Profile</a></li>
							<li class="divider"></li>
							<li><a href="#">Logout</a></li>
							<li class="divider"></li>
						</ul></li>
				</ul>
			</div>

		</div>
	</div>
	</nav>

	<div class="container">
		<div class="row">

			<div class="col-sm-10">

				<div class="row">
					<div class="col-sm-3">
						<div class=" panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">Panel title</h3>
							</div>
							<div class="panel-body">Panel content</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class=" panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">Panel title</h3>
							</div>
							<div class="panel-body">Panel content</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class=" panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">Panel title</h3>
							</div>
							<div class="panel-body">Panel content</div>
						</div>
					</div>


				</div>
				<div class="row">
					<div class="col-sm-3">
						<div class=" panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">Panel title</h3>
							</div>
							<div class="panel-body">Panel content</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class=" panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">Panel title</h3>
							</div>
							<div class="panel-body">Panel content</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class=" panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">Panel title</h3>
							</div>
							<div class="panel-body">Panel content</div>
						</div>
					</div>


				</div>

			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
	<div class="row"></div>
	</div>
	</div>
</body>
</html>