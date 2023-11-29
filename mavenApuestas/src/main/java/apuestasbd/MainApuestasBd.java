package apuestasbd;


public class MainApuestasBd {
	
	
	public static void main(String[] args) {
	menuInicio();
		
	}
	
	public static void menuInicio() {
		while (true) {
			int opcion = Pantalla.menuInicio();
			
			Opciones.opcionesInicio(opcion);

		}
	}
	
	public static void menuPrincipal() {
		while (true) {
			int opcion = Pantalla.menuPantallaPrincipal();
			
			Opciones.opcionesPrincipal(opcion);

		}
	}
	
	public static void menuApuestas() {
		while (true) {
			int opcion = Pantalla.menuApuestasPrincipal();
			
			if (opcion == 9) {
				menuPrincipal();
			}
			else {
				Opciones.opcionesApuestaPrincipal(opcion);
			}	
		}
	}
}