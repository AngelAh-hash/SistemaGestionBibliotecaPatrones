# Sistema de Gestión de Biblioteca Pública - Patrones aplicados

Este proyecto fue refactorizado para el entregable final del curso Diseño de Patrones.

## Patrones Creacionales

1. **Singleton**
   - Archivo: `src/dao/BaseDatosMemoria.java`
   - Uso: mantiene una única instancia de la base de datos en memoria.

2. **Factory Method**
   - Archivos: `src/servicio/IEntidadFactory.java`, `src/servicio/EntidadFactory.java`
   - Uso: centraliza la creación de usuarios y libros.

3. **Builder**
   - Archivos: `src/modelo/Libros.java`, `src/modelo/Usuarios.java`
   - Uso: construcción ordenada de entidades con varios atributos.

## Patrones Estructurales

4. **Facade**
   - Archivo: `src/servicio/BibliotecaFacade.java`
   - Uso: da una interfaz simple para que la UI no se conecte directamente con listas, colas, pilas y fábrica.

5. **Adapter**
   - Archivos: `src/servicio/notificacion/CorreoLegacy.java`, `src/servicio/notificacion/EmailNotificadorAdapter.java`
   - Uso: adapta un sistema antiguo de correos al sistema actual de notificaciones.

6. **Decorator**
   - Carpeta: `src/servicio/reporte/`
   - Uso: agrega fecha y pie de página al reporte sin modificar el reporte base.

7. **Composite**
   - Carpeta: `src/modelo/catalogo/`
   - Uso: permite manejar libros individuales y categorías del catálogo de forma uniforme.

## Patrones de Comportamiento

8. **Observer**
   - Archivos: `src/servicio/DataObserver.java`, `src/dao/BaseDatosMemoria.java`
   - Uso: cuando cambian los datos, las pantallas y el adaptador de correo son notificados.

9. **State**
   - Carpeta: `src/modelo/estado/`
   - Archivo integrado: `src/modelo/Prestamo.java`
   - Uso: un préstamo cambia entre SOLICITADO, PRESTADO y DEVUELTO.

10. **Command**
   - Carpeta: `src/servicio/command/`
   - Uso: encapsula la acción de registrar un préstamo y guarda historial.

## GRASP aplicado

1. **Controller**
   - Archivo: `src/controlador/BibliotecaController.java`
   - Uso: recibe eventos desde la interfaz gráfica y delega a la fachada.

2. **Alta Cohesión**
   - Archivos: `BibliotecaService`, `ListaLibros`, `ListaUsuarios`
   - Uso: cada clase tiene una responsabilidad clara.

3. **Bajo Acoplamiento**
   - Archivos: `IBibliotecaService`, `IBasedeDatos`, `IEntidadFactory`
   - Uso: el sistema depende de interfaces y no solo de clases concretas.

4. **Creador**
   - Archivo: `EntidadFactory.java`
   - Uso: centraliza la creación de entidades del dominio.

5. **Experto en Información**
   - Archivo: `Libros.java`
   - Uso: el libro sabe si está disponible y cómo cambia su stock.

6. **Polimorfismo**
   - Archivos: `EstadoPrestamo.java`, `EstadoSolicitado.java`, `EstadoPrestado.java`, `EstadoDevuelto.java`
   - Uso: evita condicionales largos para manejar estados del préstamo.

## Cómo abrir

1. Abrir NetBeans.
2. File > Open Project.
3. Seleccionar la carpeta del proyecto.
4. Ejecutar `frmPrincipal`.

## Nota técnica

- El proyecto fue configurado con `javac.source=17` y `javac.target=17` para mayor compatibilidad con NetBeans y Java 17+.
- Se agregó una implementación mínima de `org.netbeans.lib.awtextra` para que compile incluso si NetBeans no detecta la librería AbsoluteLayout.

## Datos de prueba incluidos

Se agregó la clase `servicio.DatosInicialesBiblioteca`, llamada desde `dao.BaseDatosMemoria`, para que el sistema abra con alumnos y libros ya cargados en memoria.

Esto permite tomar capturas directas de las tablas de usuarios y libros sin registrar datos manualmente.

Códigos de alumnos usados: `u23227080`, `u23244036`, `u23244202`, `u23265919`, `u23200001`.

Códigos de libros usados: `LIB001`, `LIB002`, `LIB003`, `LIB004`, `LIB005`, `LIB006`, `LIB007`, `LIB008`, `LIB009`, `LIB010`.

## Pruebas Unitarias JUnit 5

Se agregó la carpeta `test` con pruebas unitarias para evidenciar los patrones aplicados:

- Singleton: `BaseDatosMemoriaTest`
- Factory Method: `EntidadFactoryTest`
- Builder: `BuilderValidacionTest`
- State: `PrestamoStateTest`
- Command y Observer: `BibliotecaServiceCommandObserverTest`
- Decorator y Composite: `DecoratorCompositeTest`
- Facade y GRASP Controller: `BibliotecaFacadeControllerTest`

Estas pruebas se ejecutan desde NetBeans con clic derecho sobre el proyecto y opción `Test`.
