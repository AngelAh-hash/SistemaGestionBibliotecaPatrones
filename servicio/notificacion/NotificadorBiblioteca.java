package servicio.notificacion;

public interface NotificadorBiblioteca {
    void enviar(String destino, String asunto, String mensaje);
}
