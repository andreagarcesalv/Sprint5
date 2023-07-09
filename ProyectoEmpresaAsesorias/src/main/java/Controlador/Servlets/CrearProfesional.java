package Controlador.Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Modelo.Profesional;
import Modelo.ProfesionalImplDAO;

public class CrearProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CrearProfesional() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/vista.jsp/CrearProfesional.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfesionalImplDAO cap = new ProfesionalImplDAO();
	    Profesional rp = new Profesional();
		
	    int id = Integer.parseInt(request.getParameter("id"));
	    rp.setId(id);
		rp.setNombreUsuario(request.getParameter("nombreUsuario"));
		rp.setEmail(request.getParameter("email"));
		rp.setContrasenia(request.getParameter("contrasenia"));
		rp.setTitulo(request.getParameter("titulo"));
		rp.setFechaIngreso(request.getParameter("Ingreso"));
		
		
	    
	    cap.create(rp);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("ListarClientes");
	    dispatcher.include(request, response);
		
		doGet(request, response);
		
		
		
		
		doGet(request, response);
	}

}
