<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/bootstrap.min.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/utils/css/datepicker.css" />
<script src="<%=request.getContextPath()%>/utils/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/utils/js/bootstrap.min.js"></script>

<fmt:setBundle basename="com.omx.bundle.labels"/>

<script type="text/javascript">
            
	</script>



<table class="table table-bordered" id="tableProducts">
	<thead>
		<tr class="success">
			<th><fmt:message key="rfc"/></th>
			<th><fmt:message key="buy"/></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${reportForm.usersReport}" var="row">
			<tr>
				<td>${row.sku}</td>
				<td>${row.description}</td>
			</tr>
		</c:forEach>
		
		
	</tbody>
</table>