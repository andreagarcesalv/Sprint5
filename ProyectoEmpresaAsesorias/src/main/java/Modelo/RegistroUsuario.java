package Modelo;

public class RegistroUsuario {

	private int id;
	 private String nombreUsuario;
	 private String Email;
	 private String Contrasenia;
	
	 public RegistroUsuario() {
		super();
	}

	public RegistroUsuario(int id, String nombreUsuario, String email, String contrasenia) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		Email = email;
		Contrasenia = contrasenia;
	}

	public RegistroUsuario(String nombreUsuario, String email, String contrasenia) {
		super();
		this.nombreUsuario = nombreUsuario;
		Email = email;
		Contrasenia = contrasenia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	@Override
	public String toString() {
		return "RegistroUsuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", Email=" + Email + ", Contrasenia="
				+ Contrasenia + "]";
	}
	 
	 
}
