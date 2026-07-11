package controlador;

import java.util.List;
import modelo.Devolucion;
import modelo.Libros;
import modelo.Prestamo;
import modelo.Usuarios;
import servicio.BibliotecaFacade;

/**
 * PATRÓN GRASP: Controller.
 * La interfaz gráfica envía sus eventos a este controlador y no procesa reglas de negocio pesadas.
 */
public class BibliotecaController {
    private final BibliotecaFacade facade;

    public BibliotecaController() {
        this.facade = new BibliotecaFacade();
    }

    public Usuarios registrarUsuario(String nombre, String apellidoP, String apellidoM, String telefono) {
        return facade.registrarUsuario(nombre, apellidoP, apellidoM, telefono);
    }

    public Libros registrarLibro(String libroID, String titulo, String autor, String idioma, int paginas, int disponibles) {
        return facade.registrarLibro(libroID, titulo, autor, idioma, paginas, disponibles);
    }

    public Libros crearLibro(String libroID, String titulo, String autor, String idioma, int paginas, int disponibles) {
        return facade.crearLibro(libroID, titulo, autor, idioma, paginas, disponibles);
    }

    public Usuarios crearUsuarioManual(String codigo, String nombre, String apellidoP, String apellidoM, String telefono) {
        return facade.crearUsuarioManual(codigo, nombre, apellidoP, apellidoM, telefono);
    }

    public Libros buscarLibroPorID(String id) {
        return facade.buscarLibroPorID(id);
    }

    public boolean editarLibro(String id, Libros nuevo) {
        return facade.editarLibro(id, nuevo);
    }

    public boolean eliminarLibroPorID(String id) {
        return facade.eliminarLibroPorID(id);
    }

    public Usuarios obtenerUsuarioPorIndice(int fila) {
        return facade.obtenerUsuarioPorIndice(fila);
    }

    public Usuarios buscarUsuarioPorCodigo(String codigo) {
        return facade.buscarUsuarioPorCodigo(codigo);
    }

    public int buscarIndiceUsuarioPorCodigo(String codigo) {
        return facade.buscarIndiceUsuarioPorCodigo(codigo);
    }

    public boolean editarUsuario(int index, Usuarios nuevo) {
        return facade.editarUsuario(index, nuevo);
    }

    public boolean eliminarUsuarioPorCodigo(String codigo) {
        return facade.eliminarUsuarioPorCodigo(codigo);
    }

    public void solicitarPrestamo(String usuarioID, String libroID) {
        facade.solicitarPrestamo(usuarioID, libroID);
    }

    public Prestamo procesarPrestamo() {
        return facade.procesarPrestamo();
    }

    public Devolucion procesarDevolucion() {
        return facade.procesarDevolucion();
    }

    public List<Prestamo> obtenerPrestamosPendientes() {
        return facade.obtenerPrestamosPendientes();
    }

    public List<Devolucion> obtenerDevolucionesPendientes() {
        return facade.obtenerDevolucionesPendientes();
    }

    public List<Libros> obtenerLibros() {
        return facade.obtenerLibros();
    }

    public List<Usuarios> obtenerUsuarios() {
        return facade.obtenerUsuarios();
    }

    public String generarReporteLibros() {
        return facade.generarReporteLibros();
    }
}
