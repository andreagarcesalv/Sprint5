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
<html>
<head>
    <title>Editar - Administrativo</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<%@ include file="Menu2.jsp" %>
<div class="container">
    <div class="card">
        <div class="card-body">
            <h2 class="card-title">Editar Usuario - Profesional</h2>
            <form action="CrearAdministrativo" method="post">
            
		
		
            <input type="hidden" name="proId" value="${form}" />
                <div class="form-group">
                    <label for="nombreUsuario"><i class="fa-solid fa-user"></i> Nombre Usuario</label>
                    <input class="form-control" id="nombreUsuario" type="text" name="nombreUsuario" required placeholder="Ingrese Rut de Cliente">
                </div>
                <div class="form-group">
                    <label for="email"><i class="fa-solid fa-user"></i> Email</label>
                    <input class="form-control" id="email" type="text" name="email" required placeholder="Ingrese Email">
                </div>
                <div class="form-group">
                    <label for="contrasenia"><i class="fa-solid fa-envelope"></i> Contraseña</label>
                    <input class="form-control" id="contrasenia" type="text" name="contrasenia" required placeholder="Ingrese su contraseña">
                </div>
                </div>
                <div class="form-group">
                    <label for="area"><i class="fa-solid fa-envelope"></i> Area de Trabajo</label>
                    <input class="form-control" id="area" type="text" name="area" required placeholder="Ingrese su Area de Trabajo">
                </div>
                <div class="form-group">
                    <label for="experiencia"><i class="fa-solid fa-envelope"></i> Experiencia Previa</label>
                    <input class="form-control" id="experiencia" type="text" name="experiencia" required placeholder="Ingrese su Experiencia Previa">
                </div>
                <button type="submit" class="btn btn-primary">Registrar</button>
            </form>
        </div>
    </div>
</div>

<%@ include file="Footer.jsp" %>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>