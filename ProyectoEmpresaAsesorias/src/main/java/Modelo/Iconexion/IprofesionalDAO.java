package Modelo.Iconexion;

import java.util.List;


import Modelo.Profesional;

public interface IprofesionalDAO {
	public void create(Profesional rp);
	List<Profesional> readAll();
	public void delete (int id);
	public void update (Profesional rp);
}
