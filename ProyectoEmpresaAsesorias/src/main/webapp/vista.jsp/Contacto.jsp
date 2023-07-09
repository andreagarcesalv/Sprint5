<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<head>
<meta charset="UTF-8">
<style type="text/css">
<%@ include file="Estilo.css" %>
</style>
<title>Contacto</title>
</head>
<body>

<%@ include file="Menu2.jsp" %>

<div class="container">
<div class="row">
<div class ="col-12 ">

<form action="Contacto" method="post">
<br>
<div class="mb-2">
  <label for="nombre" class="form-label">Nombre</label>
  <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
</div>
<div class="mb-2">
  <label for="apellido" class="form-label">Apellido</label>
  <input type="text" class="form-control" id="apellido" name="nombre" placeholder="Apellido">
</div>
<div class="mb-2">
<div class="mb-2">
  <label for="email" class="form-label">Email </label>
  <input type="email" class="form-control" id="email" name="email" placeholder="email">
</div >
  <label for="comentarios" class="form-label">Comentarios</label>
  <textarea class="form-control" id="comentarios" name="comentarios" rows="3"></textarea>
</div>
<button type="submit" class="btn btn-primary btn-block mb-4">Enviar</button>
</form>
</div>
</div>
</div>
<%@ include file="Footer.jsp" %>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</html>