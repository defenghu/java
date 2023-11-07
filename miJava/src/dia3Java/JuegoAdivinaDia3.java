package dia3Java;

import java.util.Scanner;

public class JuegoAdivinaDia3 {
	

	
	public static void main(String[] args) {

		int numJuego = numJuego();
		int numUsuario = 0;
		int vidas = 5;
		boolean adivinado = false;
		String resultado = null;
		double posibilidad = 100;
		
		
		do {
			
			numUsuario = pideUsuario();
			resultado = adivinaNumero(numJuego, numUsuario);

			if (resultado.equals("Win")) { 
				
				System.out.println("Has ganado");
				adivinado = true;
				
			} else {
				
				if (resultado == "Mayor") {
					
					posibilidad = posibilidad - numUsuario;
					System.out.println("Busco un numero mayor");
					double probabilidad = (1 / posibilidad)*100;
					System.out.println("Tu probabildad de adivinar es: " + probabilidad + "%.");
					
				} else if (resultado == "Menor") {
					
					posibilidad = numUsuario;
					System.out.println("Busco un numero menor");
					double probabilidad = (1 / posibilidad)*100;
					System.out.println("Tu probabildad de adivinar es: " + probabilidad + "%.");
					
				}
				vidas--;
			}

		} while (!adivinado && vidas > 0);
		
		
		if (!adivinado) {
			
			System.out.println("El numero era: " + numJuego + ".");
			System.out.println("GAME OVER.");
			
		}

	}

	/**
	 * Función que pide al Usuario adivinar el número.
	 * 
	 * @return numUsuario
	 */
	public static int pideUsuario() {
		
		int num = 0;
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Adivina el número: ");
			num = scanner.nextInt();
			
		return num;
	}

	/**
	 * Función que da el número a adivinar.
	 * 
	 * @return numJuego
	 */
	public static int numJuego() {

		int num = (int) (Math.random() * 100 + 1);

		return num;

	}

	/**
	 * Función que juega 1 ronda con el numUsuario y comparándolo con numJuego.
	 * 
	 * @param numJuego
	 * @param numUsuario
	 * @return resultadoRonda
	 */
	public static String adivinaNumero(int numJuego, int numUsuario) {
		
		String resultadoRonda = null;

			if (numJuego == numUsuario) {
				
				resultadoRonda = "Win";
				
			} else if (numJuego > numUsuario) {
				
				resultadoRonda = "Mayor";
				
			} else {
				
				resultadoRonda = "Menor";
				
			}

		return resultadoRonda;
	}
	
}