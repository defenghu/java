package appApuestas;


import java.util.Scanner;

public class MainApuestas {
	
	static Apuestas[] arrayApuestas;
	
	static int numeroApuestas = 0; 

	public static void main(String[] args) {
		arrayApuestas = new Apuestas[18];

		//*arrayApuestas
		
		pantallaInicio();
	}
	
	
	public static void pantallaInicio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu principal, elige que quieres hacer: ");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			mostrarApuestas();
			break;
		case 2:
			registrarApuesta();
			break;
		case 3:
			//finalizarApp();
			break;
		}
	}
	
	public static void registrarApuesta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántos goles para el equipo local: ");
		int equipoLocal = sc.nextInt();
		
		System.out.println("Cuántos goles para el equipo away: ");
		int equipoAway = sc.nextInt();
		
		System.out.println("Quién esta apostando");
		String apostador = sc.next();
		
		Apuestas[c] = new Apuestas(equipoLocal, equipoAway, apostador);
		numeroApuestas++;
		
	}
	
	public static void mostrarApuestas() {
		
	}
}






	