package dia4Java;

public class charAt {
	
	public static void main(String[] args) {
		//String saludo = "HOLA";
		String saludo = new String ("HOLA");
		System.out.println(saludo);
		char primeraLetra = saludo.charAt(3);
		System.out.println(primeraLetra);
		int longitud = saludo.length();
		System.out.println(longitud);
		
		for (int i = 0; i < saludo.length(); i++) {
			System.out.println(saludo.charAt(i));
		}
		
		for (int i = 0; i < saludo.length(); i++) {
			if (i%2==0) {
				System.out.println(saludo.charAt(i));
			}
		}
		
		String saludoInverso = "";
		
		for (int i = saludo.length()- 1; i > -1; i--) {
			
			saludoInverso = saludoInverso + saludo.charAt(i);
			System.out.println(saludoInverso);
		
		}
		
		String hache = "";
		
		for (int i = 0; i < saludo.length(); i++) {
			
			hache = hache + saludo.charAt(i);
						
			if (hache.equals("H")) {
				System.out.println("La hache está en la posición: " + (i+1));
			}
			else {
				hache = "";
			}
		}
		
	}
}
