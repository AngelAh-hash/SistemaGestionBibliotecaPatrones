package servicio.reporte;

/** PATRÓN ESTRUCTURAL: Decorator. */
public class ReporteConPie extends ReporteDecorator {
    public ReporteConPie(ReporteBiblioteca reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        return reporte.generar() + "\nSistema de Gestión de Biblioteca Pública - Reporte generado correctamente.";
    }
}
