package Modelo;

public class Capacitacion {

	 private int id;
	 private String rutEmpresa;
	 private String fechaCapacitacion;
	 private String hora;
	 private String lugar;
	 private String duracion;
	 private int catidadAsistentes;
	
	 public Capacitacion() {
		super();
	}

	public Capacitacion(int id, String rutEmpresa, String fechaCapacitacion, String hora, String lugar, String duracion,
			int catidadAsistentes) {
		super();
		this.id = id;
		this.rutEmpresa = rutEmpresa;
		this.fechaCapacitacion = fechaCapacitacion;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.catidadAsistentes = catidadAsistentes;
	}

	public Capacitacion(String rutEmpresa, String fechaCapacitacion, String hora, String lugar, String duracion,
			int catidadAsistentes) {
		super();
		this.rutEmpresa = rutEmpresa;
		this.fechaCapacitacion = fechaCapacitacion;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.catidadAsistentes = catidadAsistentes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutEmpresa() {
		return rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public String getFechaCapacitacion() {
		return fechaCapacitacion;
	}

	public void setFechaCapacitacion(String fechaCapacitacion) {
		this.fechaCapacitacion = fechaCapacitacion;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCatidadAsistentes() {
		return catidadAsistentes;
	}

	public void setCatidadAsistentes(int catidadAsistentes) {
		this.catidadAsistentes = catidadAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rutEmpresa=" + rutEmpresa + ", fechaCapacitacion=" + fechaCapacitacion
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", catidadAsistentes="
				+ catidadAsistentes + "]";
	}
	 
	 
}
