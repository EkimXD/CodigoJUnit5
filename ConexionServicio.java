package calidadDBTest;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionServicio {

	public static boolean insertarRegistro(String elemento) {
		java.sql.Connection cnx=ConexionDB.iniciarConexion();
		boolean connectQ = false;
		try {
			String query = "INSERT INTO `test`.`prueba` (`elemento`) VALUES (?)";
			PreparedStatement stmt = cnx.prepareStatement(query);
			stmt.setString(1, elemento);
			int result = stmt.executeUpdate();
			if (result == 1)
				connectQ = true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		ConexionDB.cerrarConexion();
		return connectQ;
	}
}
