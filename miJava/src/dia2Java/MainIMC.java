package dia2Java;

import java.util.Scanner;

/**
 * PROGRAMA IMC Índice de Masa Corporal
 * 
 * Fórmula IMC = peso kg / altura al cuadrado
 * 
 * IMC < 16 DESNUTRIDO
 * IMC >=16 Y < 18 DELGADO
 * IMC >=18 Y < 25 IDEAL
 * IMC >=25 Y < 31 SOBREPESO
 * IMC >= 31 OBESO
 * 
 * TODO: HACED UNA APP QUE PIDA AL USUARIO
 * SU PESO Y SU ESTATURA Y LE INFORME DE SU IMC
 * NUMÉRICO Y NOMIMAL
 * 
 * PEJ: 22.35 IDEAL
 */
public class MainIMC {
	
/**
 * Pedimos el peso en kg al usuario
 * por la entrada estándar (teclado)
 * 
 * @return peso
 */
	public static float pedirPeso() {
		Scanner scanner = new Scanner(System.in);
		
		float peso = 0;
		
			System.out.println("Intro peso (Kg)");
			peso = scanner.nextFloat();
			
		return peso;
		
	}
	/**
	 * Pedimos la altura en m al usuario
	 * por la entrada estándar (teclado)
	 * 
	 * @return altura
	 */
	
	public static float pedirAltura() {
		Scanner scanner = new Scanner(System.in);
		
		float altura = 0;
		
			System.out.println("Intro altura (m)");
			altura = scanner.nextFloat();
			
		return altura;
		
	}
	
	
	/**
	 * Calcula el imcNumerico cogiendo los parametros
	 * de peso y altura.
	 * 
	 * @param peso
	 * @param altura
	 * @return imcNumerico
	 */
	public static double calcularImcNumerico(float peso, float altura) {
		
		double imcNumerico = 0;
		
			imcNumerico =  peso / Math.pow(altura, 2);
		
		return imcNumerico;
		
	}
	
	/**
	 * Calcula el imcNominal teniendo en cuenta
	 * el imcNumerico que ha devuelto calcularImcNumerico
	 * 
	 * @param imcNumerico
	 * @return imcNominal
	 */
	public static String calcularImcNominal(double imcNumerico) {
		
		
		String imcNominal = null;
		//3.2 CALCULAR EL IMC NOMINAL
		if (imcNumerico<16)
		{
			imcNominal ="DESNUTRIDO";
		} else if (imcNumerico>=16 &&  imcNumerico<18){
			imcNominal = "DELGADO";
		} else if (imcNumerico>=18 &&  imcNumerico<25){
			imcNominal = "IDEAL";
		}else if (imcNumerico>=25 &&  imcNumerico<31){
			imcNominal = "SOBREPRESO";
		}else if (imcNumerico>31){
			imcNominal = "OBESO";
		}
		
		return imcNominal;
		
	}
	
	/**
	 * Imprime la frase acorde al imcNumerico e imcNominal
	 * 
	 * @param imcNumerico
	 * @param imcNominal
	 */
	public static void fraseIMC(double imcNumerico, String imcNominal) {
		
		System.out.println("SU IMC ES "+ Math.round(imcNumerico * 100.0) / 100.0 + " " + imcNominal);
		
	}
	
	

	public static void main(String[] args) {
		//1 PEDIR PESO
		float peso = pedirPeso();

		//2 PEDIR ALTURA
		float altura = pedirAltura();
		
		//3 CALCULAR EL IMC
		 
			//3.1 CALCULAR EL IMC NUMÉRICO
		//float imcNumerico = peso/(altura*altura);
	
		double imcNumerico = calcularImcNumerico(peso, altura);
				
			//3.2 CALCULAR EL IMC NOMINAL
		
		String imcNominal = calcularImcNominal(imcNumerico);
		
		
		//4 INFORMAR AL USUARIO
		
		fraseIMC(imcNumerico, imcNominal);
		
		
	}

}




