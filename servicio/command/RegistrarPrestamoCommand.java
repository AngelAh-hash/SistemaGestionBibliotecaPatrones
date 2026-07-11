package servicio.command;

import servicio.IBibliotecaService;

/**
 * PATRÓN DE COMPORTAMIENTO: Command.
 * Encapsula la solicitud de préstamo como un objeto ejecutable.
 */
public class RegistrarPrestamoCommand implements ComandoBiblioteca {
    private final IBibliotecaService service;
    private final String usuarioId;
    private final String libroId;

    public RegistrarPrestamoCommand(IBibliotecaService service, String usuarioId, String libroId) {
        this.service = service;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
    }

    @Override
    public void ejecutar() {
        service.prestarLibro(usuarioId, libroId);
    }

    @Override
    public String descripcion() {
        return "Registrar préstamo: usuario=" + usuarioId + ", libro=" + libroId;
    }
}
