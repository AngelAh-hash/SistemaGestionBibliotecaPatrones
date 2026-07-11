package servicio.notificacion;

import servicio.DataObserver;

/**
 * PATRÓN ESTRUCTURAL: Adapter.
 * Adapta CorreoLegacy a la interfaz moderna NotificadorBiblioteca.
 * También participa como Observer de los cambios de la base de datos en memoria.
 */
public class EmailNotificadorAdapter implements NotificadorBiblioteca, DataObserver {
    private final CorreoLegacy correoLegacy;

    public EmailNotificadorAdapter() {
        this.correoLegacy = new CorreoLegacy();
    }

    @Override
    public void enviar(String destino, String asunto, String mensaje) {
        correoLegacy.enviarCorreoBiblioteca(destino, asunto, mensaje);
    }

    @Override
    public void onDataChanged() {
        enviar("admin@biblioteca.local", "Cambio detectado", "La información del sistema fue actualizada.");
    }
}
