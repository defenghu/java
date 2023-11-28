package apuestasbd;

import java.util.Scanner;

import apuestasbd.dao.UsuarioDao;
import apuestasbd.modelo.Usuario;

public class MainApuestasBd {
	public static void main(String[] args) {
		boolean salir = false;

		do {
			int opcion = Pantalla.menuInicio();
			if (opcion == 9) {
				salir = true;
			}
			Opciones.opcionesInicio(opcion);

		} while (!salir);
	}
	
	 public static void registroUsuario ()
	 {
		 //TODO 
		 /**
		  * 1 PEDIR DATOS DE USUARIO (nombre, email, password) POR PANTALLA
		  * 2 INSERTAR USUARIO (datos) en base datos
		  * 3 INFORMAR Registro OK
		  */
		 Usuario usuarioNuevo = Pantalla.pedirUsuarioNuevo();
		 
		 
		 
	 }
	 
	 public static void login() {
		 Usuario us = Pantalla.pedirCredenciales();
		 UsuarioDao usDao = new UsuarioDao();
		 
		 us = usDao.buscarExiste(us.getEmail(), us.getPassword());
		 
		 if(us!=null) {
			 System.out.println("Accedido con éxito!");
			 Pantalla.menuPantallaPrincipal();
		 } else {
			 System.out.println("1");
			 login();
		 }
		 
	}

}