package Modelo.Iconexion;

import java.util.List;
import Modelo.RegistroUsuario;

public interface IusuarioDAO {
	public void create(RegistroUsuario ru);
	List<RegistroUsuario> readAll();
	public void delete (int id);}

