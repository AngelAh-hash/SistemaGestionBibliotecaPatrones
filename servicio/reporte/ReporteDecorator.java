package servicio.reporte;

public abstract class ReporteDecorator implements ReporteBiblioteca {
    protected final ReporteBiblioteca reporte;

    public ReporteDecorator(ReporteBiblioteca reporte) {
        this.reporte = reporte;
    }
}
