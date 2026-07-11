package modelo.estado;

import modelo.Prestamo;

public class EstadoSolicitado implements EstadoPrestamo {
    @Override
    public String getNombre() {
        return "SOLICITADO";
    }

    @Override
    public void aprobar(Prestamo prestamo) {
        prestamo.cambiarEstado(new EstadoPrestado());
    }

    @Override
    public void devolver(Prestamo prestamo) {
        throw new IllegalStateException("No se puede devolver un préstamo que aún no fue prestado.");
    }
}
