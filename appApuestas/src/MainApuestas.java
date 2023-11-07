package appApuestas;

import java.util.Scanner;

public class MainApuestas {
    static Scanner sc = new Scanner(System.in);
    static Apuestas[] arrayApuestas = new Apuestas[18];

    static int numeroApuestas = 0;
	
    static final int costeApuesta = 5;
    static final String equipo1 = "Real Madrid";
    static final String equipo2 = "Valencia";

    public static void main(String[] args) {
        pantallaInicio();
    }

    public static void pantallaInicio() {

        System.out.println("Menu principal, elige que quieres hacer: ");
        System.out.println("(1) Mostrar apuestas. ");
        System.out.println("(2) Registrar una apuesta nueva.");
        System.out.println("(3) Finalizar programa. ");

        int opcion = sc.nextInt();

        switch (opcion) {
        case 1:
            mostrarApuestas();
            break;
        case 2:
            registrarApuesta();
            break;
        case 3:
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

        arrayApuestas[numeroApuestas] = new Apuestas(equipoLocal, equipoAway, apostador);
        numeroApuestas++;

        pantallaInicio();
    }

    public static void mostrarApuestas() {

        for (int i = 0; i < arrayApuestas.length; i++) {
            if (arrayApuestas[i] != null) {
                System.out.println("Apuesta " + (i + 1) + " ---- " + equipo1 + ": " + arrayApuestas[i].equipoLocal +
                    " - " + equipo2 + ": " + arrayApuestas[i].equipoAway +
                    " - Apostador: " + arrayApuestas[i].apostador);

            }
        }

        if (numeroApuestas == 0) {
            System.out.println("No hay ninguna apuesta.");
        }
        System.out.println("Hay " + (numeroApuestas * costeApuesta) + " euros en juego.");
        pantallaInicio();
    }

    public static void finalizarApp() {
        System.out.println("FIN DE LA APLICACION");
    }

}