package appApuestas.bd;

import java.util.List;

import appApuestas.Apuestas;

public interface CRUDApuestas {
	
	boolean crearApuesta (Apuestas apuesta);
	
	List<Apuestas> leerApuestas();
	
	
}
