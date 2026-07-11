package servicio;

import dao.BaseDatosMemoria;
import modelo.Libros;
import modelo.Usuarios;

/**
 * Carga datos de prueba para que el sistema inicie con libros y alumnos registrados.
 * Ayuda a tomar capturas sin ingresar información manualmente.
 */
public class DatosInicialesBiblioteca {

    public void cargar(BaseDatosMemoria baseDatos) {
        cargarUsuarios(baseDatos);
        cargarLibros(baseDatos);
    }

    private void cargarUsuarios(BaseDatosMemoria baseDatos) {
        baseDatos.getListaUsuarios().agregarUsuarioSinNotificar(
                new Usuarios.Builder("u23227080", "Jesús Fabrizio")
                        .apellidoP("Hoyos")
                        .apellidoM("Anaya")
                        .telefono("987654321")
                        .build());

        baseDatos.getListaUsuarios().agregarUsuarioSinNotificar(
                new Usuarios.Builder("u23244036", "Alexander German")
                        .apellidoP("Pacoricona")
                        .apellidoM("Garcia")
                        .telefono("987654322")
                        .build());

        baseDatos.getListaUsuarios().agregarUsuarioSinNotificar(
                new Usuarios.Builder("u23244202", "Eliseo Gabriel")
                        .apellidoP("Gamboa")
                        .apellidoM("Quiñones")
                        .telefono("987654323")
                        .build());

        baseDatos.getListaUsuarios().agregarUsuarioSinNotificar(
                new Usuarios.Builder("u23265919", "Ángel")
                        .apellidoP("Arroyo")
                        .apellidoM("Hinojosa")
                        .telefono("987654324")
                        .build());

        baseDatos.getListaUsuarios().agregarUsuarioSinNotificar(
                new Usuarios.Builder("u23200001", "María Fernanda")
                        .apellidoP("López")
                        .apellidoM("Ramos")
                        .telefono("987654325")
                        .build());
    }

    private void cargarLibros(BaseDatosMemoria baseDatos) {
        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB001", "Clean Code")
                        .autor("Robert C. Martin")
                        .idioma("Inglés")
                        .paginas(464)
                        .disponibles(4)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB002", "Design Patterns")
                        .autor("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides")
                        .idioma("Inglés")
                        .paginas(395)
                        .disponibles(3)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB003", "UML y Patrones")
                        .autor("Craig Larman")
                        .idioma("Español")
                        .paginas(650)
                        .disponibles(5)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB004", "Java: Cómo Programar")
                        .autor("Paul Deitel, Harvey Deitel")
                        .idioma("Español")
                        .paginas(1200)
                        .disponibles(6)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB005", "Ingeniería de Software")
                        .autor("Ian Sommerville")
                        .idioma("Español")
                        .paginas(792)
                        .disponibles(4)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB006", "Refactoring")
                        .autor("Martin Fowler")
                        .idioma("Inglés")
                        .paginas(448)
                        .disponibles(2)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB007", "Effective Java")
                        .autor("Joshua Bloch")
                        .idioma("Inglés")
                        .paginas(416)
                        .disponibles(3)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB008", "Arquitectura Limpia")
                        .autor("Robert C. Martin")
                        .idioma("Español")
                        .paginas(432)
                        .disponibles(5)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB009", "Estructuras de Datos en Java")
                        .autor("Mark Allen Weiss")
                        .idioma("Español")
                        .paginas(600)
                        .disponibles(4)
                        .build());

        baseDatos.getListaLibros().agregarLibroSinNotificar(
                new Libros.Builder("LIB010", "Patrones GRASP Aplicados")
                        .autor("Craig Larman")
                        .idioma("Español")
                        .paginas(350)
                        .disponibles(3)
                        .build());
    }
}
