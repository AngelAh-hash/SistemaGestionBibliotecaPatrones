package servicio;

import modelo.Usuarios;
import modelo.Libros;

/**
 * PATRÓN CREACIONAL: Factory Method.
 * Centraliza la creación de entidades y evita que la interfaz gráfica use constructores directamente.
 */
public class EntidadFactory implements IEntidadFactory {

    @Override
    public Usuarios crearUsuario(String nombre, String apellidoP, String apellidoM, String telefono, int numeroActual) {
        String codigo = String.format("u%08d", numeroActual + 1);
        return new Usuarios.Builder(codigo, nombre)
                .apellidoP(apellidoP)
                .apellidoM(apellidoM)
                .telefono(telefono)
                .build();
    }

    @Override
    public Libros crearLibro(String libroID, String titulo, String autor, String idioma, int paginas, int disponibles) {
        return new Libros.Builder(libroID, titulo)
                .autor(autor)
                .idioma(idioma)
                .paginas(paginas)
                .disponibles(disponibles)
                .build();
    }
}
