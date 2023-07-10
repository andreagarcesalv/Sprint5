package Controlador.Servlets;

import java.io.IOException;
import java.util.List;

import Modelo.Profesional;
import Modelo.ProfesionalImplDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListarProfesional() {
        super();}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProfesionalImplDAO cp = new ProfesionalImplDAO();
		List<Profesional> u = cp.readAll();
		
		
		  request.setAttribute("u", u);
		  getServletContext().getRequestDispatcher("/vista.jsp/ListarProfesional.jsp").
		  forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
