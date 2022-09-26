package controller;


import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Medico;
import beans.Paciente;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController {

    public String login(String username_paciente, String contrasena) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();

        String sql = "Select * from paciente where username_paciente = '" + username_paciente
                + "' and contrasena = '" + contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String email = rs.getString("email");
                String regimen = rs.getString("regimen");

                Paciente paciente
                        = new Paciente(username_paciente, contrasena, nombre, apellido, edad, genero, email, regimen);
                return gson.toJson(paciente);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    public String register(String username_paciente, String contrasena, String nombre, String apellido, int edad, String genero, String email, String regimen
    ) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into paciente values('" + username_paciente + "', '" + contrasena + "', '" + nombre
                + "', '" + apellido + "', '" + edad + "', '" + genero + "', '" + email + "', '" + regimen + "')";
        System.out.println(sql);
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Paciente paciente
                    = new Paciente(username_paciente, contrasena, nombre, apellido, edad, genero, email, regimen);
            st.close();

            return gson.toJson(paciente);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }

    public String login_medico(String username_medico, String contrasena) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();

        String sql = "Select * from medico where username_medico = '" + username_medico
                + "' and contrasena = '" + contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String registro_medico = rs.getString("registro_medico");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String especialidad = rs.getString("especialidad");
                int disponibilidad = rs.getInt("disponibilidad");

                Medico medico = new Medico(username_medico, contrasena, registro_medico, nombre, apellido, correo, especialidad, true);
                return gson.toJson(medico);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String pedir(String username_paciente) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from paciente where username_paciente = '" + username_paciente + "'";
        System.out.println("Hola" + sql);
        try {

            Statement st = con.getConnection().createStatement();
            
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String contrasena = rs.getString("contrasena");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String email = rs.getString("email");
                String regimen = rs.getString("regimen");

                Paciente paciente = new Paciente(username_paciente,contrasena , nombre, apellido, edad, genero, email, regimen);

                return gson.toJson(paciente);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

}
