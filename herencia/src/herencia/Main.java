package herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	}

	public static int buscarAlumno(Estudiante alumno, List<Estudiante> alumnos) {

		int pos = 0;
		int length = alumnos.size();
		boolean found = false;

		while (!found && pos < length) {

			if (alumno.equals(alumnos.get(pos))) {
				found = true;
			} else {
				pos++;
			}
		}

		if (!found) {
			pos = -1;
		}

		return pos;

	}

	public static int buscarAlumno2(Estudiante alumno, List<Persona> alumnos) {

		int pos = 0;
		int length = alumnos.size();
		boolean found = false;

		while (!found && pos < length) {
			
			if (alumnos.get(pos) instanceof Estudiante) {
				if (alumno.equals(alumnos.get(pos))) {
					found = true;
				} else {
					pos++;
				}
			} else {
				pos++;
			}
		}

		if (!found) {
			pos = -1;
		}

		return pos;

	}
	
	
	
	public static List<Estudiante> buscarPromedios(int nota, List<Persona> personas) {
		
		List<Estudiante> arrayEstudiante = new ArrayList<>();
		
		int pos = 0;
		int length = personas.size();
		boolean found = false;

		while (!found && pos < length) {
			
			if (personas.get(pos) instanceof Estudiante e) {
				if (nota >= e.getPromedio()) {
					arrayEstudiante.add(e);
				} 
			}
			pos++;
		}

		return arrayEstudiante;

	}
	
	public static double mediaAlumnos(List<Estudiante> alumnos) {
		double media = 0;

		for (Estudiante estudiante : alumnos) {
			
			media = media + estudiante.getPromedio();
			
		}
		
		media = media / alumnos.size();
		
		return media;

	}
	
	public static TipoNota notaNominalAlum(List<Estudiante> alumnos) {
		double media = 0;

		for (Estudiante estudiante : alumnos) {
			
			media = media + estudiante.getPromedio();
			
		}
		
		media = media / alumnos.size();
				
		return notaNominal(media);

	}
	
	public static TipoNota notaNominal(double nota) {
			
			TipoNota notaNominal = null;
			
			if (nota < 5) {
				notaNominal = TipoNota.SUSPENSO;
			} else if (nota >= 5 && nota < 6) {
				notaNominal = TipoNota.SUFICIENTE;
			} else if (nota >= 6 && nota < 7) {
				notaNominal = TipoNota.BIEN;
			} else if (nota >= 7 && nota < 9) {
				notaNominal = TipoNota.NOTABLE;
			} else if (nota >= 9 && nota < 10) {
				notaNominal = TipoNota.SOBRESALIENTE;
			} else {
				notaNominal = TipoNota.MATRICULA;
			}
			
			return notaNominal;
	}
	
}
