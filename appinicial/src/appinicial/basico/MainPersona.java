package appinicial.basico;

public class MainPersona {
	
	public static void main(String[] args) {
		System.out.println("EN EL MAIN PERSONAS");
		Persona belen = new Persona();
		belen.edad = 23;
		belen.nombre = "Belén";
		
		Persona profe = new Persona();
		profe.edad = 39;
		profe.nombre = "Vale";
	} 
	
}
