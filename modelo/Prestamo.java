package modelo;

import modelo.estado.EstadoPrestamo;
import modelo.estado.EstadoSolicitado;

/**
 * Entidad Prestamo.
 * Patrón State: cambia su comportamiento según el estado del préstamo.
 */
public class Prestamo {
    private static int contador = 1;

    private int solicitudID;
    private String UsuarioID;
    private String LibroID;
    private EstadoPrestamo estado;

    public Prestamo(String usuarioID, String libroID) {
        this.solicitudID = contador++;
        this.UsuarioID = usuarioID;
        this.LibroID = libroID;
        this.estado = new EstadoSolicitado();
    }

    public int getSolicitudID() { return solicitudID; }
    public String getUsuarioID() { return UsuarioID; }
    public String getLibroID() { return LibroID; }

    public String getEstado() {
        return estado.getNombre();
    }

    public void cambiarEstado(EstadoPrestamo nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void aprobarPrestamo() {
        estado.aprobar(this);
    }

    public void registrarDevolucion() {
        estado.devolver(this);
    }
}
