package servicio;

import controlador.BibliotecaController;
import modelo.Libros;
import modelo.Usuarios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaFacadeControllerTest {

    @Test
    public void testControllerDelegaRegistroALaFacade() {
        BibliotecaController controller = new BibliotecaController();

        Libros libro = controller.registrarLibro("LIB777", "Libro Controller", "Autor", "Español", 100, 2);

        assertEquals("LIB777", libro.getLibroID());
        assertNotNull(controller.buscarLibroPorID("LIB777"));
    }

    @Test
    public void testFacadePermiteCrearUsuarioManual() {
        BibliotecaFacade facade = new BibliotecaFacade();

        Usuarios usuario = facade.crearUsuarioManual("u23299999", "Alumno", "Prueba", "JUnit", "999999999");

        assertEquals("u23299999", usuario.getCodigo());
        assertEquals("Alumno Prueba JUnit", usuario.nombreCompleto());
    }
}
