package modelo;

/**
 * Entidad principal del dominio biblioteca.
 * GRASP Experto en Información: el libro conoce su propio stock.
 * Patrón Builder: permite crear libros de forma clara y sin constructores gigantes.
 */
public class Libros {
    private String libroID;
    private String titulo;
    private String autor;
    private String idioma;
    private int paginas;
    private int disponibles;

    public Libros(String libroID, String titulo, String autor,
                 String idioma, int paginas, int disponibles) {
        this.libroID = libroID;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.paginas = paginas;
        this.disponibles = disponibles;
    }

    public String getLibroID() { return libroID; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIdioma() { return idioma; }
    public int getPaginas() { return paginas; }
    public int getDisponibles() { return disponibles; }

    public boolean estaDisponible() {
        return disponibles > 0;
    }

    public Libros conDisponibles(int nuevosDisponibles) {
        return new Libros(libroID, titulo, autor, idioma, paginas, nuevosDisponibles);
    }

    public Libros prestarEjemplar() {
        if (!estaDisponible()) {
            return this;
        }
        return conDisponibles(disponibles - 1);
    }

    public Libros devolverEjemplar() {
        return conDisponibles(disponibles + 1);
    }

    public String resumen() {
        return libroID + " - " + titulo + " | Autor: " + autor + " | Disponibles: " + disponibles;
    }

    // PATRÓN CREACIONAL: Builder
    public static class Builder {
        private String libroID;
        private String titulo;
        private String autor = "Sin autor";
        private String idioma = "Español";
        private int paginas = 0;
        private int disponibles = 1;

        public Builder(String libroID, String titulo) {
            if (libroID == null || libroID.trim().isEmpty()) {
                throw new IllegalArgumentException("El código del libro es obligatorio");
            }
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new IllegalArgumentException("El título del libro es obligatorio");
            }
            this.libroID = libroID;
            this.titulo = titulo;
        }

        public Builder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public Builder idioma(String idioma) {
            this.idioma = idioma;
            return this;
        }

        public Builder paginas(int paginas) {
            this.paginas = paginas;
            return this;
        }

        public Builder disponibles(int disponibles) {
            this.disponibles = disponibles;
            return this;
        }

        public Libros build() {
            return new Libros(libroID, titulo, autor, idioma, paginas, disponibles);
        }
    }
}
