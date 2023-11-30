package dia14Java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ficheros {
	
	public static void main(String[] args) throws IOException {
		
		Path pathEquipos = Path.of("src/dia14Java/equipos.txt");
		
		List<String> lequipos = Files.readAllLines(pathEquipos);
		
		System.out.println(lequipos);
	}
}
