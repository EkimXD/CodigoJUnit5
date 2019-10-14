package calidadDBTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConexionServicioTest {

	@DisplayName(" n.n/ ")
	@Test
	void testInsertarRegistro() {
		boolean actual=ConexionServicio.insertarRegistro("ElementoPrueba");
		boolean expected=true;
		assertEquals(expected, actual);
	}

}
