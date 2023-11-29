package apuestasbd;

import java.util.Scanner;

import apuestasbd.dao.UsuarioDao;
import apuestasbd.modelo.Usuario;

public class Pantalla {
    static Scanner sc = new Scanner(System.in);
	static UsuarioDao usDao = new UsuarioDao();
    
    /************************
     **Display de los menus**
     ************************/
    
    public static int menuInicio() {

        System.out.println("Menu principal, elige que quieres hacer: ");
        System.out.println("(1) Iniciar Sesión ");
        System.out.println("(2) Registrar una cuenta nueva.");
        System.out.println("(9) Salir");

        return sc.nextInt();
    }
    
    public static void menuLogin() {
		 Usuario us = pedirCredenciales();
		 
		 us = usDao.buscarExiste(us.getEmail(), us.getPassword());
		 
		 if(us.equals(null)) {
			 System.out.println("1");
			 menuLogin();
		 } else {
			 System.out.println("Accedido con éxito!");
			 MainApuestasBd.menuPrincipal();
		 }
    }
    
    public static void menuRegistro() {

		 Usuario user = pedirUsuarioNuevo();
		 
	 }
		 

    public static int menuPantallaPrincipal() {

        System.out.println("Menú principal");
        System.out.println("(1) Ver Apuestas.");
        System.out.println("(2) Ajustes Usuario.");
        System.out.println("(9) Salir.");

        return sc.nextInt();
    }
    
    public static int menuAjustesCuenta() {

        System.out.println("Ajustes cuenta.");
        System.out.println("(1) Cambiar contraseña.");
        System.out.println("(2) Cambiar nombre usuario.");
        System.out.println("(3) Borrar cuenta.");
        System.out.println("(9) Atrás.");

        return sc.nextInt();
    }
    
    public static void menuModificarPassword() {
    	
        System.out.println("Modificar Password.");
        System.out.println("Introduzca su email: ");
        String email = sc.next();
        boolean coinciden = false;
        
        while (!coinciden) {
        	String pass = confirmarPassword();
        	if (pass.equals(null)) {
    			System.out.println("No coinciden las contraseñas inténtalo otra vez.");
    		} else {
    			usDao.modificarPasswordUsuario(email, pass);
    			coinciden = true;
    		}
		}
        System.out.println("Contraseña modificada con éxito");
    }
    
    public static int menuApuestasPrincipal() {

        System.out.println("Menú Apuestas");
        System.out.println("(1) Mis Apuestas.");
        System.out.println("(2) Mostrar todas Apuestas,");
        System.out.println("(9) Atrás.");

        return sc.nextInt();
    }
    
    public static int menuMisApuestas() {

        System.out.println("Mis Apuestas");
        System.out.println("(1) Crear nueva Apuesta.");
        System.out.println("(2) Mostrar mis Apuestas.");
        System.out.println("(3) Modificar una apuesta.");
        System.out.println("(4) Borrar una apuesta.");
        System.out.println("(9) Atrás.");

        return sc.nextInt();
    }
    public static int menuTodasApuestas() {

        System.out.println("Todas las Apuestas");
        System.out.println("Quieres que muestre las estadísticas de las Apuestas también?");
        System.out.println("(1) Sí.");
        System.out.println("(2) No.");
        System.out.println("(9) Atrás.");

        return sc.nextInt();
    }
    
    /*************************
     **Acciones de los menus**
     *************************/
    
    //FUNCION ACCESO
    public static Usuario pedirCredenciales() {

        System.out.println("Email usuario:");
        String email = sc.next();

        System.out.println("Contraseña:");
        String pass = sc.next();

        Usuario user = new Usuario();
        user.setPassword(pass);
        user.setEmail(email);

        return user;
    }
  
    //FUNCION REGISTRO
    public static Usuario pedirUsuarioNuevo() {

        String nombre, email, password = null;
        System.out.println("Introduzca nombre de usuario");
        nombre = sc.next();
        System.out.println("Introduzca email");
        email = sc.next();
        System.out.println("Introduzca contraseña");
        password = sc.next();

        Usuario user = new Usuario(0, nombre, email, password);

        return user;
    }
    
    //FUNCION CAMBIAR CONTRASEÑA
    
    public static String confirmarPassword() {
		String pass = null;
    	
		System.out.println("Introduzca su nueva password: ");
		String passone = sc.next();
		System.out.println("Confirme su nueva password: ");
		String passtwo = sc.next();
		
		if(passtwo.equals(passone)) {
			pass = passtwo;
		} 
		
		return pass;
	}
    
    public static boolean modificarPassword(String email, String nuevapwd) {
    	UsuarioDao usDao = new UsuarioDao();
    	
    	return usDao.modificarPasswordUsuario(email, nuevapwd);
		
	}
    
    
    
    


}
