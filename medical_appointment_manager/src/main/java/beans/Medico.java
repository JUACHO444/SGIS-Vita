package beans;
public class Medico {
    private String username_medico;
    private String contrasena;
    private String registro_medico;
    private String nombre;
    private String apellido;
    private String correo;
    private String especialidad;
    private boolean disponibilidad;

    public Medico(String username_medico, String contrasena, String registro_medico, String nombre, String apellido, String correo, String especialidad, boolean disponibilidad) {
        this.username_medico = username_medico;
        this.contrasena = contrasena;
        this.registro_medico = registro_medico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
    }

    public String getUsername_medico() {
        return username_medico;
    }

    public void setUsername_medico(String username_medico) {
        this.username_medico = username_medico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRegistro_medico() {
        return registro_medico;
    }

    public void setRegistro_medico(String registro_medico) {
        this.registro_medico = registro_medico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Medico{" + "username_medico=" + username_medico + ", contrasena=" + contrasena + ", registro_medico=" + registro_medico + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", especialidad=" + especialidad + ", disponibilidad=" + disponibilidad + '}';
    }

    
}
