<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/addCliente" method="post">
		<table>
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nomCliente"></td>
			</tr>
			<tr>
				<td>Apellido</td>
				<td><input type="text" name="apeCliente"></td>
			</tr>
			<tr>
				<td>Credito</td>
				<td><input type="text" name="creditoCliente"></td>
			</tr>
			<tr>
				<td>Sexo</td>
				<td>
					<select name="sexoCliente">
						<option value="Masculino">Masculino</option>
						<option value="Femenino">Femenino</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Grabar">
				</td>
			</tr>
		</table>
	
	
	</form>
</body>
</html>