<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Office Max</title>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/utils/css/style-login.css" />
		<script type="text/javascript" src="<%=request.getContextPath()%>/utils/js/jquery.js"></script>
		<script src="<%=request.getContextPath()%>/utils/js/modernizr-latest.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/utils/js/placeholder.js"></script>
	</head>
	<body>
		<form id="slick-login" method="post" action="j_security_check">
			<fmt:setBundle basename="com.omx.bundle.labels"/>
			<label for="username">
				<fmt:message key="user_name"/>
			</label>
			<input type="text" name="j_username" class="placeholder" placeholder="<fmt:message key="user_name"/>">
			<label for="password">
				<fmt:message key="user_password"/>
			</label>
			<input type="password" name="j_password" class="placeholder" placeholder="<fmt:message key="user_password"/>">
			<input type="submit" value="<fmt:message key="log_in"/>">
		</form>
	</body>
</html>