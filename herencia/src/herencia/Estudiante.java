package herencia;

public class Estudiante extends Persona {
	private int numero;
	private int promedio;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	public Estudiante(int numero, int promedio) {
		super();
		this.numero = numero;
		this.promedio = promedio;
	}

	public Estudiante() {
		super();
	}
}
