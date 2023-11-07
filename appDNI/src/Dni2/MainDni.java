package Dni2;

import java.util.Random;

public class MainDni {
	
	public static void main(String[] args) {
		Dni dni = new Dni();
		for (int i = 0; i <= 9; i++) {
			int numDni = generadorNumDNI();
			System.out.println("Tu numero es: " + numDni);
			

			char letraDNI = dni.getLetra(numDni);
			
			System.out.println("Y tu letra es: " + letraDNI);
			
			dni.setContador();
		}
		
		System.out.println("Se han generado: " + dni.getContador() + " DNIs");
	}
	
	public static int generadorNumDNI() {
		
		Random r = new Random();
		String dniAleatorio = "";
		String numeros = "1234567890";
		for (int i = 0; i < 7; i++) {
		    dniAleatorio =  dniAleatorio + numeros.charAt(r.nextInt(numeros.length()));
		}
		Integer numDNI = Integer.parseInt(dniAleatorio);
	    return numDNI;
	}
}
