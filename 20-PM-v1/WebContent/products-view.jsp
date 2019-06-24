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
	<h1><a href="/PM">PM-v1</a></h1>
	<hr />

	<div class="card">
		<div class="card-header">All products</div>
		<div class="card-body">
			<table class="table table-sm table-bordered">
			<%
				List<Product> products = (List<Product>) request.getAttribute("products");
				for (Product product : products) {
			%>
			<tr>
				<td><%=product.getId() %></td>
				<td><%=product.getName() %></td>
				<td>&#8377;<%=product.getPrice() %></td>
				<td><%=product.getType() %></td>
				<td><a href>Edit</a></td>
				<td><a href>Delete</a></td>
			</tr>
			<%
				}
			%>
			</table>
		</div>
	</div>

</body>
</html>