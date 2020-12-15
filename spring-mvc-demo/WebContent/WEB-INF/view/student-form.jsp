<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br> <br>
		Last Name: <form:input path="lastName"/>
		<br> <br>
		Country : <form:select path="country">
			<form:options items="${student.countryOption}"/>
			
		</form:select>
		<br> <br>
		
		Favorite Language: 
		
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		<br> <br>
		
		Operating System work on.
		
		Windows <form:checkbox path="operatingSystem" value="Windows"/>
		Unix <form:checkbox path="operatingSystem" value="Unix"/>
		
		<br> <br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>