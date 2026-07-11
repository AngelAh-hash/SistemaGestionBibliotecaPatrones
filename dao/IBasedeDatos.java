/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import servicio.DataObserver;
import modelo.ListaLibros;
import modelo.ListaUsuarios;
import modelo.Prestamo;
import modelo.Devolucion;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public interface IBasedeDatos {
    ListaLibros getListaLibros();
    ListaUsuarios getListaUsuarios();
    Queue<Prestamo> getColaPrestamos();
    List<Devolucion> getListaDevoluciones();
    Stack<Devolucion> getPilaDevoluciones();
    void agregarObserver(DataObserver observer);
    void removerObserver(DataObserver observer);
    void notificarCambios();
}
