package calidadDBTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConexionDBTest {

	@Test
	void testIniciarConexion() {
		Object actual=ConexionDB.iniciarConexion();
		Object notExpected=null;
		assertNotEquals(notExpected, actual);
	}

	@Test
	void testCerrarConexion() {
		boolean actual=ConexionDB.cerrarConexion();
		boolean expected=true;
		assertEquals(expected, actual);
	}

}