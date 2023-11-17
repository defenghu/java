package herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Persona> listaPersonas = null;

		listaPersonas = new ArrayList<Persona>();

		Persona persona = new Persona();
		Estudiante estudiante = new Estudiante();
		Persona persona2 = (Persona) estudiante;

		Object opersona = (Object) persona;

		listaPersonas.size();

		if (estudiante instanceof Persona) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}

		if (persona instanceof Estudiante) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}

		listaPersonas.add(estudiante);
		listaPersonas.add(persona);
		listaPersonas.add((Persona) opersona);
		
		listaPersonas.add(persona2);
		
		System.out.println(listaPersonas.size());

	}
}
