package Modelo.Iconexion;

import java.util.List;

import Modelo.Administrativo;

public interface IadministrativoDAO {
	
	public void create(Administrativo ra);
	List<Administrativo> readAll();
	public void delete (int id);
	public void update (Administrativo ra);
	

}
