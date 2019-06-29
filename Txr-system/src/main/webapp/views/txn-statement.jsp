<!DOCTYPE html>
<%@page import="com.example.demo.model.Txn"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>account service</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body class="container">
	<hr />
	<h1>Txr - system</h1>
	<hr />

	<nav>
		<ul class="nav nav-pills">
			<li class="nav-item"><a class="nav-link" href="txr.htm">Transfer</a></li>
			<li class="nav-item"><a class="nav-link" href="txn-statement.htm">Statement</a></li>
		</ul>
	</nav>

	<hr />

	<div class="row">
		<div class="col-8 col-sm-6 col-md-10">
			<div class="card card-body">
				<table class="table table-sm table-bordered">
				<%
				List<Txn> list=(List<Txn>)request.getAttribute("allTxns");
				for(Txn txn:list){
				%>
				
				<tr>
					<td><%=txn.getId() %></td>
					<td>&#8377;<%=txn.getAmount() %></td>
					<td>&#8377;<%=txn.getClosingBalance() %></td>
					<td><%=txn.getLocalDateTime() %></td>
					<td><%=txn.getType() %></td>
				</tr>
				
				<%
				}
				%>
				
				</table>
				
			</div>
		</div>
	</div>


</body>
</html>










