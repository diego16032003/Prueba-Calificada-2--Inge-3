import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PruebasTareaDos {

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
}
