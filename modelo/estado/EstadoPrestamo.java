package modelo.estado;

import modelo.Prestamo;

public interface EstadoPrestamo {
    String getNombre();
    void aprobar(Prestamo prestamo);
    void devolver(Prestamo prestamo);
}
