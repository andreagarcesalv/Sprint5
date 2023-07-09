package Modelo;

public class Profesional extends RegistroUsuario{
	 private String titulo;
	 private String fechaIngreso;
	public Profesional() {
		super();
	}
	public Profesional(String titulo, String fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
			
	}
	
	
	public Profesional(int id, String nombreUsuario, String email, String contrasenia, String titulo,
			String fechaIngreso) {
		super(id, nombreUsuario, email, contrasenia);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}



}
