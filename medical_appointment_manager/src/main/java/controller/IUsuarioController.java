package controller;

import java.util.Map;

public interface IUsuarioController {

    public String login(String username_paciente, String contrasena);

    public String register(String username_paciente, String contrasena,
            String nombre, String apellido, int edad, String genero, String email, String regimen);

    public String login_medico(String username_paciente, String contrasena);
    //public String register_medico(String username_paciente,String contrasena,String registro_medico,String nombre,String apellido,String correo,String especialidad,int disponibilidad);

    public String pedir(String username);
}
