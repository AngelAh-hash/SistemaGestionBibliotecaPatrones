package servicio.reporte;

import java.util.List;
import modelo.Libros;

public class ReporteLibrosBase implements ReporteBiblioteca {
    private final List<Libros> libros;

    public ReporteLibrosBase(List<Libros> libros) {
        this.libros = libros;
    }

    @Override
    public String generar() {
        StringBuilder sb = new StringBuilder("REPORTE DE LIBROS\n");
        for (Libros l : libros) {
            sb.append(l.resumen()).append("\n");
        }
        return sb.toString();
    }
}
