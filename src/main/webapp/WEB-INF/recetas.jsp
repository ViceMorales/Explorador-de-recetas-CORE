<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recetas</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
<div class="Container">
	<h1>Lista de recetas</h1>
		<c:forEach var="lista" items="${listaRecetas}">
		<li> ${lista}</li>
		</c:forEach>
	</div>
</body>
</html>