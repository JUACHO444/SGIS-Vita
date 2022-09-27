/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

import beans.Cita;
import beans.Medico;
import connection.DBConnection;

public class medicoController implements ImedicoController {

    @Override
    public String listarmedicos() {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from medico";
        List<String> medico= new ArrayList<String>();

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String username_medico = rs.getString("username_medico");  
                String contrasena = rs.getString("contrasena");  
                String registro_medico = rs.getString("registro_medico");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String especialidad = rs.getString("especialidad");
                boolean disponibilidad = rs.getBoolean("disponibilidad");

                Medico medicos = new Medico(username_medico, contrasena, registro_medico, nombre, apellido, correo, especialidad, disponibilidad);
                medico.add(gson.toJson(medicos));
                System.out.println("ffff" +gson.toJson(medico));

            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();

            return gson.toJson(medico);

        }
    }
}
