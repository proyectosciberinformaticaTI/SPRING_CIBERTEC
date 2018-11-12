<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="boot/js/jquery.min.js"></script>
<script type="text/javascript" src="boot/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="boot/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="boot/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="boot/css/bootstrap.css"/>
<link rel="stylesheet" href="boot/css/dataTables.bootstrap.min.css"/>
</head>
<body>
<h3>Listado de Clientes</h3>
	<a href="/nuevoCliente">Nuevo Cliente</a>
	<div class="container">
	<table id="id_table" class="table table-striped table-bordered" >
	 <thead>
		<tr>
			<th>Código</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Credito</th>
			<th>Sexo</th>
			<th></th>
			<th></th>
		</tr>
	 </thead>	
		<c:forEach items="${listCliente}" var="fila">
			<tr>
				<td>${fila.codCliente}</td>
				<td>${fila.nomCliente}</td>
				<td>${fila.apeCliente}</td>
				<td>${fila.creditoCliente}</td>
				<td>${fila.sexoCliente}</td>
				<td><a href="/editCliente/${fila.codCliente}">Editar</a></td>
				<td><a href="/deleteCliente/${fila.codCliente}">Eliminar</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	
	
</body>
</html>