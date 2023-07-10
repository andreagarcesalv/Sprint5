package Controlador.Servlets;

import java.io.IOException;

import Modelo.Capacitacion;
import Modelo.CapacitacionImplDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CrearCapacitacion() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/vista.jsp/Capacitaciones.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CapacitacionImplDAO cap = new CapacitacionImplDAO();
	    Capacitacion c = new Capacitacion();
	    
	    c.setRutEmpresa(request.getParameter("rut"));
	    c.setFechaCapacitacion(request.getParameter("fecha"));
	    c.setHora(request.getParameter("hora"));
	    c.setLugar(request.getParameter("lugar"));
	    c.setDuracion(request.getParameter("duracion"));
	    int asistentes = Integer.parseInt(request.getParameter("asistentes"));
	    c.setCatidadAsistentes(asistentes);
	    
	    cap.create(c);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("ListarCapacitaciones");
	    dispatcher.include(request, response);

		doGet(request, response);
	}

}
