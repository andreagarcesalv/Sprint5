package Controlador.Servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Login() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/vista.jsp/Login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		
		System.out.println(Email);
		System.out.println(Password);
		
		if(Email.equals("admin") && Password.equals("1234")) {
			System.out.println("Usuario y Contraseña Correctos");
			
			
			
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuarioSesion", Email);
			

			RequestDispatcher rd = request.getRequestDispatcher("Inicio");
			rd.forward(request, response);
			
		}else {
			System.out.println("Usuario y Contraseña Incorrectos");
			RequestDispatcher rd = request.getRequestDispatcher("/vistas/LoginError.jsp");
			rd.forward(request, response);
		}
		
		
	}
	
	}


