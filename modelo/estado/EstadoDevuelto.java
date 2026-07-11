package modelo.estado;

import modelo.Prestamo;

public class EstadoDevuelto implements EstadoPrestamo {
    @Override
    public String getNombre() {
        return "DEVUELTO";
    }

    @Override
    public void aprobar(Prestamo prestamo) {
        throw new IllegalStateException("No se puede aprobar un préstamo ya devuelto.");
    }

    @Override
    public void devolver(Prestamo prestamo) {
        throw new IllegalStateException("El préstamo ya fue devuelto.");
    }
}
