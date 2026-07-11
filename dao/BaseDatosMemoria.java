package dao;

import servicio.DataObserver;
import modelo.ListaLibros;
import modelo.ListaUsuarios;
import modelo.Prestamo;
import modelo.Devolucion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import servicio.notificacion.EmailNotificadorAdapter;
import servicio.DatosInicialesBiblioteca;

/**
 * PATRÓN CREACIONAL: Singleton Thread-Safe.
 * Mantiene una sola base de datos en memoria para todo el sistema.
 * También actúa como Observable del patrón Observer.
 */
public class BaseDatosMemoria implements IBasedeDatos {
    private static volatile BaseDatosMemoria instancia;

    private final ListaLibros listaLibros;
    private final ListaUsuarios listaUsuarios;
    private final Queue<Prestamo> colaPrestamos;
    private final List<Devolucion> listaDevoluciones;
    private final Stack<Devolucion> pilaDevoluciones;
    private final List<DataObserver> observers;

    private BaseDatosMemoria() {
        this.listaLibros = new ListaLibros();
        this.listaUsuarios = new ListaUsuarios();
        this.colaPrestamos = new LinkedList<>();
        this.listaDevoluciones = new ArrayList<>();
        this.pilaDevoluciones = new Stack<>();
        this.observers = new ArrayList<>();
        this.observers.add(new EmailNotificadorAdapter()); // Adapter + Observer
        new DatosInicialesBiblioteca().cargar(this);
    }

    public static BaseDatosMemoria getInstance() {
        if (instancia == null) {
            synchronized (BaseDatosMemoria.class) {
                if (instancia == null) {
                    instancia = new BaseDatosMemoria();
                }
            }
        }
        return instancia;
    }

    public ListaLibros getListaLibros() {
        return listaLibros;
    }

    public ListaUsuarios getListaUsuarios() {
        return listaUsuarios;
    }

    public Queue<Prestamo> getColaPrestamos() {
        return colaPrestamos;
    }

    public List<Devolucion> getListaDevoluciones() {
        return listaDevoluciones;
    }

    public Stack<Devolucion> getPilaDevoluciones() {
        return pilaDevoluciones;
    }

    public void agregarObserver(DataObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removerObserver(DataObserver observer) {
        observers.remove(observer);
    }

    public void notificarCambios() {
        for (DataObserver observer : observers) {
            observer.onDataChanged();
        }
    }
}
