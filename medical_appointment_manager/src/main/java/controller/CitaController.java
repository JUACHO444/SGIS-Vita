/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.google.gson.Gson;
import beans.Cita;
import connection.DBConnection;
import java.sql.Date;
import java.text.DateFormat;

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
            sql += " order by genero " + orden;
        }

        List<String> cita = new ArrayList<String>();

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                
                String Cedula = rs.getString("username_paciente");
                String paciente = rs.getString("paciente");
                DateFormat fecha  = new 
                Boolean asistencia = rs.getBoolean("asistencia");
                String observaciones = rs.getString("observaciones");
                boolean reprogramada = rs.getBoolean("reprogramada");
                boolean pago_cuota = rs.getBoolean("pago_cuota");
                Date fecha_cita;

                Cita cita = new Cita(paciente, "medico", fecha_cita, true, observaciones, true, true);
                peliculas.add(gson.toJson(pelicula));

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return gson.toJson(peliculas);

    }
    
     @Override
    public String devolver(int id, String username) {

        DBConnection con = new DBConnection();
        String sql = "Delete from alquiler where id= " + id + " and username = '" 
                + username + "' limit 1";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeQuery(sql);

            this.sumarCantidad(id);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            con.desconectar();
        }

        return "false";
    }
}
