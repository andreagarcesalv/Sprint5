package Modelo.Iconexion;

import java.util.List;

import Modelo.Cliente;
import Modelo.RegistroUsuario;

public interface IclienteDAO {
	public void create(Cliente rc);
	List<Cliente> readAll();
	public void delete (int id);
	void delete(String rut);
	void update(Cliente rc);
	
}

