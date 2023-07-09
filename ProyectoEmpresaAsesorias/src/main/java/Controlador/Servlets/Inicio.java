package Controlador.Servlets;

import jakarta.servlet.ServletException;
import Modelo.Conexion;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Inicio() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			Connection cn = Conexion.getConn();
			if (cn.isValid(1)) {
				System.out.println("Conexion valida");
			}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
			
	
		getServletContext().getRequestDispatcher("/vista.jsp/Inicio.jsp").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
