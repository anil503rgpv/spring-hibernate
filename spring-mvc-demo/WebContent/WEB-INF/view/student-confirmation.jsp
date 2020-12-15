<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

the Student is confirmed : ${student.firstName} ${student.lastName}

<br>
Country : ${student.country}

<br>
Favorite Language : ${student.favoriteLanguage}

<br>
Operating System :

<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
		<li>${temp}</li>
	</c:forEach>
	
</ul>
</body>
</html>