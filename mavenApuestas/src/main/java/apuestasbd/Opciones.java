package apuestasbd;

public class Opciones {

    public static void opcionesInicio(int opcion) {
        switch (opcion) {
            case 1:
                Pantalla.menuLogin();
                break;
            case 2:
                Pantalla.menuRegistro();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Has metido una opción inválida inténtalo otra vez");
        }
    }
    
    public static void opcionesPrincipal(int opcion) {
    	switch (opcion) {
        case 1:
        	Pantalla.menuApuestasPrincipal();
            break;
        case 2:
        	opcionesAjustesUsuario(Pantalla.menuAjustesCuenta());
            break;
        case 9:
            System.exit(0);
            break;
        default:
            System.out.println("Has metido una opción inválida inténtalo otra vez");
    	}
    }
    
    public static void opcionesAjustesUsuario(int opcion) {
    	switch (opcion) {
        case 1:
            Pantalla.menuModificarPassword();
            break;
        case 2:
            //Cambiar nombre usuario
            break;
        case 3:
        	//Borrar cuenta
        	break;
        case 9:
            Pantalla.menuPantallaPrincipal();
            break;
        default:
            System.out.println("Has metido una opción inválida inténtalo otra vez");
    	}
    }
    
    public static void opcionesApuestaPrincipal(int opcion) {
    	switch (opcion) {
        case 1:
            //Mis apuestas
            break;
        case 2:
            //Mostrar todas
            break;
        default:
            System.out.println("Has metido una opción inválida inténtalo otra vez");
    	}
    }
    
    public static void opcionesMisApuestas(int opcion) {
    	switch (opcion) {
        case 1:
            //Crear nueva apuesta.
            break;
        case 2:
            //Mostrar mis Apuestas
            break;
        case 3:
        	//Modificar una apuesta.
        	break;
        case 4:
        	//Borrar una apuesta.
        	break;
        case 9:
            Pantalla.menuApuestasPrincipal();
            break;
        default:
            System.out.println("Has metido una opción inválida inténtalo otra vez");
    	}
    }
    
    public static void opcionesTodasApuestas(int opcion) {
    	switch (opcion) {
        case 1:
            //Mostrar apuestas con stats.
            break;
        case 2:
            //Mostrar apuestas sin stats
            break;
        case 9:
            Pantalla.menuApuestasPrincipal();
            break;
        default:
            System.out.println("Has metido una opción inválida inténtalo otra vez");
    	}
    }
}
