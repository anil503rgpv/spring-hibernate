<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Shivaanta</title>
	<style type="text/css">
		.failed{
			color: red;
		}
	</style>
</head>
<body>
		<h3>My Custom Login Page</h3>
		<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
		
		<c:if test="${param.error != null}">
			<i class="failed">Sorry! You enter invalid username/password</i>
		</c:if>
		
		<p>
		
			Username: <input type="text" name="username"/>
		
		</p>
		<p>
		
			Password: <input type="password" name="password"/>
		
		</p>
		
		<input type="submit" value="Login">
		</form:form>
</body>
</html>