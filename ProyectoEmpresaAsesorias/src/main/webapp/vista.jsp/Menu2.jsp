<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>




   <%
  String usuario = (String) session.getAttribute("usuarioSesion");
  if (usuario == null) {
%>
    <nav class="navbar navbar-expand-lg text-danger" style="background-color: #011627">
      <div class="container-fluid">
        <div class="collapse navbar-collapse">
          <ul class="navbar-nav mx-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" style="color:#EDF2F4" aria-current="page" href="Inicio">Inicio</a>
            </li>
          </ul>
          <button type="submit" class="button" onclick="location.href='http://localhost:8080/ProyectoEmpresaAsesorias/Login'"> 
            <span class="button-content">Iniciar Sesión</span>
          </button>
        </div>
      </div>
    </nav>
<%
  } else {
%>
    <nav class="navbar navbar-expand-lg text-danger" style="background-color: #011627">
  <div class="container-fluid">
    <div class="collapse navbar-collapse">
      <ul class="navbar-nav mx-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" style="color:#EDF2F4" aria-current="page" href="Inicio">Inicio</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" style="color:#EDF2F4" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Capacitaciones
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="Capacitaciones">Crear Capacitaciones</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="ListarCapacitaciones">Listar Capacitaciones</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" style="color:#EDF2F4" href="#" id="navbarDropdownUsuarios" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Usuarios
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdownUsuarios">
            <li><a class="dropdown-item" href="Registro">Crear Usuario</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="CrearCliente">Crear usuario tipo Cliente</a></li>
            <li><hr class="dropdown-divider"></li>
             <li><a class="dropdown-item" href="CrearProfesional">Crear usuario tipo Profesional</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="CrearAdministrativo">Crear usuario tipo Administrativo</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="ListarUsuarios">Listar Usuarios</a></li>
            <li><hr class="dropdown-divider"></li>        
            <li><a class="dropdown-item" href="ListarProfesional">Listar Profesional</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="ListarAdministrativo">Listar Administrativo</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="ListarCliente">Listar Clientes</a></li>
            <li><hr class="dropdown-divider"></li>            
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link" style="color:#EDF2F4" href="Contacto">Contacto</a>
        </li>
      </ul>
      <button type="submit" class="button" onclick="location.href='http://localhost:8080/ProyectoEmpresaAsesorias/LogOut'"> 
        <span class="button-content">Cerrar Sesión</span>
      </button>
    </div>
  </div>
</nav>

<%
  }
%>



