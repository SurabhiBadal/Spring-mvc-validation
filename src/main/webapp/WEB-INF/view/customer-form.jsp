<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Csutomer Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>

	<form:form action="processFrom" modelAttribute="customer">

First Name :<form:input path="firstName" />
		<br>
		<br>

Last Name : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<br>
		
		Free Passes : <form:input path="freepases" />
		<form:errors path="freepases" cssClass="error"></form:errors>
		<br>
		<br>
		PostalCode: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="Submit">

	</form:form>

</body>
</html>