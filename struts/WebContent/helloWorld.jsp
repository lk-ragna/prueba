<<<<<<< HEAD
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>

<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/bootstrap.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/style.css"/>
<script src="<%=request.getContextPath()%>/utils/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/utils/js/bootstrap.min.js"></script>

<script type="text/javascript">

$(document).ready(function() {
        var posicion = $("#caja_flotante").offset();
	    var margenSuperior = 15;
	     $(window).scroll(function() {
	         if ($(window).scrollTop() > posicion.top) {
	             $("#caja_flotante").stop().animate({
	                 marginTop: $(window).scrollTop() - posicion.top + margenSuperior
	             });
	         } else {
	             $("#caja_flotante").stop().animate({
	                 marginTop: 0
	             });
	         };
	     });
});

</script>

</head>

<body>
<!-- 
<div id="caja_flotante">
    	<div id="cont_caja_flotante">
    		<h2>Presupuesto:</h2>
    		<a href="#"><img src="<%=request.getContextPath()%>/utils/icon/facebook.png" alt="facebook" /></a>
    		<a href="#"><img src="<%=request.getContextPath()%>/utils/icon/twitter.png" alt="twitter" /></a>
    	</div>
 </div>
-->
<div class="panel panel-primary">
  <!-- Default panel contents -->
  <div class="panel-heading">Panel heading</div>
  <div class="panel-body">
    

<table class="table table-bordered">
	<thead>
		<tr>
			<th>
				<html:link forward="presupuestos">Presupuestos</html:link>
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

<br />
<br />
<br /><br /><br /><br /><br /><br /><br />
<br /><br /><br /><br /><br /><br /><br />
<br /><br /><br /><br /><br /><br /><br />
<br /><br /><br /><br /><br /><br /><br />
<br /><br /><br /><br /><br /><br /><br />
=======
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ page import="com.omx.logic.Prueba" %>
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
            
            function reportLoad(){
            	var url = "<%=request.getContextPath()%>/userReport.do";
            	
            	$.ajax({
            		  type: "POST",
            		  url: url,
            		  data: "{parameter1=datoPorPost}",
            		  dataType: "html",
            		  success: function(data){
            			  $('#divPrueba').html(data);
            		  }
            		});
            	
            }
	</script>
</head>
<body>
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
					  <button type="button" class="btn btn-default" onclick="reportLoad();"><fmt:message key="product"/></button>
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

			
			<jsp:useBean id="prueba" class="com.omx.logic.Prueba" scope="request">
			</jsp:useBean>
			<div id="divPrueba"></div>
		</div>
>>>>>>> 6dc38fe33bec03f657fe36dedc6be116c4bb35aa

	</div>
	
</body>
</html>