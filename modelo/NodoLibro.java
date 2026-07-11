package modelo;

public class NodoLibro {
    public Libros libro;
    public NodoLibro siguiente;

    public NodoLibro(Libros libro) {
        this.libro = libro;
        this.siguiente = null;
    }
}

