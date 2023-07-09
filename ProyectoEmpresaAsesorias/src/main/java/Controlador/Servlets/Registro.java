package Controlador.Servlets;

import java.io.IOException;

import Modelo.CrearUsuariosImplDAO;
import Modelo.RegistroUsuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Registro() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/vista.jsp/Registrar.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String contrasenia = request.getParameter("contrasenia");
		
		CrearUsuariosImplDAO c = new CrearUsuariosImplDAO();
		RegistroUsuario isabel = new RegistroUsuario();
		
		isabel.setNombreUsuario(nombre);
		isabel.setEmail(email);
		isabel.setContrasenia(contrasenia);
		
		c.create(isabel);
		RequestDispatcher e = request.getRequestDispatcher("Inicio");
		e.forward(request, response);
	}

}
