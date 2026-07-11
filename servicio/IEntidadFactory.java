/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Usuarios;
import modelo.Libros;

public interface IEntidadFactory {
    Usuarios crearUsuario(String nombre, String apellidoP, String apellidoM, String telefono, int numeroActual);
    Libros crearLibro(String libroID, String titulo, String autor, String idioma, int paginas, int disponibles);
}
