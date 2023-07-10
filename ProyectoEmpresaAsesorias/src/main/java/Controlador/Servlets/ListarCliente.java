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
import Modelo.Cliente;
import Modelo.ClienteImplDAO;


public class ListarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ListarCliente() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ClienteImplDAO cp = new ClienteImplDAO();
		List<Cliente> a = cp.readAll();
		
		
		  request.setAttribute("a", a);
		  getServletContext().getRequestDispatcher("/vista.jsp/ListarClientes.jsp").
		  forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
