package servicio;

import modelo.Prestamo;
import modelo.Devolucion;
import java.util.List;

public interface IBibliotecaService {
    void prestarLibro(String idUsuario, String idLibro);
    Prestamo procesarPrestamo();
    Devolucion procesarDevolucion();
    List<Prestamo> obtenerPrestamosPendientes();
    List<Devolucion> obtenerDevolucionesPendientes();
}
