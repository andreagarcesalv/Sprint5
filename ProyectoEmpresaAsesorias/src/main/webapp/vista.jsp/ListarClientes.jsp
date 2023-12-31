<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ page import="Modelo.Cliente" %>
    <%@ page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<style type="text/css">
<%@ include file="Estilo.css" %>
</style>

<title>Lista Cliente</title>
</head>
<body>


<%@ include file="Menu2.jsp" %>

<div class="container mt-4 ">
<a class="btn btn-primary" href="EditarCliente" role="button">Agregar Usuario Cliente</a>
<a class="btn btn-primary" href="CrearProfesional" role="button">Agregar Usuario Profesional</a>
<a class="btn btn-primary" href="CrearAdministrativo" role="button">Agregar Usuario Administrativo</a>
	<table class="table" >
		<thead>
		<tr class="text-center">
			<th>Usuario</th>
			<th>Email</th>
			<th>Contraseña</th>
			<th>Nombres</th>
			<th>Apellidos</th>
			<th>Telefono</th>
			<th>AFP</th>
			<th>Sistema de Salud</th>
			<th>Direccion</th>
			<th>Comuna</th>
		</tr>
		
		</thead>
		
		<tbody>
		<%
		ArrayList<Cliente> rc = (ArrayList<Cliente>)request.getAttribute("a");
		for(Cliente c: rc){
		%>
		 <tr class="text-center">
		 	<td><%=c.getNombreUsuario()%></td>
		 	<td><%=c.getEmail() %></td>
		 	<td><%= c.getContrasenia() %></td>
			<td><%=c.getNombres() %></td>
		 	<td><%=c.getApellidos() %></td>
		 	<td><%= c.getTelefono() %></td>
			<td><%= c.getAfp() %></td>
		 	<td><%= c.getSistemaSalud()%></td>
		 	<td><%= c.getDireccion() %></td>
			<td><%= c.getComuna() %></td>
		 	
		 </tr>
		
		<%}
		%>
		</tbody>
	
	</table>

</div>
<br>
<br>
<br>
<%@ include file="Footer.jsp" %>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</html>
