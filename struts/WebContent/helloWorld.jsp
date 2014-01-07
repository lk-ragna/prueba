<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Hello World</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/bootstrap.min.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/datepicker.css" />
	<script src="<%=request.getContextPath()%>/utils/js/jquery.js"></script>
	<script src="<%=request.getContextPath()%>/utils/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/utils/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                
            	$('.calendar-input').datepicker({
                    format: "dd/mm/yyyy"
                });  
            
            });
	</script>
</head>
<body>
	<!--<bean:write name="helloWorldForm" property="message" />-->
	<div>
		<img alt="Office Max" src="<%=request.getContextPath()%>/utils/images/logo.png">
	</div>
	<div style="clear: both;"></div>
	<fmt:setBundle basename="com.omx.bundle.labels"/>
	<br />

	<div class="panel panel-success">
		<div class="panel-heading">
			<h1 style="text-align: center;"><fmt:message key="title_consumer_report"/></h1>
		</div>
		<div class="panel-body">
			<h3 style="text-align: center;"><fmt:message key="search_criteria"/></h3>
			<div class="row">
				<div class="col-md-2"></div>
				<div class="col-md-2"><h3><fmt:message key="period"/></h3></div>
				<div style="clear: both"></div>
				<div class="col-md-4"><fmt:message key="initial_date"/></div>
				<div class="col-md-4"><fmt:message key="final_date"/></div>
				<div style="clear: both"></div>
				<div class="col-md-4">
	                <input class="calendar-input" type="text" placeholder="<fmt:message key="initial_date"/>"  id="example1">
	            </div>
	            <div class="col-md-4">
	                <input class="calendar-input" type="text" placeholder="<fmt:message key="initial_date"/>"  id="example1">
	            </div>
	            <div style="height:50px; clear: both"></div>
	            <div class="col-md-4">
	                <div class="btn-group-vertical">
					  <button type="button" class="btn btn-default"><fmt:message key="product"/></button>
					  <button type="button" class="btn btn-default"><fmt:message key="rfc"/></button>
					  <button type="button" class="btn btn-default"><fmt:message key="price_center"/></button>
					  <button type="button" class="btn btn-default"><fmt:message key="for_user"/></button>
					  <button type="button" class="btn btn-default"><fmt:message key="For_delivery_address"/></button>
					</div>
						                
	            </div>
	            <div class="col-md-4">
	            	<button type="button" class="btn btn-primary"><fmt:message key="search"/></button>
	            </div>
			</div>
			<div style="height:50px; clear: both"></div>
			<div style="clear: both"></div>

			<table class="table table-bordered">
				<thead>
					<tr class="success">
						<th><fmt:message key="sku"/></th>
						<th><fmt:message key="description"/></th>
						<th><fmt:message key="price"/></th>
						<th><fmt:message key="total"/></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>columna 1</td>
						<td>columna 2</td>
						<td>columna 3</td>
						<td>columna 4</td>
					</tr>
					<tr>
						<td>columna 1</td>
						<td>columna 2</td>
						<td>columna 3</td>
						<td>columna 4</td>
					</tr>
					<tr>
						<td>columna 1</td>
						<td>columna 2</td>
						<td>columna 3</td>
						<td>columna 4</td>
					</tr>
					<tr>
						<td>columna 1</td>
						<td>columna 2</td>
						<td>columna 3</td>
						<td>columna 4</td>
					</tr>
					<tr>
						<td>columna 1</td>
						<td>columna 2</td>
						<td>columna 3</td>
						<td>columna 4</td>
					</tr>
				</tbody>
			</table>
		</div>

	</div>

</body>
</html>