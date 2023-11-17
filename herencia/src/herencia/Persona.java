package herencia;

public class Persona {
	private String nombre;
	private int telefono;
	private String email;

	public Persona() {
		super();
	}

	public Persona(String nombre, int telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostrarPersona() {
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Telefono = " + this.telefono);
		System.out.println("Email = " + this.email);
	}
}
