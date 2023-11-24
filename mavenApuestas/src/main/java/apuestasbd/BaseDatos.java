package apuestasbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import apuestasbd.modelo.Usuario;

public class BaseDatos {

	public static final String IP_SERVER = "localhost";
	public static final String PORT_SERVER = "3306";
	public static final String USER = "root";
	public static final String PASSWORD = "root";
	public static final String SERVER_CONNECTION = "jdbc:mysql://" + IP_SERVER + ":" + PORT_SERVER + "/bdapuestas";

	public static final String READ_USERS = "SELECT * FROM bdapuestas.usuarios;";
	public static final String FILTER_USERS = "SELECT * FROM bdapuestas.usuarios WHERE emal=? AND password=?";
	public static final String INSERT_USER = "INSERT INTO usuario (nombre, emal, password) VALUES (?, ?, ?)";

	/**
	 * Método que recupera de la base de datos el listado de usuarios registrados
	 * 
	 * 
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static List<Usuario> leerUsuarios() {
		List<Usuario> listaUsuarios = null;

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(SERVER_CONNECTION, BaseDatos.USER, BaseDatos.PASSWORD);
			System.out.println("Conexión realizada");
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(READ_USERS);

			Usuario usuarioAux = null;
			listaUsuarios = new ArrayList<Usuario>();
			while (rs.next()) {
				usuarioAux = new Usuario(rs.getInt("idusuarios"), rs.getString("nombre"), rs.getString("email"),
						rs.getString("password"));
				listaUsuarios.add(usuarioAux);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			System.out.println("ESTO SE EJECUTA SIEMPRE");
			try {
				connection.close();
				System.out.println("Conexión cerrada OK!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return listaUsuarios;

	}

	/**
	 * El método busca un usuario en la base de datos
	 * 
	 * @param email el email del usuario buscado
	 * @param pwd   la pwd del usuario buscado
	 * @return null si no lo encuentra o el usuario si existía con esas credenciales
	 */

	public static Usuario buscarExiste(String email, String pwd) {
		Usuario usuario = null;

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(SERVER_CONNECTION, BaseDatos.USER, BaseDatos.PASSWORD);
			System.out.println("Conexión realizada");
			PreparedStatement preparedSt = connection.prepareStatement(FILTER_USERS);
			preparedSt.setString(1, email);
			preparedSt.setString(2, pwd);
			ResultSet rs = preparedSt.executeQuery();

			if (rs.next()) {
				usuario = new Usuario(rs.getInt("idusuarios"), rs.getString("nombre"), rs.getString("email"),
						rs.getString("password"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("ESTO SE EJECUTA SIEMPRE");
			try {
				connection.close();
				System.out.println("Conexión cerrada OK!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return usuario;

	}
	
	public static boolean insertarUsuario(Usuario user) {
		boolean done = false;

		Connection connection = null;
		
		try {
			
			connection = DriverManager.getConnection(SERVER_CONNECTION, USER, PASSWORD);
			System.out.println("Conexión realizada");
			
			PreparedStatement preparedSt = connection.prepareStatement(INSERT_USER);
			
			preparedSt.setString(1, user.getNombre());
			preparedSt.setString(2, user.getEmail());
			preparedSt.setString(2, user.getPassword());
			
			preparedSt.executeUpdate();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("ESTO SE EJECUTA SIEMPRE");
			try {
				connection.close();
				System.out.println("Conexión cerrada OK!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return done;

	}

	public static void main(String[] args) {

		Usuario usuario = buscarExiste("valerianomoreno@gmail.com", "nomeacuerdo");

		if (usuario != null) {
			System.out.println("El usuario existe " + usuario.toString());

		} else {
			System.out.println("El usuario no existe");
		}

		usuario = buscarExiste("marcos@justeat.vip", "nomeacuerdo");

		if (usuario != null) {
			System.out.println("El usuario existe " + usuario.toString());

		} else {
			System.out.println("El usuario no existe");
		}
	}
}