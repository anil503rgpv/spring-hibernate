<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>


<html>
<head>
	<title>Home</title>
</head>
<body>
		Welcome to spring security!!!!
		
		<hr>
		
			<p>
				User: <security:authentication property="principal.username"/>
				<br>
				<br>
				ROLE: <security:authentication property="principal.authorities"/>
			</p>
		<hr>
		<security:authorize access="hasRole('MANAGER')">
		<p>
			<a href="${pageContext.request.contextPath}/leaders ">Leadership meeting</a>
			(only for manager peeps)
		</p>
		</security:authorize>
		
		<security:authorize access="hasRole('ADMIN')">
		<p>
		
			<a href="${pageContext.request.contextPath}/systems ">It Admin meeting</a>
			(only for Admin peeps)
		</p>
		</security:authorize>
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		
			<input type="submit" value="Logout" />
			
		</form:form>
</body>
</html>