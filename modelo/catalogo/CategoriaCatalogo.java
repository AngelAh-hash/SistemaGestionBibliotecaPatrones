package modelo.catalogo;

import java.util.ArrayList;
import java.util.List;

/**
 * PATRÓN ESTRUCTURAL: Composite.
 * Permite tratar una categoría y un libro individual de forma uniforme.
 */
public class CategoriaCatalogo implements ComponenteCatalogo {
    private final String nombre;
    private final List<ComponenteCatalogo> elementos = new ArrayList<>();

    public CategoriaCatalogo(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteCatalogo componente) {
        elementos.add(componente);
    }

    public void remover(ComponenteCatalogo componente) {
        elementos.remove(componente);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int calcularDisponibles() {
        int total = 0;
        for (ComponenteCatalogo c : elementos) {
            total += c.calcularDisponibles();
        }
        return total;
    }

    @Override
    public String descripcion() {
        StringBuilder sb = new StringBuilder("Categoría: ").append(nombre).append("\n");
        for (ComponenteCatalogo c : elementos) {
            sb.append(" - ").append(c.descripcion()).append("\n");
        }
        return sb.toString();
    }
}
