<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Spring MVC Demo</title>
</head>
<body>
<h2>User1 Data</h2>
<form:form action="addUser1" modelAttribute="user1" method="POST">
<form:label path="name">Name</form:label>
<form:input path="name" /> <br><br>
<form:label path="id">Id</form:label>
<form:input path="id" />
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>
