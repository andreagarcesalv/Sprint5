<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
<%@ include file="Estilo.css" %>
</style>
<script src="https://kit.fontawesome.com/f16caac2c6.js" crossorigin="anonymous"></script>

<title>Login</title>
</head>
<body>


<div class="contenedor">
<div class="caja">



	<h2>Inicio de Sesión</h2>
	<form action="Login" method="post">
	
	
   
  
	
	<div >
	    <i class="fa-solid fa-envelope"></i>
		<input class= "input"type="text" name="email" required="" placeholder="Ingrese su Usuario" autocomplete="off">
		
	
	</div>
	
	<div >
	    <i class="fa-solid fa-key"></i>
		<input type="password" name="password" required="" placeholder="Ingrese su Contraseña" autocomplete="off">
		
	</div>	
	
	<button type="submit">Ingresar</button>
	<br>
	<br>
     <span>¿Aún no tienes cuenta?</span>
    <br>
		<a href="Registro">Regístrate Aquí
	
		<span></span>
		<span></span>
		<span></span>
		
		
		</a>
	
	
	</form>

	
</div>
</div>

</body>
</html>