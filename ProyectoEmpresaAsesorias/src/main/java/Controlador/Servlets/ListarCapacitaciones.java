package Controlador.Servlets;

import java.io.IOException;
import java.util.List;

import Modelo.Capacitacion;
import Modelo.CapacitacionImplDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListarCapacitaciones() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		
		CapacitacionImplDAO cap = new CapacitacionImplDAO();
		List<Capacitacion> ola = cap.readAll();
		
		
		  request.setAttribute("ola", ola);
		  getServletContext().getRequestDispatcher("/vista.jsp/ListarCapacitaciones.jsp").
		  forward(request, response);
		 
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
