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

</body>
</html>