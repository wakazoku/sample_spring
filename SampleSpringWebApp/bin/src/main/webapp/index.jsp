<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<h1>Sample page</h1>
	<pre>${samplebean}</pre>
	<form action="sample" method="post">
		<input type="text" id="message" name="message">
		<input type="submit" value="add">
	</form>
</body>
</html>
