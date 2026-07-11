package modelo.estado;

import modelo.Prestamo;

public class EstadoPrestado implements EstadoPrestamo {
    @Override
    public String getNombre() {
        return "PRESTADO";
    }

    @Override
    public void aprobar(Prestamo prestamo) {
        throw new IllegalStateException("El préstamo ya fue aprobado.");
    }

    @Override
    public void devolver(Prestamo prestamo) {
        prestamo.cambiarEstado(new EstadoDevuelto());
    }
}
