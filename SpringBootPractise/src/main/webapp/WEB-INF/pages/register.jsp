<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
	<form:form action="customer"  modelAttribute="customer">
    	<table>
    		<th colspan="3">
    		</th>
    		<tr>
    			<td>First Name :</td>
    			<td><form:input type="text" path="firstName"/></td>
    		</tr>
    		<tr>
    			<td>Last Name:</td>
    			<td><form:input type="text" path="lastName"/></td>
    		</tr>
    		<tr>
    			<td></td>
    			<td><input type="submit" name="save" value="save"/></td>
    		</tr>
    		
    	</table>
    </form:form>
</body>
</html>