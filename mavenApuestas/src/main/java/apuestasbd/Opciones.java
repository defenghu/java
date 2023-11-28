package apuestasbd;

public class Opciones {

    public static void opcionesInicio(int opcion) {
        switch (opcion) {
            case 1:
                //login
                break;
            case 2:
                //register
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Has metido una opción inválida inténtalo otra vez");
        }
    }

}
