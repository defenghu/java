package apuestasbd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import apuestasbd.BaseDatos;
import apuestasbd.modelo.Usuario;

public class UsuarioDao {

	public static final String INSTRUCCION_LEER_USUARIOS = "SELECT * FROM bdapuestas.usuarios;";
	public static final String INSTRUCCION_LEER_USUARIOS_FILTRO = "SELECT * FROM bdapuestas.usuarios WHERE email=? AND password=?";
	public static final String INSTRUCCION_INSERTAR_USUARIO = "INSERT INTO `bdapuestas`.`usuarios` (`nombre`, `email`, `password`) VALUES (?,?,?)";
	public static final String INSTRUCCION_BORRAR_USUARIO = "DELETE FROM bdapuestas.usuarios WHERE email = ?";
	public static final String INSTRUCCION_MODIFICAR_PASSWORD_USUARIO = "UPDATE bdapuestas.usuarios SET password=? WHERE email=?";

	public List<Usuario> leerUsuarios() {
		List<Usuario> listaUsuarios = null;

		try (Connection conexion = BaseDatos.obtenerConexion();) {

			System.out.println("Conexión realizada");
			Statement instruccion = conexion.createStatement();
			ResultSet rs = instruccion.executeQuery(INSTRUCCION_LEER_USUARIOS);
			int idUsuarioAux = 0;
			String nombreAux, emailAux, pwdWaux = null;
			Usuario usuarioAux = null;
			listaUsuarios = new ArrayList<Usuario>();
			while (rs.next()) {
				idUsuarioAux = rs.getInt("idusuarios");
				nombreAux = rs.getString("nombre");
				emailAux = rs.getString("email");
				pwdWaux = rs.getString("password");
				usuarioAux = new Usuario(idUsuarioAux, nombreAux, emailAux, pwdWaux);
				listaUsuarios.add(usuarioAux);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return listaUsuarios;

	}

	public Usuario buscarExiste(String email, String pwd) {
		
		Usuario usuario = null;

		try (Connection conexion = BaseDatos.obtenerConexion()) {

			System.out.println("Conexión realizada");
			PreparedStatement instruccion = conexion.prepareStatement(INSTRUCCION_LEER_USUARIOS_FILTRO);
			instruccion.setString(1, email);
			instruccion.setString(2, pwd);
			ResultSet rs = instruccion.executeQuery();
			int idUsuarioAux = 0;
			String nombreAux, emailAux, pwdWaux = null;
			if (rs.next()) {
				idUsuarioAux = rs.getInt("idusuarios");
				nombreAux = rs.getString("nombre");
				emailAux = rs.getString("email");
				pwdWaux = rs.getString("password");
				usuario = new Usuario(idUsuarioAux, nombreAux, emailAux, pwdWaux);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return usuario;

	}
	
	public boolean insertarUsuario(Usuario usuario) {

		boolean insertado = false;

		try (Connection conexion = BaseDatos.obtenerConexion()) {

			System.out.println("Conexión realizada");
			PreparedStatement instruccion = conexion.prepareStatement(INSTRUCCION_INSERTAR_USUARIO);
			instruccion.setString(1, usuario.getNombre());
			instruccion.setString(2, usuario.getEmail());
			instruccion.setString(3, usuario.getPassword());
			int nfilasnuevas = instruccion.executeUpdate();
			insertado = (nfilasnuevas == 1);

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return insertado;
	}

	public boolean borrarUsuario(String email) {
		boolean borrado = false;

		try (Connection conexion = BaseDatos.obtenerConexion();) {
			PreparedStatement borrarUsuario = conexion.prepareStatement(INSTRUCCION_BORRAR_USUARIO);
			borrarUsuario.setString(1, email);
			int nFila = borrarUsuario.executeUpdate();
			if (nFila == 1) {
				borrado = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return borrado;
	}

	public boolean modificarPasswordUsuario(String email, String nuevapwd) {
		boolean modificado = false;

		try (Connection conexion = BaseDatos.obtenerConexion();) {

			PreparedStatement modificarPassword = conexion.prepareStatement(INSTRUCCION_MODIFICAR_PASSWORD_USUARIO);
			modificarPassword.setString(1, nuevapwd);
			modificarPassword.setString(2, email);
			int nfilasModificadas = modificarPassword.executeUpdate();
			modificado = (nfilasModificadas == 1);

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return modificado;
	}

}
