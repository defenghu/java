package dia2Java;

import java.util.Scanner;

public class Ej1 {
	//MAIN PARA LLAMAR FUNCIONES:
	// calcularMenorMayorMedia();
	// imprimirNUM();
	// contadorImpares();
	// sumaNum();
	// calcularMayor();
	
	public static void main(String[] args) {
		//INTRODUCIR AQUI EL NOMBRE DE LA FUNCION QUESEQUIERA USAR
		calcularMenorMayorMedia();
	}
	
	
	
	//FUNCION PARA IMPRIMIR NUMEROS INTRODUCIDOS
	public static void imprimirNum() {
		

		Scanner scanner = new Scanner(System.in);
		for (int contador = 0; contador < 10; contador++) {
			    
			System.out.println("Mete un número: ");			
			System.out.println(scanner.nextInt());

		}
		System.out.println("10 numeros");
	}

	//FUNCION PARA CALCULAR MENOR, MAYOR Y MEDIA
	public static void calcularMenorMayorMedia() {
		
		int contador = 0;
		int menor = 0;
		int mayor = 0;
		int suma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (contador = 0; contador < 10; contador++) {
			 
			System.out.println("Mete un número: ");			
			int numeroLeido = scanner.nextInt();
			
			suma = suma + numeroLeido;
			
			if (numeroLeido>=mayor) {
				mayor = numeroLeido;
			}
			if (numeroLeido<=menor) {
				menor = numeroLeido;
			} 
			else {
				
			}
		}
		
		int media = suma / contador;
		System.out.println("El mayor es: " + mayor + ".");
		System.out.println("El menor es: " + menor + ".");
		System.out.println("La media es: " + media + ".");
	
		
	}
	
	//FUNCION PARA CONTAR NUMEROS IMPARES
	public static void contadorImpares() {
			
			int cantidad = 0;
			Scanner scanner = new Scanner(System.in);
			for (int contador = 0; contador < 10; contador++) {
				 
				System.out.println("Mete un número: ");			
				int numeroLeido = scanner.nextInt();
				
				if ((numeroLeido%2)==0) {
					
				} else {
					cantidad++;
				}
			} 
			System.out.println("Hay " + cantidad + " impares.");
	
		}
	
	//FUNCION PARA SUMAR LOS NUMEROS
	public static void sumaNum() {

		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		for (int contador = 0; contador < 10; contador++) {
			 
			System.out.println("Mete un número: ");			
			int numeroLeido = scanner.nextInt();
			
			suma = suma + numeroLeido;
			
		} 
		System.out.println("La suma es " + suma + " .");

	}
	
	//FUNCION PARA CALCULAR MAYOR
	public static void calcularMayor() {
		int numero = 0;
		Scanner scanner = new Scanner(System.in);
		for (int contador = 0; contador < 10; contador++) {
			 
			System.out.println("Mete un número: ");			
			int numeroLeido = scanner.nextInt();
			
			if (numeroLeido>=numero) {
				numero = numeroLeido;
			} else {
			}
		}
		System.out.println("El numero mayor es " + numero + " .");

	}
}

