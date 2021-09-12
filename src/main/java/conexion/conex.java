package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class conex {
	public static Connection getConexion( ) {

		Connection con = null;

		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc;mysql://localhost/clinica";
		String usuario = "root";
		String contraseņa = "mysql";

		con = (Connection) DriverManager.getConnection(url,usuario,contraseņa);

		} catch (ClassNotFoundException e) {
		System.out.println("Problemas con el driver");

		e.printStackTrace();
		} catch (SQLException e) {
		System.out.println("No establece conexion con la BD ");
		e.printStackTrace();
		}


		return con;

		}

}
