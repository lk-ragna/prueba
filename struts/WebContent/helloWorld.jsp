<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/bootstrap.min.css"/>
<script src="<%=request.getContextPath()%>/utils/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/utils/js/bootstrap.min.js"></script>
</head>
<body>
<bean:write name="helloWorldForm" property="message"/>
<br/>

<div class="panel panel-primary">
  <!-- Default panel contents -->
  <div class="panel-heading">Panel heading</div>
  <div class="panel-body">
    

<table class="table table-bordered">
	<thead>
		<tr>
			<th>
				columna 1
			</th>
			<th>
				columna 2
			</th>
			<th>
				columna 3
			</th>
			<th>
				columna 4
			</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
				columna 1
			</td>
			<td>
				columna 2
			</td>
			<td>
				columna 3
			</td>
			<td>
				columna 4
			</td>
		</tr>
		<tr>
			<td>
				columna 1
			</td>
			<td>
				columna 2
			</td>
			<td>
				columna 3
			</td>
			<td>
				columna 4
			</td>
		</tr>
		<tr>
			<td>
				columna 1
			</td>
			<td>
				columna 2
			</td>
			<td>
				columna 3
			</td>
			<td>
				columna 4
			</td>
		</tr>
		<tr>
			<td>
				columna 1
			</td>
			<td>
				columna 2
			</td>
			<td>
				columna 3
			</td>
			<td>
				columna 4
			</td>
		</tr>
		<tr>
			<td>
				columna 1
			</td>
			<td>
				columna 2
			</td>
			<td>
				columna 3
			</td>
			<td>
				columna 4
			</td>
		</tr>
	</tbody>
</table>
  </div>
  
  </div>

</body>
</html>