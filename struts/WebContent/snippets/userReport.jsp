<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<fmt:setBundle basename="com.omx.bundle.labels"/>
<table class="table table-bordered">
	<thead>
		<tr class="success">
			<th><fmt:message key="sku"/></th>
			<th><fmt:message key="description"/></th>
			<th><fmt:message key="quantity"/></th>
			<th><fmt:message key="price"/></th>
			<th><fmt:message key="total"/></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${reportForm.usersReport}" var="row">
			<tr>
				<td>${row.sku}</td>
				<td>${row.description}</td>
				<td>${row.quantity}</td>
				<td>${row.price}</td>
				<td>${row.total}</td>
			</tr>
		</c:forEach>
		
		
	</tbody>
</table>