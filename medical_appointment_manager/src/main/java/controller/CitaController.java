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
import connection.DBConnection;

/**
 *
 * @author juach
 */
public class CitaController implements ICitaControlller{
     @Override
    public String listar(boolean ordenar, String orden) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from cita";

       if (ordenar == true) {
            sql += " order by fecha_cita " + orden;
        }

        List<String> cita = new ArrayList<String>();

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int id_cita = rs.getInt("id_cita");
                String username_paciente = rs.getString("username_paciente");
                String username_medico = rs.getString("username_medico");
                Date fecha_cita = rs.getDate("fecha_cita");
                Time hora_cita = rs.getTime("hora_cita");
                boolean asistencia = rs.getBoolean("asistencia");
                String observaciones = rs.getString("observaciones");
                boolean reprogramada = rs.getBoolean("reprogramada");
                boolean pago_cuota = rs.getBoolean("pago_cuota");
                

                Cita citas = new Cita(id_cita, username_paciente, username_medico,fecha_cita, hora_cita, asistencia, observaciones, reprogramada, pago_cuota);
                cita.add(gson.toJson(citas));

            }
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return gson.toJson(cita);

    }
    
   
     
}
