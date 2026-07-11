package modelo;

public class Devolucion {
    private static int contador = 1;

    private int devolucionID;
    private String usuarioID;
    private String libroID;

    public Devolucion(String usuarioID, String libroID) {
        this.devolucionID = contador++;
        this.usuarioID = usuarioID;
        this.libroID = libroID;
    }

    public int getDevolucionID() { return devolucionID; }
    public String getUsuarioID() { return usuarioID; }
    public String getLibroID() { return libroID; }
}

