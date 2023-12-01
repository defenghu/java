package apuestasbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import apuestasbd.modelo.Equipo;

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
	
	
	
	
	public static void generarPartidos() {
		
		try (Connection conexion = BaseDatos.obtenerConexion();){
			  conexion.setAutoCommit(false);        
			  PreparedStatement prepStmt = conexion.prepareStatement(    
			    "insert into equipos(idequipos, nombre) values (?,?)");
			  List<Equipo> lEquipos = new ArrayList<>();	
			lEquipos = Equipo.cargarListaEquipos("src/main/resources/equipos.txt");
			  for (int i = 0; i < lEquipos.size(); i++) {
				  Equipo e = lEquipos.get(i);
				    prepStmt.setInt(1, e.getIdequipo());       
				    prepStmt.setString(2,e.getNombre());
				    prepStmt.executeUpdate();
			  }
		} catch(Exception e) {
			  // process BatchUpdateException
		} 
	}
	
}