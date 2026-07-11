package modelo;

import dao.BaseDatosMemoria;
import java.util.List;

public class ListaDevoluciones {

    public static void agregar(Devolucion d) {
        BaseDatosMemoria.getInstance().getListaDevoluciones().add(d);
    }

    public static List<Devolucion> obtenerTodos() {
        return BaseDatosMemoria.getInstance().getListaDevoluciones();
    }
    
    public static void eliminar(Devolucion d) {
    BaseDatosMemoria.getInstance().getListaDevoluciones().remove(d);
    }
}

