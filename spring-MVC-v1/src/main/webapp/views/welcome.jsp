<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring MVC</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
</head>
<body class="container">

	<hr />
	<h1>spring MVC</h1>
	<hr />
	
	<div class="alert alert-info">
		${message} <!--  JSP EL --> 
		<hr/>
		<%=request.getAttribute("message") %>
	</div>	

</body>
</html>