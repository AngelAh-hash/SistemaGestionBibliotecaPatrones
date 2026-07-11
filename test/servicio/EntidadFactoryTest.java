package servicio;

import modelo.Libros;
import modelo.Usuarios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntidadFactoryTest {

    @Test
    public void testFactoryCreaUsuarioConCodigoUniversitario() {
        EntidadFactory factory = new EntidadFactory();

        Usuarios usuario = factory.crearUsuario("Jesús", "Hoyos", "Anaya", "999888777", 23227079);

        assertEquals("u23227080", usuario.getCodigo());
        assertEquals("Jesús", usuario.getNombre());
        assertEquals("Hoyos", usuario.getApellidoP());
    }

    @Test
    public void testFactoryCreaLibroCorrectamente() {
        EntidadFactory factory = new EntidadFactory();

        Libros libro = factory.crearLibro("LIB999", "Patrones Java", "Autor Prueba", "Español", 250, 7);

        assertEquals("LIB999", libro.getLibroID());
        assertEquals("Patrones Java", libro.getTitulo());
        assertEquals(7, libro.getDisponibles());
    }
}
