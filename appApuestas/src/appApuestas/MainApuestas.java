package appApuestas;

import java.util.Scanner;

public class MainApuestas {
	static Scanner sc = new Scanner(System.in);

	static int numeroApuestas = 0;
	static boolean apostando = false;


	static final int numeroAlumnos = 20;
	static final int costeApuesta = 5;
	static final String equipo1 = "Real Madrid";
	static final String equipo2 = "Valencia";
	static Apuestas[] arrayApuestas = new Apuestas[numeroAlumnos];

	public static void main(String[] args) {
		pantallaInicio();
	}

	public static void pantallaInicio() {

		System.out.println("Menu principal, elige que quieres hacer: ");
		System.out.println("(1) Mostrar apuestas. ");
		System.out.println("(2) Registrar una apuesta nueva.");
		System.out.println("(3) Buscar Apuesta.");// SE INTRODUCE EL NOMBRE DEL APOSTADOR Y SE INFORMA DE SU RESULTADO
													// APOSTADO
		System.out.println("(4) Borrar Apuesta. ");
		System.out.println("(5) Finalizar programa. ");

		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			mostrarApuestas();
			break;
		case 2:
			registrarApuesta();
			break;
		case 3:
			buscarApostador();
			break;
		case 4:
			borrarApostador();
		case 5:
			finalizarApp();
			break;
		}
	}

	public static void registrarApuesta() {

		System.out.println("AVISO TE COMPROMETES A PAGAR LOS " + costeApuesta + " EUROS AL REGISTRAR UNA APUESTA.");
		System.out.println("Hoy juegan " + equipo1 + " VS " + equipo2 + ".");

		System.out.println("Cuántos goles para " + equipo1 + " : ");
		int equipoLocal = sc.nextInt();

		System.out.println("Cuántos goles para " + equipo2 + " : ");
		int equipoAway = sc.nextInt();

		System.out.println("Quién esta apostando: ");
		String apostador = sc.next();

		if (comprobarUsuario(apostador) == true) {
			System.out.println("Este usuario ya ha registrado una apuesta.");
		} else {
			arrayApuestas[numeroApuestas] = new Apuestas(equipoLocal, equipoAway, apostador);
			numeroApuestas++;
		}

		pantallaInicio();
	}

	public static void mostrarApuestas() {

		for (int i = 0; i < numeroApuestas; i++) {
			if (arrayApuestas[i] != null) {
				System.out.println("Apuesta " + (i + 1) + " ---- " + equipo1 + ": " + arrayApuestas[i].equipoLocal
						+ " - " + equipo2 + ": " + arrayApuestas[i].equipoAway + " - Apostador: "
						+ arrayApuestas[i].apostador);
			}
		}

		if (numeroApuestas == 0) {
			System.out.println("No hay ninguna apuesta.");
		} // TODO else con for
		System.out.println("Hay " + (numeroApuestas * costeApuesta) + " euros en juego.");
		pantallaInicio();
	}

	public static void buscarApostador() {
		System.out.println("De qué usuario quieres saber la apuesta: (Sensible a mayúsculas).");
		String busqueda = sc.next();
		boolean apostando = false;

		for (int i = 0; i < numeroApuestas; i++) {
			if (arrayApuestas[i] != null) {
				String busquedaApostador = arrayApuestas[i].apostador;
				if (busquedaApostador.equals(busqueda)) {
					System.out.println("Apuesta " + (i + 1) + " ---- " + equipo1 + ": " + arrayApuestas[i].equipoLocal
							+ " - " + equipo2 + ": " + arrayApuestas[i].equipoAway);
					apostando = true;
				}
			}

		}

		if (apostando == false) {
			System.out.println("Este usuario no esta o has introducido el nombre mal");
		}
		pantallaInicio();
	}

	public static boolean comprobarUsuario(String args) {
		boolean apostando = false;

		for (int i = 0; i < numeroApuestas; i++) {
			if (arrayApuestas[i] != null) {
				String busquedaApostador = arrayApuestas[i].apostador;
				if (busquedaApostador.equals(args)) {
					apostando = true;
				}
			}
		}
		return apostando;
	}

	public static void borrarApostador() {
		System.out.println("De qué usuario quieres borrar la apuesta: (Sensible a mayúsculas).");
		String busqueda = sc.next();

		borrarApuesta(busqueda);

		pantallaInicio();
	}
	
	public static void borrarApuesta(String busqueda) {
	    int i = 0;
	    while (!apostando && i < numeroApuestas) {
	        if (arrayApuestas[i] != null) {
	            String busquedaApostador = arrayApuestas[i].apostador;
	            if (busquedaApostador.equals(busqueda)) {
	                arrayApuestas[i] = null;
	                apostando = true;
	            }
	        }
	        i++;
	    }
	    if (apostando) {
	        reorganizarArray(i);
	    }
	}

	public static void reorganizarArray(int i) {
	    for (int n = i; n < numeroApuestas - 1; n++) {
	        arrayApuestas[n] = arrayApuestas[n + 1];
	    }
	    numeroApuestas--;
	    apostando = false;
	}
	
	public static void finalizarApp() {
		System.out.println("FIN DE LA APLICACION");
	}

}