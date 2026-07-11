package servicio.notificacion;

/**
 * Simula una librería antigua con una interfaz distinta.
 */
public class CorreoLegacy {
    public void enviarCorreoBiblioteca(String correoDestino, String tituloCorreo, String cuerpoCorreo) {
        System.out.println("[CorreoLegacy] Para: " + correoDestino + " | " + tituloCorreo + " | " + cuerpoCorreo);
    }
}
