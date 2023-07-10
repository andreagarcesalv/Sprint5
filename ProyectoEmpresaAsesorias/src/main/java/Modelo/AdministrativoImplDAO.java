package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Modelo.Iconexion.IadministrativoDAO;

public class AdministrativoImplDAO implements IadministrativoDAO {
	private Connection cn = null;

	public void create(Administrativo ra) { String sql =
			  "INSERT INTO administrativos (nombreUsuario, email, contrasenia, area, experiencia) VALUES (?,?,?,?,?);"
			  ; try { cn = Conexion.getConn(); PreparedStatement ppStm =
			  cn.prepareStatement(sql); ppStm.setString(1, ra.getNombreUsuario());
			  ppStm.setString(2, ra.getEmail()); ppStm.setString(3,
			  ra.getContrasenia()); ppStm.setString(4, ra.getArea()); ppStm.setString(5,
			  ra.getExperienciaPrevia());
			  
			  if(!ppStm.execute()) { System.out.println("Registro Creado"); }else {
			  System.out.println("Registro fallo"); } ppStm.close(); } catch (SQLException
			  e) { e.printStackTrace(); }
		
		
	}

	@Override
	public List<Administrativo> readAll() {
		String sql = "SELECT nombreUsuario, email, contrasenia, area, experiencia FROM administrativos;";
		ArrayList<Administrativo> todas = new ArrayList<Administrativo>();
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				todas.add(new Administrativo(0, rs.getString("nombreUsuario"),rs.getString("email"),rs.getString("contrasenia"),rs.getString("area"),rs.getString("experiencia")));
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
		String sql = "DELETE FROM administrativos WHERE id ="+id;
		try {
			cn=Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void update(Administrativo ra) {
		
		String query = "UPDATE administrativos SET nombreUsuario= ?, email = ?, contrasenia = ?, area = ?, experiencia = ? WHERE id = ?;";
		try {
			cn=Conexion.getConn();
			
			PreparedStatement stm = cn.prepareStatement(query);
			stm.setString(1, ra.getNombreUsuario());
			stm.setString(2, ra.getEmail());
			stm.setString(3, ra.getContrasenia());
			stm.setString(4, ra.getArea());
			stm.setString(5, ra.getExperienciaPrevia());
			int fila = stm.executeUpdate();
			if (fila > 0) {
				System.out.println("Registro Actualizado con exito");
			}else {
				System.out.println("Problema al actualizar el registro");
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
