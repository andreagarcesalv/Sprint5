package Modelo;

public class Administrativo extends RegistroUsuario{
	private String area;
    private String experienciaPrevia;
	public Administrativo() {
		super();
	}
	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	
	
	public Administrativo(int id, String nombreUsuario, String email, String contrasenia, String area,
			String experienciaPrevia) {
		super(id, nombreUsuario, email, contrasenia);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
    
    

}
