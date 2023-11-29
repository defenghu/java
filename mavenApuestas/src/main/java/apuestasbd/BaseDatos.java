package apuestasbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import apuestasbd.modelo.Usuario;

public class BaseDatos {
	
	public static final String SERVIDOR_BD = "localhost";
	public static final String PUERTO = "3306";
	public static final String USUARIO = "root";
	public static final String PWD = "root";
	public static final String CADENA_DE_CONEXION = "jdbc:mysql://"+SERVIDOR_BD+":"+PUERTO+"/bdapuestas";
	
	
	
	public static Connection obtenerConexion () throws SQLException
	{
		Connection connection = null;
		
			connection = DriverManager.getConnection(CADENA_DE_CONEXION, BaseDatos.USUARIO, BaseDatos.PWD);
		
		return connection;
		
	}
	
}
