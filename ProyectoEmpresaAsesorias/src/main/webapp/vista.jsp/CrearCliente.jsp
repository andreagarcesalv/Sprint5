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
    <title>Crear Usuario - Cliente</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<%@ include file="Menu2.jsp" %>
<div class="container">
    <div class="card">
        <div class="card-body">
            <h2 class="card-title">Crear Usuario - Cliente</h2>
            <form action="Registro" method="post">
                <div class="form-group">
                    <label for="rut"><i class="fa-solid fa-user"></i> Rut:</label>
                    <input class="form-control" id="rut" type="text" name="rut" required placeholder="Ingrese Rut de Cliente">
                </div>
                <div class="form-group">
                    <label for="nombres"><i class="fa-solid fa-user"></i> Nombres:</label>
                    <input class="form-control" id="nombres" type="text" name="nombres" required placeholder="Ingrese Nombre">
                </div>
                <div class="form-group">
                    <label for="apellidos"><i class="fa-solid fa-user"></i> Apellidos:</label>
                    <input class="form-control" id="apellidos" type="text" name="apellidos" required placeholder="Ingrese Apellidos">
                </div>
                <div class="form-group">
                    <label for="telefono"><i class="fa-solid fa-envelope"></i> Teléfono:</label>
                    <input class="form-control" id="telefono" type="text" name="telefono" required placeholder="Ingrese su teléfono">
                </div>
                <div class="form-group">
                    <label for="afp"><i class="fa-solid fa-envelope"></i> AFP:</label>
                    <input class="form-control" id="afp" type="text" name="afp" required placeholder="Ingrese su AFP">
                </div>
                <div class="form-group">
                    <label for="sistemaSalud"><i class="fa-solid fa-key"></i> Sistema de Salud:</label>
                    <input class="form-control" type="text" name="sistemaSalud" id="sistemaSalud" required placeholder="Ingrese su Sistema de Salud">
                </div>
                <div class="form-group">
                    <label for="direccion"><i class="fa-solid fa-key"></i> Dirección:</label>
                    <input class="form-control" type="text" name="direccion" id="direccion" required placeholder="Ingrese su dirección">
                </div>
                <div class="form-group">
                    <label for="comuna"><i class="fa-solid fa-key"></i> Comuna:</label>
                    <input class="form-control" type="text" name="comuna" id="comuna" required placeholder="Ingrese su comuna">
                </div>
                <div class="form-group">
                    <label for="edad"><i class="fa-solid fa-key"></i> Edad:</label>
                    <input class="form-control" type="text" name="edad" id="edad" required placeholder="Ingrese su edad">
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
