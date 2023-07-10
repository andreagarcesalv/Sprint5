package Controlador.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import Modelo.Administrativo;
import Modelo.AdministrativoImplDAO;
import Modelo.Profesional;
import Modelo.ProfesionalImplDAO;


public class ListarAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ListarAdministrativo() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdministrativoImplDAO cp = new AdministrativoImplDAO();
		List<Administrativo> u = cp.readAll();
		
		
		  request.setAttribute("u", u);
		  getServletContext().getRequestDispatcher("/vista.jsp/ListarAdministrativo.jsp").
		  forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
