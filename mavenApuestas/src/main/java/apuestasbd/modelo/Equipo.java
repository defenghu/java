package apuestasbd.modelo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo implements Comparable<Equipo> {

	private int idequipo;
	private String nombre;

	public int getIdequipo() {
		return idequipo;
	}

	public void setIdequipo(int idequipo) {
		this.idequipo = idequipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo(int idequipo, String nombre) {
		super();
		this.idequipo = idequipo;
		this.nombre = nombre;
	}

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Equipo [idequipo=" + idequipo + ", nombre=" + nombre + "]\n";
	}

	@Override
	public int compareTo(Equipo o) {
		int resultado = 0;

		resultado = this.nombre.compareTo(o.nombre);

		return resultado;
	}

	public static List<Equipo> cargarListaEquipos(String ruta) {
		List<Equipo> lEquipos = null;

		try {
			Path pathEquipos = Path.of(ruta);

			List<String> lineas = Files.readAllLines(pathEquipos);

			lEquipos = new ArrayList<Equipo>(lineas.size());

			for (String linea : lineas) {
				if (!linea.startsWith("*")) {
					Equipo equipo = new Equipo(linea);
					lEquipos.add(equipo);
				}
			}

			Collections.sort(lEquipos);

			System.out.println(lEquipos.toString());

		} catch (Exception e) {
			// TODO: handle exception
		}

		return lEquipos;

	}
	
	public static void main(String[] args) {
		System.out.println((Partido.generarPartidos(cargarListaEquipos("src/main/resources/equipos.txt"))).toString());
		
	}
}