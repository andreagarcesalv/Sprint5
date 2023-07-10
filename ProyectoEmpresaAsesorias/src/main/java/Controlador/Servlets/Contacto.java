package Controlador.Servlets;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Contacto extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Mostrar el formulario de contacto
        request.getRequestDispatcher("/vista.jsp/Contacto.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 request.getRequestDispatcher("/vista.jsp/Confirmacion.jsp").forward(request, response);
    	 
        String nombre = request.getParameter("nombre");
        System.out.println(nombre);
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String comentarios = request.getParameter("comentarios");
        // Llamar al método que despliega los datos ingresados a través de la consola de Java
        mostrarDatosIngresados(nombre, apellido, email, comentarios);
      }
    private void mostrarDatosIngresados(String nombre, String apellido, String email, String comentarios) {
        // Desplegar los datos ingresados a través de la consola de Java
        System.out.println("Datos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Comentarios: " + comentarios);
        
        
       
    }
}