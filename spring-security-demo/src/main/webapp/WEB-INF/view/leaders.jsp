<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>


<html>
<head>
	<title>Home</title>
</head>
<body>
		<h2>Welcome to Leader Home Page</h2>
		
		<hr>
		
			<p>
				See you in Bhopal.... For annual leadership retreat
			</p>
		<hr>
		
		
		
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		
			<input type="submit" value="Logout" />
			
		</form:form>
</body>
</html>