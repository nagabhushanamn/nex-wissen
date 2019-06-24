<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="com.app.model.Product"%>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link href="./css/bootstrap.css" rel="stylesheet">
</head>
<body class="container">
	<hr />
	<h1>
		<a href="/PM">PM-v1</a>
	</h1>
	<hr />

	<div class="row">
		<div class="col-12 col-sm-8 col-md-6">
			<div class="card">
				<div class="card-header">Product Form</div>
				<div class="card-body">
					<form action="/PM/products/new" method="post">
						<div class="form-group">
							<label>Name</label>
							<input class="form-control" name="name">
						</div>
						<div class="form-group">
							<label>Price</label>
							<input class="form-control" name="price">
						</div>
						<div class="form-group">
							<label>Type</label>
							<select class="form-control" name="type">
								<option>ELEC</option>
								<option>OTHER</option>
							</select>
						</div>
						<button class="btn btn-primary">save</button>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>