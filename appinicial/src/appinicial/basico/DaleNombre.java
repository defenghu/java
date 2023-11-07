package appinicial.basico;


/**
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class DaleNombre {
	
	private static boolean esPalindromo (String cadena)
	{
		boolean esPalindromo = false;

		int caracterInicial = 0;
		int caracterFinal = cadena.length()-1;

			while ((caracterInicial<=caracterFinal)&&(esPalindromo))
			{
				esPalindromo = cadena.charAt(caracterInicial)==cadena.charAt(caracterFinal);
				caracterInicial++;
				caracterFinal--;
			}


		return esPalindromo;
	}
	
	private static boolean esPalindromo2 (String cadena) {
		
		boolean esPalindromo2 = false;
		
		String cadenaInversa = "";
		
		for (int i = cadena.length()- 1; i > -1; i--) {
			
			cadenaInversa = cadenaInversa + cadena.charAt(i);
		
		}
		
		esPalindromo2 = cadenaInversa==cadena;
		
		return esPalindromo2;
	}

	
	private static String palindromoRecursivo(String cadena) {
		
		if (cadena.length()<1) {
			return "VERDADERO";
		} else {
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		if (esPalindromo("somos"))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
	}

}