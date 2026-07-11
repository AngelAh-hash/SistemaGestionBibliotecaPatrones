package servicio.reporte;

import java.time.LocalDateTime;

/** PATRÓN ESTRUCTURAL: Decorator. */
public class ReporteConFecha extends ReporteDecorator {
    public ReporteConFecha(ReporteBiblioteca reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        return "Generado: " + LocalDateTime.now() + "\n" + reporte.generar();
    }
}
