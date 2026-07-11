package patrones;

import java.util.Arrays;
import modelo.Libros;
import modelo.catalogo.CategoriaCatalogo;
import modelo.catalogo.LibroCatalogo;
import org.junit.jupiter.api.Test;
import servicio.reporte.ReporteBiblioteca;
import servicio.reporte.ReporteConFecha;
import servicio.reporte.ReporteConPie;
import servicio.reporte.ReporteLibrosBase;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorCompositeTest {

    @Test
    public void testDecoratorAgregaFechaYPieAlReporte() {
        Libros libro = new Libros.Builder("LIB200", "Libro Decorator")
                .autor("Autor")
                .disponibles(1)
                .build();

        ReporteBiblioteca reporte = new ReporteLibrosBase(Arrays.asList(libro));
        reporte = new ReporteConFecha(reporte);
        reporte = new ReporteConPie(reporte);

        String resultado = reporte.generar();

        assertTrue(resultado.contains("Generado:"));
        assertTrue(resultado.contains("REPORTE DE LIBROS"));
        assertTrue(resultado.contains("Libro Decorator"));
        assertTrue(resultado.contains("Sistema de Gestión de Biblioteca Pública"));
    }

    @Test
    public void testCompositeCalculaTotalDeDisponibles() {
        CategoriaCatalogo categoria = new CategoriaCatalogo("Programación");
        categoria.agregar(new LibroCatalogo(new Libros.Builder("LIB301", "Java")
                .disponibles(3)
                .build()));
        categoria.agregar(new LibroCatalogo(new Libros.Builder("LIB302", "UML")
                .disponibles(4)
                .build()));

        assertEquals(7, categoria.calcularDisponibles());
        assertTrue(categoria.descripcion().contains("Categoría: Programación"));
    }
}
