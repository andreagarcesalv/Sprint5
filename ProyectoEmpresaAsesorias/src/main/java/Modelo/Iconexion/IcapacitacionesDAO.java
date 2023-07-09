package Modelo.Iconexion;

import java.util.List;

import Modelo.Capacitacion;

public interface IcapacitacionesDAO {

	public void create(Capacitacion c);
	List<Capacitacion> readAll();
	public void delete (String rutEmpresa);
	public void update (Capacitacion c);
}
