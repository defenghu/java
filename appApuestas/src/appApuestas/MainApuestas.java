package appApuestas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainApuestas {
	static final DecimalFormat df = new DecimalFormat("0.00");
	static Scanner sc = new Scanner(System.in);

	static final int numeroAlumnos = 20;
	static final String equipo1 = "Real Madrid";
	static final String equipo2 = "Valencia";

	static int numeroApuestas = 0;
	static boolean apostando = false;
	static Apuestas[] arrayApuestas = new Apuestas[numeroAlumnos];

	public static void main(String[] args) {
		boolean salir = false;
		
		do {
			int opcion = pantallaInicio();
			if (opcion == 7) {
				salir = true;
			}
			opcionesApuestas(opcion);
		} while (salir != true);
	}

	public static int pantallaInicio() {

		System.out.println("Menu principal, elige que quieres hacer: ");
		System.out.println("(1) Mostrar apuestas. ");
		System.out.println("(2) Registrar una apuesta nueva.");
		System.out.println("(3) Buscar Apuesta.");
		System.out.println("(4) Borrar Apuesta. ");
		System.out.println("(5) Ver cantidad apostada. ");
		System.out.println("(6) Resetear Apuestas. ");
		System.out.println("(7) Finalizar programa. ");

		int opcion = sc.nextInt();

		return opcion;
	}

	public static void opcionesApuestas(int opcion) {
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
			break;
		case 5:
			verCantidadApostada();
			break;
		case 6:
			resetearApuestas();
			break;
		case 7:
			finalizarApp();
			break;
		default:
			System.out.println("Has metido una opción inválida inténtalo otra vez");
		}
	}

	public static void registrarApuesta() {

		System.out.println("AVISO TE COMPROMETES A PAGAR EL DINERO AL REGISTRAR UNA APUESTA.");
		System.out.println("Hoy juegan " + equipo1 + " VS " + equipo2 + ".");

		System.out.println("Cuántos goles para " + equipo1 + " : ");
		int equipoLocal = sc.nextInt();

		System.out.println("Cuántos goles para " + equipo2 + " : ");
		int equipoAway = sc.nextInt();

		System.out.println("Quién esta apostando: ");
		String apostador = sc.next();

		System.out.println("Que cantidad quieres apostar: ");
		float cantidadApostada = sc.nextFloat();

		if (comprobarUsuario(apostador) == true) {
			System.out.println("Este usuario ya ha registrado una apuesta.");
		} else {
			arrayApuestas[numeroApuestas] = new Apuestas(equipoLocal, equipoAway, apostador, cantidadApostada);
			numeroApuestas++;
		}
	}

	public static void mostrarApuestas() {

		for (int i = 0; i < numeroApuestas; i++) {
			if (arrayApuestas[i] != null) {
				System.out.println("Apuesta " + (i + 1) + " ---- " + equipo1 + ": " + arrayApuestas[i].getEquipoLocal()
						+ " - " + equipo2 + ": " + arrayApuestas[i].getEquipoAway() + " - Apostador: "
						+ arrayApuestas[i].getApostador());
			}
		}

		if (numeroApuestas == 0) {
			System.out.println("No hay ninguna apuesta.");
		}
	}

	public static void buscarApostador() {
		System.out.println("De qué usuario quieres saber la apuesta: (Sensible a mayúsculas).");
		String busqueda = sc.next();
		boolean apostando = false;

		for (int i = 0; i < numeroApuestas; i++) {
			if (arrayApuestas[i] != null) {
				String busquedaApostador = arrayApuestas[i].getApostador();
				if (busquedaApostador.equals(busqueda)) {
					System.out.println(
							"Apuesta " + (i + 1) + " ---- " + equipo1 + ": " + arrayApuestas[i].getEquipoLocal() + " - "
									+ equipo2 + ": " + arrayApuestas[i].getEquipoAway());
					apostando = true;
				}
			}
		}

		if (apostando == false) {
			System.out.println("Este usuario no esta o has introducido el nombre mal");
		}
	}

	public static boolean comprobarUsuario(String args) {
		boolean apostando = false;

		for (int i = 0; i < numeroApuestas; i++) {
			if (arrayApuestas[i] != null) {
				String busquedaApostador = arrayApuestas[i].getApostador();
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

	}

	public static void borrarApuesta(String busqueda) {
		int i = 0;

		while (!apostando && i < numeroApuestas) {
			if (arrayApuestas[i] != null) {
				String busquedaApostador = arrayApuestas[i].getApostador();
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

	public static void verCantidadApostada() {

		if (numeroApuestas != 0) {
			calculadorCantidadApostada();
		} else {
			System.out.println("No hay apuestas, registra una apuesta para verlos");
		}
	}

	public static void calculadorCantidadApostada() {
		float max = arrayApuestas[0].getCantidadApostada();
		float min = arrayApuestas[0].getCantidadApostada();
		float media = 0;

		for (int i = 1; i < numeroApuestas; i++) {
			if (arrayApuestas[i].getCantidadApostada() > max) {
				max = arrayApuestas[i].getCantidadApostada();
			}
			if (arrayApuestas[i].getCantidadApostada() < min) {
				min = arrayApuestas[i].getCantidadApostada();
			}
			media = media + arrayApuestas[i].getCantidadApostada();
		}
		media = media / numeroApuestas;

		System.out.println("La apuesta maxima es: " + df.format(max) + ", la minima es: " + df.format(min)
				+ " , la media de las apuestas es: " + df.format(media) + " y la cantidad total apostada es: "
				+ df.format(totalApostado()));
	}

	public static float totalApostado() {
		float total = 0;

		for (int i = 0; i < numeroApuestas; i++) {
			total = total + arrayApuestas[i].getCantidadApostada();
		}

		return total;
	}

	public static void resetearApuestas() {

		for (int i = 0; i < numeroApuestas; i++) {
			arrayApuestas[i] = null;

		}
		numeroApuestas = 0;
		System.out.println("Apuestas BORRADAS");
	}

	public static void finalizarApp() {
		System.out.println("FIN DE LA APLICACION");
	}

}