package apuestasbd;


import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class EjemploProperties
{
    public static void main(String[] pepi) throws Throwable
    {

        Properties fichero_propiedaes = null;

        fichero_propiedaes = new Properties();

        FileReader fr = new FileReader("mavenApuestas/src/main/java/apuestasbd/cuento.properties", StandardCharsets.UTF_8);

        fichero_propiedaes.load(fr);

        String vd = fichero_propiedaes.getProperty("start");

        System.out.println(vd);

        fr.close();

    }

}