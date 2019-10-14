package calidadDBTest;

import java.sql.*;

public class ConexionDB {

	private static Connection cnx = null;
	private static String name = "com.mysql.jdbc.Driver";
	private static String dataBase = "jdbc:mysql://localhost/test";
	private static String user = "root";
	private static String password = "root";

	public ConexionDB() {
	}

	public static Connection iniciarConexion() {
		if (cnx == null) {
			try {
				Class.forName(name);
				cnx = DriverManager.getConnection(dataBase, user, password);
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			} catch (ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
		}
		return cnx;
	}

	public static boolean cerrarConexion() {
		boolean connectQ = false;
		if (cnx != null) {
			try {
				cnx.close();
				connectQ = true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return connectQ;
	}

}
