<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
<%@ include file="Estilo.css" %>
</style>
<script src="https://kit.fontawesome.com/f16caac2c6.js" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

<title>Registrar</title>
</head>
<body>

<%@ include file="Menu2.jsp" %>

<div class="contenedor">
    <div class="caja">
        <br>
        <h2>Crear una cuenta</h2>
        <form action="Registro" method="post">
            <div>
                <i class="fa-solid fa-user"></i>
                <input class="input" id="nombre" type="text" name="nombre"  required placeholder="Ingrese Nombre">
            </div>
            <div>
                <i class="fa-solid fa-envelope"></i>
                <input class="input" id="email" type="text" name="email" required placeholder="Ingrese su correo">
            </div>
            <div>
                <i class="fa-solid fa-key"></i>
                <input type="text" name="contrasenia" id="contrasenia" required placeholder="Ingrese su Contraseña">
            </div>
            <div class="form-group col-md-4">
                <button type ="submit">Registrar</button>
                <br>
                <br>
                <br>
            </div>
        </form>
    </div>
</div>

<%@ include file= "Footer.jsp" %>
</body>
</html>
         