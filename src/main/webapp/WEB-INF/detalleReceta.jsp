<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/styles.css">
<meta charset="UTF-8">
<title>Detalle recetas</title>
</head>
<body>
	<div class="Container">
	<h1>Detalle recetas</h1>
	<c:out value="${nombre}">
	<li> ${nombre}</li>
	</c:out>
	
	<ul>
	<c:if test="${ingredientes != null }">
	<c:forEach var="ingrediente" items="${ingredientes}">
	<li>${ingrediente}</li>
	</c:forEach></ul>
	</c:if>
	
	<c:if test="${ingredientes == null }">
	<p>La receta no se encuentra en nuestra lista</p>
	</c:if>
	</div>
</body>
</html>