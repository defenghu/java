package apuestasbd.modelo;

public class Apuesta {
	private float valor;
	private int golesVisitante;
	private int idpartido;
	private int golesLocal;
	
	
	public Apuesta() {
		super();
	}
	
	public Apuesta(int valor, int golesLocales, int golesVisitante, int idpartido) {
		super();
		this.valor = valor;
		this.golesLocal = golesLocales;
		this.golesVisitante = golesVisitante;
		this.idpartido = idpartido;
		
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	public int getIdpartido() {
		return idpartido;
	}
	public void setIdpartido(int idpartido) {
		this.idpartido = idpartido;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
}
