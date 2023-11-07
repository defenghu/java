package appinicial;

import java.util.Scanner;

public class MiPrimeraClase {

	// COMENTARIO DE LÍNEA
	/*
	 * COMENTARIO MULTILÍNEA
	 * 
	 * EN CUALQUIER CLASE SOLO TENGO 2 TIPOS DE COSAS:
	 * 
	 * -Atributos / campos / fields / propiedades -Métodos o funciones / rutina /
	 * procedimiento / subprograma
	 */

	public static void main(String[] args) {
		
		String saludo = "CIAO";
		int longitud = saludo.length();
		System.out.println(longitud);
		
		System.out.println("AUPA ATLETI");
		System.out.print("HALA MADRID");
		System.out.println("FIN DE LA PRIMERA CLASE");

		// TODO Modificar este programa
		// para que imprima del 0 al 50 sólo los números pares
		// y al final, muestre un mensaje de
		// "THE END"
		
		System.out.println("Bucle For");
		
		for (int a = 0; a <= 50; a++) {
			// si a es par
			if ((a % 2 == 0)==true) {
				// se cumple
				System.out.println(a);
			} else {
				// si no se cumple
			}
			// imprime
			// si no
			// no hago na

		}
		
		System.out.println("Bucle Do While");
		
		int  numero = 0;
		do {
			if ((numero%2)==0)
			{
				System.out.println(numero);
			}
			numero++;
		} while (numero<=50);
		
		
		System.out.println("THE END");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mete un número: ");
		int numeroLeido = scanner.nextInt();
		System.out.println(numeroLeido);
		
		
		
	}

}