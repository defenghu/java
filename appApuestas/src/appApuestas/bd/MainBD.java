package appApuestas.bd;

public class MainBD {

	public static void main(String[] args) {
		CRUDApuestas api = new CRUDAPI();
		CRUDApuestas api2 = new CRUDAPI2();

		api.crearApuesta(null);
		api2.crearApuesta(null);
	}
}
