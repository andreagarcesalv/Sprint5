package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Modelo.Iconexion.IcapacitacionesDAO;

public class CapacitacionImplDAO implements IcapacitacionesDAO {

	private Connection cn = null;
	
	  @Override public void create(Capacitacion c) { String sql =
	  "INSERT INTO capacitaciones2 (rut, fecha, hora, lugar, duracion, asistentes) VALUES (?,?,?,?,?,?);"
	  ; try { cn = Conexion.getConn(); PreparedStatement ppStm =
	  cn.prepareStatement(sql); ppStm.setString(1, c.getRutEmpresa());
	  ppStm.setString(2, c.getFechaCapacitacion()); ppStm.setString(3,
	  c.getHora()); ppStm.setString(4, c.getLugar()); ppStm.setString(5,
	  c.getDuracion()); ppStm.setInt(6, c.getCatidadAsistentes());
	  
	  if(!ppStm.execute()) { System.out.println("Registro Creado"); }else {
	  System.out.println("Registro fallo"); } ppStm.close(); } catch (SQLException
	  e) { e.printStackTrace(); }
	 
	
	
}
	
	@Override
	public List<Capacitacion> readAll() {
		String sql = "SELECT rut, fecha, hora, lugar, duracion, asistentes FROM capacitaciones2;";
		ArrayList<Capacitacion> todas = new ArrayList<Capacitacion>();
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				todas.add(new Capacitacion(rs.getString("rut"),rs.getString("fecha"),rs.getString("hora"),rs.getString("lugar"),rs.getString("duracion"),rs.getInt("asistentes")));
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return todas;
	}
	
	
	
	@Override
	public void delete(String rutEmpresa) {
		String sql = "DELETE FROM capacitaciones2 WHERE rut ="+rutEmpresa;
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
	public void update(Capacitacion c) {
		// TODO Auto-generated method stub
		
	}
}
