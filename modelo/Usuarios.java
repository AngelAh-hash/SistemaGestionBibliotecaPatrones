package modelo;

/**
 * Entidad Usuario.
 * Patrón Builder aplicado para crear usuarios sin acoplar la UI al constructor.
 */
public class Usuarios {
    private String codigo;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;

    public Usuarios(String codigo, String nombre, String apellidoP, String apellidoM, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getApellidoP() { return apellidoP; }
    public String getApellidoM() { return apellidoM; }
    public String getTelefono() { return telefono; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidoP(String apellidoP) { this.apellidoP = apellidoP; }
    public void setApellidoM(String apellidoM) { this.apellidoM = apellidoM; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String nombreCompleto() {
        return nombre + " " + apellidoP + " " + apellidoM;
    }

    // PATRÓN CREACIONAL: Builder
    public static class Builder {
        private String codigo;
        private String nombre;
        private String apellidoP = "";
        private String apellidoM = "";
        private String telefono = "";

        public Builder(String codigo, String nombre) {
            if (codigo == null || codigo.trim().isEmpty()) {
                throw new IllegalArgumentException("El código del usuario es obligatorio");
            }
            if (!codigo.matches("(?i)u\\d{8}")) {
                throw new IllegalArgumentException("El código debe tener formato u + 8 números. Ejemplo: u23227080");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del usuario es obligatorio");
            }
            this.codigo = codigo;
            this.nombre = nombre;
        }

        public Builder apellidoP(String apellidoP) {
            this.apellidoP = apellidoP;
            return this;
        }

        public Builder apellidoM(String apellidoM) {
            this.apellidoM = apellidoM;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Usuarios build() {
            return new Usuarios(codigo, nombre, apellidoP, apellidoM, telefono);
        }
    }
}
