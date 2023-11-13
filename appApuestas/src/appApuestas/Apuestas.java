package appApuestas;

public class Apuestas {
	private int equipoLocal;
	private int equipoAway;
	private String apostador;
	private float cantidadApostada;

	public Apuestas(int equipoLocal, int equipoAway, String args, float cantidadApostada) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoAway = equipoAway;
		this.apostador = args;
		this.cantidadApostada = cantidadApostada;
	}

	public int getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(int equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public int getEquipoAway() {
		return equipoAway;
	}

	public void setEquipoAway(int equipoAway) {
		this.equipoAway = equipoAway;
	}

	public String getApostador() {
		return apostador;
	}

	public void setApostador(String apostador) {
		this.apostador = apostador;
	}

	public float getCantidadApostada() {
		return cantidadApostada;
	}

	public void setCantidadApostada(float cantidadApostada) {
		this.cantidadApostada = cantidadApostada;
	}

}
