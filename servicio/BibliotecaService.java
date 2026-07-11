package servicio;

import dao.IBasedeDatos;
import modelo.Prestamo;
import modelo.Devolucion;
import java.util.ArrayList;
import java.util.List;

/**
 * Capa de aplicación / servicio.
 * GRASP Alta Cohesión: aquí se coordinan préstamos y devoluciones, no la interfaz gráfica.
 */
public class BibliotecaService implements IBibliotecaService {
    private final IBasedeDatos baseDatos;

    public BibliotecaService(IBasedeDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    @Override
    public void prestarLibro(String idUsuario, String idLibro) {
        Prestamo prestamo = new Prestamo(idUsuario, idLibro);
        baseDatos.getColaPrestamos().add(prestamo);
        baseDatos.notificarCambios();
    }

    @Override
    public Prestamo procesarPrestamo() {
        Prestamo prestamo = baseDatos.getColaPrestamos().poll();
        if (prestamo == null) {
            return null;
        }

        prestamo.aprobarPrestamo(); // State
        Devolucion devolucion = new Devolucion(prestamo.getUsuarioID(), prestamo.getLibroID());
        baseDatos.getListaDevoluciones().add(devolucion);
        baseDatos.getPilaDevoluciones().push(devolucion);
        baseDatos.getListaLibros().reducirDisponibles(prestamo.getLibroID());
        baseDatos.notificarCambios();

        return prestamo;
    }

    @Override
    public Devolucion procesarDevolucion() {
        Devolucion devolucion = baseDatos.getPilaDevoluciones().isEmpty()
                ? null
                : baseDatos.getPilaDevoluciones().pop();

        if (devolucion == null) {
            return null;
        }

        baseDatos.getListaLibros().aumentarDisponibles(devolucion.getLibroID());
        baseDatos.getListaDevoluciones().remove(devolucion);
        baseDatos.notificarCambios();

        return devolucion;
    }

    @Override
    public List<Prestamo> obtenerPrestamosPendientes() {
        return new ArrayList<>(baseDatos.getColaPrestamos());
    }

    @Override
    public List<Devolucion> obtenerDevolucionesPendientes() {
        return new ArrayList<>(baseDatos.getListaDevoluciones());
    }
}
