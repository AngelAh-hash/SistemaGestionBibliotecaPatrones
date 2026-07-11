package servicio.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistorialComandos {
    private final List<String> historial = new ArrayList<>();

    public void ejecutar(ComandoBiblioteca comando) {
        comando.ejecutar();
        historial.add(comando.descripcion());
    }

    public List<String> obtenerHistorial() {
        return Collections.unmodifiableList(historial);
    }
}
