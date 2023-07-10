package Controlador.Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Modelo.Cliente;
import Modelo.ClienteImplDAO;

public class CrearCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CrearCliente() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/vista.jsp/CrearCliente.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClienteImplDAO cap = new ClienteImplDAO();
	    Cliente rc = new Cliente();
		
	    /*int id = Integer.parseInt(request.getParameter("id"));
	    rc.setId(id);*/
		rc.setNombreUsuario(request.getParameter("nombreUsuario"));
		rc.setEmail(request.getParameter("email"));
		rc.setContrasenia(request.getParameter("contrasenia"));
		rc.setRut(request.getParameter("rut"));
		rc.setNombres(request.getParameter("nombres"));
		rc.setApellidos(request.getParameter("apellidos"));
		int telefono = Integer.parseInt(request.getParameter("telefono"));
	    rc.setTelefono(telefono);
		rc.setAfp(request.getParameter("afp"));
		rc.setSistemaSalud(request.getParameter("sistemaSalud"));
		rc.setDireccion(request.getParameter("direccion"));
		rc.setComuna(request.getParameter("comuna"));
		
	    
	    cap.create(rc);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("ListarCliente");
	    dispatcher.include(request, response);
		
		
		
		
		doGet(request, response);
	}

}
