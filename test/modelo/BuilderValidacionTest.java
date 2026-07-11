package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderValidacionTest {

    @Test
    public void testBuilderUsuarioAceptaCodigoValido() {
        Usuarios usuario = new Usuarios.Builder("u23227080", "Jesús")
                .apellidoP("Hoyos")
                .apellidoM("Anaya")
                .telefono("987654321")
                .build();

        assertEquals("u23227080", usuario.getCodigo());
        assertEquals("Jesús Hoyos Anaya", usuario.nombreCompleto());
    }

    @Test
    public void testBuilderUsuarioRechazaCodigoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Usuarios.Builder("23227080", "Jesús").build();
        });
    }

    @Test
    public void testBuilderLibroCreaLibroComplejo() {
        Libros libro = new Libros.Builder("LIB100", "Arquitectura Limpia")
                .autor("Robert C. Martin")
                .idioma("Español")
                .paginas(432)
                .disponibles(5)
                .build();

        assertEquals("LIB100", libro.getLibroID());
        assertTrue(libro.estaDisponible());
        assertEquals(5, libro.getDisponibles());
    }

    @Test
    public void testBuilderLibroRechazaCodigoVacio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Libros.Builder("", "Libro sin código").build();
        });
    }
}
