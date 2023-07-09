package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modelo.Iconexion.IusuarioDAO;

public class CrearUsuariosImplDAO implements IusuarioDAO{

	private Connection cn = null;
	
	  @Override 
	  public void create (RegistroUsuario ru) { 
		  String sql = "INSERT INTO usuarios2 (nombre, email, contraseña) VALUES (?,?,?);"; 
		  try { 
			  cn = Conexion.getConn(); 
			  PreparedStatement ppStm = cn.prepareStatement(sql);
			  ppStm.setString(1, ru.getNombreUsuario());
			  ppStm.setString(2, ru.getEmail()); 
			  ppStm.setString(3,ru.getContrasenia());
			  if(!ppStm.execute()) { 
				  System.out.println("Registro Creado"); 
			  }else {
				  System.out.println("Registro fallo"); 
				  } 
			  ppStm.close(); 
			  } catch (SQLException e) { e.printStackTrace(); }
	 
	
	
}
	
	@Override
	public List<RegistroUsuario> readAll() {
		String sql = "SELECT nombre, email, contraseña  FROM usuarios2;";
		ArrayList<RegistroUsuario> todas = new ArrayList<RegistroUsuario>();
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				todas.add(new RegistroUsuario(rs.getString("nombre"),rs.getString("email"),rs.getString("contraseña")));
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return todas;
	}
	
	
	
	@Override
	public void delete(int id) {
		String sql = "DELETE FROM usuarios2 WHERE id ="+id;
		try {
			cn=Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
}
