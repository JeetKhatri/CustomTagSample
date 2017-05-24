<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>custom tag demo</title>
<%@ taglib uri="WEB-INF/mytags.tld" prefix="jeet"%>
</head>
<body>
current Time : <jeet:currentTime></jeet:currentTime><br/>
Cube of 4 is : <jeet:getCube number="4"></jeet:getCube><br/> <!-- use number because variable of this name is define in the cube class -->
<jeet:createLoop limit="5"><p>Jeet Khatri</p></jeet:createLoop>
</body>
</html>