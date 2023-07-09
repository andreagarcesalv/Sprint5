package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modelo.Iconexion.IclienteDAO;

public class ClienteImplDAO implements IclienteDAO {


private Connection cn = null;

@Override public void create(Cliente rc) { String sql =
"INSERT INTO clientes  (nombreUsuario, rut, nombres, apellidos, telefono, afp,sistemaSalud,direccion,comuna) VALUES (?,?,?,?,?,?.?,?,?);"
; try { cn = Conexion.getConn(); PreparedStatement ppStm =
cn.prepareStatement(sql); ppStm.setString(1, rc.getNombreUsuario());
ppStm.setString(2, rc.getRut()); ppStm.setString(3,
rc.getNombres()); ppStm.setString(4, rc.getApellidos()); ppStm.setInt(5,
rc.getTelefono()); ppStm.setString(6, rc.getAfp()); ppStm.setString(7, rc.getSistemaSalud());
ppStm.setString(8, rc.getDireccion());ppStm.setString(9, rc.getComuna());

if(!ppStm.execute()) { System.out.println("Registro Creado"); }else {
System.out.println("Registro fallo"); } ppStm.close(); } catch (SQLException
e) { e.printStackTrace(); }



}

@Override
public List<Cliente> readAll() {
	String sql = "SELECT nombreUsuario, rut, nombres, apellidos, telefono, afp,sistemaSalud,direccion,comuna FROM clientes;";
	ArrayList<Cliente> todas = new ArrayList<Cliente>();
	try {
		cn = Conexion.getConn();
		Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while(rs.next()) {
			todas.add(new Cliente(rs.getString("rut"),rs.getString("nombres"),rs.getString("apellidos"),rs.getInt("telefono"),rs.getString("afp"),rs.getString("sistemaSalud"), rs.getString("direccion"), rs.getString("comuna")));
		}
		rs.close();
		stm.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return todas;
}



@Override
public void delete(String rut) {
	String sql = "DELETE FROM clientes WHERE rut ="+rut;
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
public void update(Cliente rc) {
	
	String query = "UPDATE clientes SET nombreUsuario= ?, email = ?, contrasenia = ?, rut = ?, nombres = ?, apellidos = ?, telfono = ?, afp = ?, sistemaSalud = ?, direccion = ?, comuna = ? WHERE idclientes = ?;";
	try {
		cn=Conexion.getConn();
		
		PreparedStatement stm = cn.prepareStatement(query);
		stm.setString(1, rc.getNombreUsuario());
		stm.setString(2, rc.getEmail());
		stm.setString(3, rc.getContrasenia());
		stm.setString(4, rc.getNombres());
		stm.setString(5, rc.getApellidos());
		stm.setInt(4, rc.getTelefono());
		stm.setString(5, rc.getAfp());
		stm.setString(5, rc.getSistemaSalud());
		stm.setString(5, rc.getDireccion());
		stm.setString(5, rc.getComuna());
		
		
		
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

@Override
public void delete(int id) {
	// TODO Auto-generated method stub
	
}




}
