import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PruebasTareaDosTest {

    @Test
    void testPasswordValida() {
        assertTrue(PruebasTareaDosCodigo.isValidPassword("Password123"));
    }

    @Test
    void testSinMayusculas() {
        assertFalse(PruebasTareaDosCodigo.isValidPassword("password123"));
    }

    @Test
    void testSinNumeros() {
        assertFalse(PruebasTareaDosCodigo.isValidPassword("Password"));
    }

    @Test
    void testMuyCorta() {
        assertFalse(PruebasTareaDosCodigo.isValidPassword("Pass1"));
    }
    @Test
    void testPasswordNull() {
        assertFalse(PruebasTareaDosCodigo.isValidPassword(null));
    }
    @Test
    void testSinNumeroNiMayusculas() {
        assertFalse(PruebasTareaDosCodigo.isValidPassword("password"));
    }


}
