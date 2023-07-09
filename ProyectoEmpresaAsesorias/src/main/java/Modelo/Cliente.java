package Modelo;

public class Cliente extends RegistroUsuario{
	    private String rut;
	    private String nombres;
	    private String apellidos;
	    private int telefono;
	    private String afp;
	    private String sistemaSalud;
	    private String direccion;
	    private String comuna;
	    
	    public Cliente() {
			super();
		}
	    
		public Cliente(String rut, String nombres, String apellidos, int telefono, String afp, String sistemaSalud,
				String direccion, String comuna, int edad) {
			super();
			this.rut = rut;
			this.nombres = nombres;
			this.apellidos = apellidos;
			this.telefono = telefono;
			this.afp = afp;
			this.sistemaSalud = sistemaSalud;
			this.direccion = direccion;
			this.comuna = comuna;
			this.edad = edad;
		}

		public Cliente(int id, String nombreUsuario, String email, String contrasenia, String rut, String nombres,
				String apellidos, int telefono, String afp, String sistemaSalud, String direccion, String comuna,
				int edad) {
			super(id, nombreUsuario, email, contrasenia);
			this.rut = rut;
			this.nombres = nombres;
			this.apellidos = apellidos;
			this.telefono = telefono;
			this.afp = afp;
			this.sistemaSalud = sistemaSalud;
			this.direccion = direccion;
			this.comuna = comuna;
			this.edad = edad;
		}

		private int edad;
		public Cliente(String rut, String nombres, String apellidos, int telefono, String afp, String sistemaSalud,
				String direccion, String comuna) {
			super();
			this.rut = rut;
			this.nombres = nombres;
			this.apellidos = apellidos;
			this.telefono = telefono;
			this.afp = afp;
			this.sistemaSalud = sistemaSalud;
			this.direccion = direccion;
			this.comuna = comuna;
			
		}
		
		public String getRut() {
			return rut;
		}
		public void setRut(String rut) {
			this.rut = rut;
		}
		public String getNombres() {
			return nombres;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public String getAfp() {
			return afp;
		}
		public void setAfp(String afp) {
			this.afp = afp;
		}
		public String getSistemaSalud() {
			return sistemaSalud;
		}
		public void setSistemaSalud(String sistemaSalud) {
			this.sistemaSalud = sistemaSalud;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getComuna() {
			return comuna;
		}
		public void setComuna(String comuna) {
			this.comuna = comuna;
		}
		
		

		@Override
		public String toString() {
			return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono="
					+ telefono + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion
					+ ", comuna=" + comuna+"]";
		}

	    
}
