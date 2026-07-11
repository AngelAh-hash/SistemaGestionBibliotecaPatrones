package servicio;

import dao.BaseDatosMemoria;
import dao.IBasedeDatos;
import java.util.List;
import modelo.Devolucion;
import modelo.Libros;
import modelo.Prestamo;
import modelo.Usuarios;
import modelo.catalogo.CategoriaCatalogo;
import modelo.catalogo.LibroCatalogo;
import servicio.command.HistorialComandos;
import servicio.command.RegistrarPrestamoCommand;
import servicio.reporte.ReporteBiblioteca;
import servicio.reporte.ReporteConFecha;
import servicio.reporte.ReporteConPie;
import servicio.reporte.ReporteLibrosBase;

/**
 * PATRÓN ESTRUCTURAL: Facade.
 * Deja una entrada simple para la UI y oculta listas, colas, pila, fábrica y servicios internos.
 */
public class BibliotecaFacade {
    private final IBasedeDatos baseDatos;
    private final IBibliotecaService bibliotecaService;
    private final IEntidadFactory factory;
    private final HistorialComandos historial;

    public BibliotecaFacade() {
        this(BaseDatosMemoria.getInstance(), new EntidadFactory());
    }

    public BibliotecaFacade(IBasedeDatos baseDatos, IEntidadFactory factory) {
        this.baseDatos = baseDatos;
        this.factory = factory;
        this.bibliotecaService = new BibliotecaService(baseDatos);
        this.historial = new HistorialComandos();
    }

    public Usuarios registrarUsuario(String nombre, String apellidoP, String apellidoM, String telefono) {
        Usuarios usuario = factory.crearUsuario(nombre, apellidoP, apellidoM, telefono, baseDatos.getListaUsuarios().size());
        baseDatos.getListaUsuarios().agregarUsuario(usuario);
        return usuario;
    }

    public Libros registrarLibro(String libroID, String titulo, String autor, String idioma, int paginas, int disponibles) {
        Libros libro = factory.crearLibro(libroID, titulo, autor, idioma, paginas, disponibles);
        baseDatos.getListaLibros().agregarLibro(libro);
        return libro;
    }

    public Libros crearLibro(String libroID, String titulo, String autor, String idioma, int paginas, int disponibles) {
        return factory.crearLibro(libroID, titulo, autor, idioma, paginas, disponibles);
    }

    public Usuarios crearUsuarioManual(String codigo, String nombre, String apellidoP, String apellidoM, String telefono) {
        return new Usuarios.Builder(codigo, nombre)
                .apellidoP(apellidoP)
                .apellidoM(apellidoM)
                .telefono(telefono)
                .build();
    }

    public Libros buscarLibroPorID(String id) {
        return baseDatos.getListaLibros().buscarPorID(id);
    }

    public boolean editarLibro(String id, Libros nuevo) {
        return baseDatos.getListaLibros().editarLibro(id, nuevo);
    }

    public boolean eliminarLibroPorID(String id) {
        return baseDatos.getListaLibros().eliminarPorID(id);
    }

    public Usuarios obtenerUsuarioPorIndice(int fila) {
        return baseDatos.getListaUsuarios().get(fila);
    }

    public Usuarios buscarUsuarioPorCodigo(String codigo) {
        return baseDatos.getListaUsuarios().buscarPorCodigo(codigo);
    }

    public int buscarIndiceUsuarioPorCodigo(String codigo) {
        return baseDatos.getListaUsuarios().buscarIndicePorCodigo(codigo);
    }

    public boolean editarUsuario(int index, Usuarios nuevo) {
        return baseDatos.getListaUsuarios().editarUsuario(index, nuevo);
    }

    public boolean eliminarUsuarioPorCodigo(String codigo) {
        return baseDatos.getListaUsuarios().eliminarPorCodigo(codigo);
    }

    public void solicitarPrestamo(String usuarioID, String libroID) {
        historial.ejecutar(new RegistrarPrestamoCommand(bibliotecaService, usuarioID, libroID));
    }

    public Prestamo procesarPrestamo() {
        return bibliotecaService.procesarPrestamo();
    }

    public Devolucion procesarDevolucion() {
        return bibliotecaService.procesarDevolucion();
    }

    public List<Prestamo> obtenerPrestamosPendientes() {
        return bibliotecaService.obtenerPrestamosPendientes();
    }

    public List<Devolucion> obtenerDevolucionesPendientes() {
        return bibliotecaService.obtenerDevolucionesPendientes();
    }

    public List<Libros> obtenerLibros() {
        return baseDatos.getListaLibros().obtenerTodos();
    }

    public List<Usuarios> obtenerUsuarios() {
        return baseDatos.getListaUsuarios().obtenerTodos();
    }

    public String generarReporteLibros() {
        ReporteBiblioteca reporte = new ReporteLibrosBase(obtenerLibros());
        reporte = new ReporteConFecha(reporte);
        reporte = new ReporteConPie(reporte);
        return reporte.generar();
    }

    public String generarResumenCatalogo() {
        CategoriaCatalogo catalogo = new CategoriaCatalogo("Catálogo Biblioteca");
        for (Libros libro : obtenerLibros()) {
            catalogo.agregar(new LibroCatalogo(libro));
        }
        return catalogo.descripcion() + "Total disponibles: " + catalogo.calcularDisponibles();
    }

    public List<String> obtenerHistorialComandos() {
        return historial.obtenerHistorial();
    }
}
