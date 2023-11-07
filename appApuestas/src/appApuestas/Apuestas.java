package appApuestas;

public class Apuestas {
	private int equipoLocal;
	private int equipoAway;
	private String apostador;
	
	public Apuestas() {
		super();
	}
	
	public Apuestas(int equipoLocal, int equipoAway, String args) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoAway = equipoAway;
		this.apostador = args; 
	}
	
	
}
