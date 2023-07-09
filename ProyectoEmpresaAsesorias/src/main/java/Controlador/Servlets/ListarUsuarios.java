package Controlador.Servlets;

import java.io.IOException;
import java.util.List;

import Modelo.CrearUsuariosImplDAO;
import Modelo.RegistroUsuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListarUsuarios() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		CrearUsuariosImplDAO cu = new CrearUsuariosImplDAO();
		List<RegistroUsuario> u = cu.readAll();
		
		
		  request.setAttribute("u", u);
		  getServletContext().getRequestDispatcher("/vista.jsp/Listar_Usuarios.jsp").
		  forward(request, response);
		  		}	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
