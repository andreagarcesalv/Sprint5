package Controlador.Servlets;

import java.io.IOException;

import Modelo.Administrativo;
import Modelo.AdministrativoImplDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class CrearAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CrearAdministrativo() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/vista.jsp/CrearAdministrativo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdministrativoImplDAO cap = new AdministrativoImplDAO();
	    Administrativo ra = new Administrativo();
		
	    /*int id = Integer.parseInt(request.getParameter("id"));
	    ra.setId(id)*/
		ra.setNombreUsuario(request.getParameter("nombreUsuario"));
		ra.setEmail(request.getParameter("email"));
		ra.setContrasenia(request.getParameter("contrasenia"));
		ra.setArea(request.getParameter("area"));
		ra.setExperienciaPrevia(request.getParameter("experiencia"));
		
		String nombreUsuario = request.getParameter("nombreUsuario");
		System.out.println(nombreUsuario);
		
		
	    cap.create(ra);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("ListarAdministrativo");
	    dispatcher.include(request, response);
		
		doGet(request, response);
	}

}
