package modelo;

public class NodoUsuarios {
    public Usuarios usuario;
    public NodoUsuarios siguiente;

    public NodoUsuarios(Usuarios usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }
}

