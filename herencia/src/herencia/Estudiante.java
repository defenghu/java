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
	
	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		
		if (obj!=null) {
			if (obj instanceof Estudiante e) {
				if (this.getNombre().equals(e.getNombre()) && this.getEmail().equals(e.getNombre())
					&&	this.getTelefono()==(e.getTelefono())
					&&	this.getNumero()==(e.getNumero())
					&&	this.getPromedio()==(e.getPromedio())) {
					
					equals = true;
					
				}
			}
		}
		
		return equals;
	}
	
}
