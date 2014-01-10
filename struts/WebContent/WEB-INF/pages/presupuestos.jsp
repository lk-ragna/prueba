<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Presupuestos</title>

<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/bootstrap.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/style.css"/>
<!-- <link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/common1_1.css"/>-->
<script src="<%=request.getContextPath()%>/utils/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/utils/js/bootstrap.min.js"></script>

<script type="text/javascript">

	function updatePresupuesto(muestraPresupuesto){
		if(muestraPresupuesto){
			document.getElementById('homePresupuestos').style.display = 'none';
			document.getElementById('moduloPresupuestos').style.display = 'block';
			document.getElementById('showPresupuesto').style.display = 'none';
			document.getElementById('updatePresupuesto').style.display = 'block';
		}
		else{
			document.getElementById('homePresupuestos').style.display = 'block';
			document.getElementById('moduloPresupuestos').style.display = 'none';
			document.getElementById('showPresupuesto').style.display = 'block';
			document.getElementById('updatePresupuesto').style.display = 'none';
		}
	}
</script>

</head>

<body onload="updatePresupuesto(false)">
<div class="panel panel-primary">
  <!-- Default panel contents -->
  <div class="panel-heading">
		<h2 id="homePresupuestos">Home de reportes y presupuestos</h2>
		<h2 id="moduloPresupuestos">Modulo de Presupuestos (Actualizar Presupuestos)</h2>
  </div>
  <div class="panel-body">
		<!-- Muestra los datos de la organización y sus presuypuestos -->
		<div class="row" id="showPresupuesto">
		  <div class="col-md-12">
			<form class="form-inline" role="form">
				<table class="table">
					<!-- On rows -->
					<thead>
					<tr>
						<th>Bienvenido:</th>
						<th>Presupuesto asignado</th>
						<th>Presupuesto</th>
					    <th>Presupuesto disponible</th>
						<th>Presupuesto utilizado</th>
						<th>Reportes</th>										
					</tr>
					</thead>
			
					<!-- Se pegan todas las organizaciones y sus compradores mostrando su presupuesto -->
					<c:forEach var="i" begin="1" end="10">
					<tr>
				  		<td class="active">Organization: <c:out value="${i}"/></td>
					  	<td class="success">$<c:out value="${1000+i}"/>.00</td>
					  	<td><button type="button" class="btn btn-primary" onclick="updatePresupuesto(true)">Editar</button></td>
			  		    <td class="active">$<c:out value="${10*j}"/>.00</td>
				  	    <td class="success">$<c:out value="${3*j}"/>.00</td>
		 			    <td><button type="button" class="btn btn-info">Reporte</button></td>
					</tr>
					</c:forEach>
					<!-- Fin árbol organizaciones -->
			</table>
			</form>
		  </div>
		</div>
		<!-- Fin mistrar datos organización y su presupuesto -->
		
		<!-- Update presupuestos -->
		<div class="row" id="updatePresupuesto">
		  <div class="col-md-8">
			<form class="form-inline" role="form">
				<table class="table">
					<!-- On rows -->
					<thead>
					<tr>
						<th>Bienvenido:</th>
						<th>Presupuesto asignado</th>
						<th>Nuevo presupuesto</th>
					</tr>
					</thead>
			
					<!-- Se pegan todas las organizaciones y sus compradores mostrando su presupuesto -->
					<c:forEach var="i" begin="1" end="10">
					<tr>
				  		<td class="active">Organization: <c:out value="${i}"/></td>
					  	<td class="success">$<c:out value="${1000+i}"/>.00</td>
						<td class="warning"><input type="text" class="form-control" id="" placeholder="Nuevo presupuesto"></td>
					</tr>
					</c:forEach>
					<!-- Fin árbol organizaciones -->
			</table>
			</form>
		  </div>
		  
		  <div class="col-md-4">  
				<table class="table">
					<!-- On rows -->
					<thead>
					<tr>
						<th>Asignar nuevo presupuesto</th>
					</tr>
					</thead>
					
					<tr>
						<td><label>Monto asignado</label></td>
						<td><label>$</label></td>
					</tr>
					
					<tr>
						<td><label>Monto disponible</label></td>
						<td><label>$</label></td>
					</tr>
					
					<tr>
						<td><button type="button" class="btn btn-success">Actualizar presupuesto</button></td>
						<td><button type="button" class="btn btn-danger" onclick="updatePresupuesto(false)">Cancelar</button></td>
						<td></td>
					</tr>
				</table>
				
				<form class="form-inline" role="form">
					<table class="table">
						<!-- On rows -->
						<thead>
						<tr>
							<th>Balancear presupuesto</th>
						</tr>
						</thead>
				
						<tr><td>
							<div class="checkbox">
							    <input type="checkbox"> Balancear por organizaciones
							 </div>
						</td></tr>
						<tr><td>
							<div class="checkbox">
							    <input type="checkbox"> Balancear por compradores
							 </div>
						</td></tr>
						<tr>
							<td><button type="button" class="btn btn-success">Balancear presupuesto</button></td>
						</tr>
					</table>
				</form>
		  </div>
		</div>
		<!-- Fin update presupuesto -->
		
	</div>
</div>
</body>
</html>