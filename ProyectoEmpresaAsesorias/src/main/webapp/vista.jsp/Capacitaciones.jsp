<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<style type="text/css">
<%@ include file="Estilo.css" %>
</style>
<title>Capacitaciones</title>
</head>
<body>

<%@ include file="Menu2.jsp" %>

<br>
<div class="contenedor" >
<div class="row">
<div class ="col-12 ">
<form class= needs-validation id="formulario" action="CrearCapacitacion" method="post">
  <div class="row  mb-4">
    <div class="col">
      <div class="form-outline">
        <input name="rut" type="text" id="rut" class="form-control" required />
        <label class="form-label" for="rut">RUT de empresa</label>
      </div>
    </div>
    <div class="col">
      <div class="form-outline">
        <input name="fecha" type="text" id="fecha" class="form-control" required />
        <label class="form-label" for="fecha">Fecha capacitacion</label>
      </div>
    </div>
  </div>

  <!-- Text input -->
  <div class="form-outline mb-4">
    <input name="hora" type="text" id="hora" class="form-control" required />
    <label class="form-label" for="hora">Hora</label>
  </div>

  <!-- Text input -->
  <div class="form-outline mb-4">
    <input name="lugar" type="text" id="lugar" class="form-control" required/>
    <label class="form-label" for="lugar">Lugar</label>
  </div>

  <!-- Email input -->
  <div class="form-outline mb-4">
    <input name="duracion" type="text" id="duracion" class="form-control" required />
    <label class="form-label" for="duracion">Duracion</label>
  </div>

  <!-- Number input -->
  <div class="form-outline mb-4">
    <input name="asistentes" type="number" id="asistentes" class="form-control" required />
    <label class="form-label" for="asistentes">Cantidad de asistentes</label>
  </div>

<!-- 
  <div class="form-outline mb-4">
    <textarea class="form-control" id="form6Example7" rows="4"></textarea>
    <label class="form-label" for="form6Example7">Detalles de capacitacion</label>
  </div> -->

 
<button type="submit" class="btn btn-primary btn-block mb-4" href="ListarCapacitaciones">Enviar solicitud</button>
</form>
</div>
</div>
</div>
<br>
<br>
<br>
<%@ include file="Footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>

</body>
</html>






