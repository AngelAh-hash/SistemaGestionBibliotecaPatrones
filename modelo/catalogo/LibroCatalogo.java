package modelo.catalogo;

import modelo.Libros;

public class LibroCatalogo implements ComponenteCatalogo {
    private final Libros libro;

    public LibroCatalogo(Libros libro) {
        this.libro = libro;
    }

    @Override
    public String getNombre() {
        return libro.getTitulo();
    }

    @Override
    public int calcularDisponibles() {
        return libro.getDisponibles();
    }

    @Override
    public String descripcion() {
        return libro.resumen();
    }
}
