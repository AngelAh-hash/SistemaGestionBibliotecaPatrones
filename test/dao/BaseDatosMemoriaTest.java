package dao;

import modelo.Libros;
import modelo.Usuarios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaseDatosMemoriaTest {

    @Test
    public void testSingletonRetornaLaMismaInstancia() {
        BaseDatosMemoria instancia1 = BaseDatosMemoria.getInstance();
        BaseDatosMemoria instancia2 = BaseDatosMemoria.getInstance();

        assertSame(instancia1, instancia2, "Singleton debe devolver siempre la misma instancia");
    }

    @Test
    public void testDatosInicialesCargados() {
        BaseDatosMemoria bd = BaseDatosMemoria.getInstance();

        Usuarios alumno = bd.getListaUsuarios().buscarPorCodigo("u23227080");
        Libros libro = bd.getListaLibros().buscarPorID("LIB001");

        assertNotNull(alumno, "Debe existir el alumno inicial con código u23227080");
        assertNotNull(libro, "Debe existir el libro inicial LIB001");
        assertEquals("Clean Code", libro.getTitulo());
    }
}
