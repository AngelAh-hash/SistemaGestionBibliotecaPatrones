package modelo;

import dao.BaseDatosMemoria;

/**
 * GRASP Alta Cohesión: clase encargada solo de administrar la lista enlazada de libros.
 */
public class ListaLibros {
    private NodoLibro cabeza = null;

    public void agregarLibro(Libros libro) {
        agregarLibroSinNotificar(libro);
        BaseDatosMemoria.getInstance().notificarCambios();
    }

    public void agregarLibroSinNotificar(Libros libro) {
        NodoLibro nuevo = new NodoLibro(libro);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoLibro actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public java.util.List<Libros> obtenerTodos() {
        java.util.List<Libros> lista = new java.util.ArrayList<>();
        NodoLibro actual = cabeza;

        while (actual != null) {
            lista.add(actual.libro);
            actual = actual.siguiente;
        }
        return lista;
    }

    public int size() {
        int c = 0;
        NodoLibro a = cabeza;
        while (a != null) {
            c++;
            a = a.siguiente;
        }
        return c;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public Libros buscarPorID(String id) {
        NodoLibro actual = cabeza;

        while (actual != null) {
            if (actual.libro.getLibroID().equals(id)) {
                return actual.libro;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public NodoLibro buscarNodoPorID(String id) {
        NodoLibro actual = cabeza;

        while (actual != null) {
            if (actual.libro.getLibroID().equals(id)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public boolean editarLibro(String id, Libros datosNuevos) {
        NodoLibro nodo = buscarNodoPorID(id);

        if (nodo != null) {
            nodo.libro = datosNuevos;
            BaseDatosMemoria.getInstance().notificarCambios();
            return true;
        }
        return false;
    }

    public boolean eliminarPorID(String id) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.libro.getLibroID().equals(id)) {
            cabeza = cabeza.siguiente;
            BaseDatosMemoria.getInstance().notificarCambios();
            return true;
        }

        NodoLibro anterior = cabeza;
        NodoLibro actual = cabeza.siguiente;

        while (actual != null) {
            if (actual.libro.getLibroID().equals(id)) {
                anterior.siguiente = actual.siguiente;
                BaseDatosMemoria.getInstance().notificarCambios();
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return false;
    }

    public boolean reducirDisponibles(String idLibro) {
        NodoLibro actual = buscarNodoPorID(idLibro);
        if (actual == null) {
            return false;
        }
        if (!actual.libro.estaDisponible()) {
            return false;
        }
        actual.libro = actual.libro.prestarEjemplar();
        return true;
    }

    public boolean aumentarDisponibles(String idLibro) {
        NodoLibro actual = buscarNodoPorID(idLibro);
        if (actual == null) {
            return false;
        }
        actual.libro = actual.libro.devolverEjemplar();
        return true;
    }
}
