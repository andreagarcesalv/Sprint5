<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 	<%@ page import="Modelo.*" %>
    <%@ page import="java.util.ArrayList" %>
    
    <!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<style type="text/css">
<%@ include file="Estilo.css" %>
</style>

<title>Insert title here</title>
</head>
<body>


<%@ include file="Menu2.jsp" %>

<div class="container mt-4 ">
<a class="btn btn-primary" href="Capacitaciones" role="button">Agregar Capacitacion</a>
	<table class="table" >
		<thead>
		<tr class="text-center">
			<th>Rut Empresa</th>
			<th>Fecha Capacitación</th>
			<th>Hora</th>
			<th>Lugar</th>
			<th>Duracion</th>
			<th>Cantidad de Asistentes</th>
		</tr>
		
		</thead>
		
		<tbody>
		<%
		ArrayList<Capacitacion> cpl = (ArrayList<Capacitacion>)request.getAttribute("ola");
		for(Capacitacion c: cpl){
		%>
		 <tr class="text-center">
		 	<td><%= c.getRutEmpresa() %></td>
		 	<td><%= c.getFechaCapacitacion() %></td>
		 	<td><%= c.getHora() %></td>
		 	<td><%= c.getLugar() %></td>
		 	<td><%= c.getDuracion() %></td>
		 	<td><%= c.getCatidadAsistentes() %></td>
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