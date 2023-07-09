package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import Modelo.Iconexion.IprofesionalDAO;

public class ProfesionalImplDAO implements IprofesionalDAO {

		private Connection cn = null;

		public void create(Profesional rp) { String sql =
				  "INSERT INTO profesional (nombreUsuario, email, contrasenia, titulo, ingreso) VALUES (?,?,?,?,?);"
				  ; try { cn = Conexion.getConn(); PreparedStatement ppStm =
				  cn.prepareStatement(sql); ppStm.setString(1, rp.getNombreUsuario());
				  ppStm.setString(2, rp.getEmail()); ppStm.setString(3,
				  rp.getContrasenia()); ppStm.setString(4, rp.getTitulo()); ppStm.setString(5,
				  rp.getFechaIngreso());
				  
				  if(!ppStm.execute()) { System.out.println("Registro Creado"); }else {
				  System.out.println("Registro fallo"); } ppStm.close(); } catch (SQLException
				  e) { e.printStackTrace(); }
			
			
		}

		@Override
		public List<Profesional> readAll() {
			String sql = "SELECT nombreUsuario, email, contrasenia, titulo, ingreso FROM profesional;";
			ArrayList<Profesional> todas = new ArrayList<Profesional>();
			try {
				cn = Conexion.getConn();
				Statement stm = cn.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				while(rs.next()) {
					todas.add(new Profesional(0, rs.getString("nombreUsuario"),rs.getString("email"),rs.getString("contrasenia"),rs.getString("titulo"),rs.getString("ingreso")));
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
			String sql = "DELETE FROM profesional WHERE id ="+id;
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
		public void update(Profesional rp) {
			
			String query = "UPDATE profesional SET nombreUsuario= ?, email = ?, contrasenia = ?, titulo = ?, ingreso = ? WHERE idprofesional = ?;";
			try {
				cn=Conexion.getConn();
				
				PreparedStatement stm = cn.prepareStatement(query);
				stm.setString(1, rp.getNombreUsuario());
				stm.setString(2, rp.getEmail());
				stm.setString(3, rp.getContrasenia());
				stm.setString(4, rp.getTitulo());
				stm.setString(5, rp.getFechaIngreso());
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



	
	
