package servicio;

import dao.IBasedeDatos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import modelo.Devolucion;
import modelo.Libros;
import modelo.ListaLibros;
import modelo.ListaUsuarios;
import modelo.Prestamo;
import org.junit.jupiter.api.Test;
import servicio.command.HistorialComandos;
import servicio.command.RegistrarPrestamoCommand;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaServiceCommandObserverTest {

    @Test
    public void testServicioProcesaPrestamoYNotificaObserver() {
        BaseDatosPrueba bd = new BaseDatosPrueba();
        bd.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIBT01", "Libro de Prueba")
                        .disponibles(2)
                        .build()
        );

        BibliotecaService service = new BibliotecaService(bd);

        service.prestarLibro("u23227080", "LIBT01");
        assertEquals(1, bd.getColaPrestamos().size());
        assertEquals(1, bd.notificaciones);

        Prestamo prestamo = service.procesarPrestamo();

        assertNotNull(prestamo);
        assertEquals("PRESTADO", prestamo.getEstado());
        assertEquals(1, bd.getListaLibros().buscarPorID("LIBT01").getDisponibles());
        assertEquals(1, bd.getListaDevoluciones().size());
        assertEquals(2, bd.notificaciones);
    }

    @Test
    public void testCommandRegistraPrestamoEnHistorial() {
        BaseDatosPrueba bd = new BaseDatosPrueba();
        BibliotecaService service = new BibliotecaService(bd);
        HistorialComandos historial = new HistorialComandos();

        historial.ejecutar(new RegistrarPrestamoCommand(service, "u23227080", "LIB001"));

        assertEquals(1, bd.getColaPrestamos().size());
        assertEquals(1, historial.obtenerHistorial().size());
        assertTrue(historial.obtenerHistorial().get(0).contains("Registrar préstamo"));
    }

    static class BaseDatosPrueba implements IBasedeDatos {
        private final ListaLibros listaLibros = new ListaLibros();
        private final ListaUsuarios listaUsuarios = new ListaUsuarios();
        private final Queue<Prestamo> colaPrestamos = new LinkedList<>();
        private final List<Devolucion> listaDevoluciones = new ArrayList<>();
        private final Stack<Devolucion> pilaDevoluciones = new Stack<>();
        private final List<DataObserver> observers = new ArrayList<>();
        int notificaciones = 0;

        @Override
        public ListaLibros getListaLibros() { return listaLibros; }

        @Override
        public ListaUsuarios getListaUsuarios() { return listaUsuarios; }

        @Override
        public Queue<Prestamo> getColaPrestamos() { return colaPrestamos; }

        @Override
        public List<Devolucion> getListaDevoluciones() { return listaDevoluciones; }

        @Override
        public Stack<Devolucion> getPilaDevoluciones() { return pilaDevoluciones; }

        @Override
        public void agregarObserver(DataObserver observer) { observers.add(observer); }

        @Override
        public void removerObserver(DataObserver observer) { observers.remove(observer); }

        @Override
        public void notificarCambios() {
            notificaciones++;
            for (DataObserver observer : observers) {
                observer.onDataChanged();
            }
        }
    }
}
