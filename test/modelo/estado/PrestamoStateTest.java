package modelo.estado;

import modelo.Prestamo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrestamoStateTest {

    @Test
    public void testCambioDeEstadosDelPrestamo() {
        Prestamo prestamo = new Prestamo("u23227080", "LIB001");

        assertEquals("SOLICITADO", prestamo.getEstado());

        prestamo.aprobarPrestamo();
        assertEquals("PRESTADO", prestamo.getEstado());

        prestamo.registrarDevolucion();
        assertEquals("DEVUELTO", prestamo.getEstado());
    }

    @Test
    public void testNoPermiteDevolverPrestamoSolicitado() {
        Prestamo prestamo = new Prestamo("u23227080", "LIB001");

        assertThrows(IllegalStateException.class, prestamo::registrarDevolucion);
    }

    @Test
    public void testNoPermiteAprobarPrestamoDosVeces() {
        Prestamo prestamo = new Prestamo("u23227080", "LIB001");
        prestamo.aprobarPrestamo();

        assertThrows(IllegalStateException.class, prestamo::aprobarPrestamo);
    }
}
