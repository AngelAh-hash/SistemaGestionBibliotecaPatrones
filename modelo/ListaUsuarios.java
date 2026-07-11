package modelo;

import dao.BaseDatosMemoria;

public class ListaUsuarios {
    public NodoUsuarios cabeza = null;

    public void agregarUsuario(Usuarios u) {
        agregarUsuarioSinNotificar(u);
        BaseDatosMemoria.getInstance().notificarCambios();
    }

    public void agregarUsuarioSinNotificar(Usuarios u) {
        NodoUsuarios nuevo = new NodoUsuarios(u);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoUsuarios actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    
    public NodoUsuarios obtenerNodo(int index) {
        NodoUsuarios actual = cabeza;
        int contador = 0;

        while (actual != null) {
            if (contador == index) {
                return actual;
            }
            actual = actual.siguiente;
            contador++;
        }
        return null;
    }

public Usuarios get(int index) {
        NodoUsuarios actual = cabeza;
        int contador = 0;

        while (actual != null) {
            if (contador == index) {
                return actual.usuario;
            }
            actual = actual.siguiente;
            contador++;
        }
        return null;
    }

    public boolean editarUsuario(int index, Usuarios nuevo) {
        NodoUsuarios actual = cabeza;
        int contador = 0;

        while (actual != null) {
            if (contador == index) {
                actual.usuario.setNombre(nuevo.getNombre());
                actual.usuario.setApellidoP(nuevo.getApellidoP());
                actual.usuario.setApellidoM(nuevo.getApellidoM());
                actual.usuario.setTelefono(nuevo.getTelefono());
                BaseDatosMemoria.getInstance().notificarCambios();
                return true;
            }
            actual = actual.siguiente;
            contador++;
        }
        return false;
    }

    public java.util.List<Usuarios> obtenerTodos() {
        java.util.List<Usuarios> lista = new java.util.ArrayList<>();
        NodoUsuarios actual = cabeza;

        while (actual != null) {
            lista.add(actual.usuario);
            actual = actual.siguiente;
        }

        return lista;
    }
       

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int size() {
        int cont = 0;
        NodoUsuarios actual = cabeza;
        while (actual != null) {
            cont++;
            actual = actual.siguiente;
        }
        return cont;
    }
    
    public Usuarios buscarPorCodigo(String codigo) {
    NodoUsuarios actual = cabeza;

    while (actual != null) {
        if (actual.usuario.getCodigo().equalsIgnoreCase(codigo)) {
            return actual.usuario;
        }
        actual = actual.siguiente;
    }
    return null;
    }
    
    public int buscarIndicePorCodigo(String codigo) {
    NodoUsuarios actual = cabeza;
    int index = 0;

    while (actual != null) {
        if (actual.usuario.getCodigo().equalsIgnoreCase(codigo)) {
            return index;
        }
        actual = actual.siguiente;
        index++;
    }
    return -1;
    }
    
    public boolean eliminarPorCodigo(String codigo) {
    if (cabeza == null) {
        return false;
    }

    if (cabeza.usuario.getCodigo().equalsIgnoreCase(codigo)) {
        cabeza = cabeza.siguiente;
        BaseDatosMemoria.getInstance().notificarCambios();
        return true;
    }

    NodoUsuarios anterior = cabeza;
    NodoUsuarios actual = cabeza.siguiente;

    while (actual != null) {
        if (actual.usuario.getCodigo().equalsIgnoreCase(codigo)) {
            anterior.siguiente = actual.siguiente;
            BaseDatosMemoria.getInstance().notificarCambios();
            return true;
        }
        anterior = actual;
        actual = actual.siguiente;
    }

    return false;
    }
}

