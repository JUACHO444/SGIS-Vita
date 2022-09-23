package test;
import beans.Paciente;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.jsp.jstl.sql.Result;


public class OperacionBD {
    public static void main(String[] args) {
        listarPacientes();
    }
    public static void actualizarUsuario(int id,String regimen){
        DBConnection con = new DBConnection();
        String sql ="UPDATE paciente SET regimen = '"+ regimen + "'WHERE id = " +id;
        try {
            Statement st = con.getConnection().createStatement();
            st.execute(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
    public static void listarPacientes(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM paciente";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String username_paciente = rs.getString("username_paciente");
                String contrasena = rs.getString("contrasena");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String email = rs.getString("email");
                String regimen = rs.getString("regimen");
                Paciente paciente = new Paciente(username_paciente, contrasena, nombre, apellido, edad, genero, nombre, regimen);
                System.out.println(paciente.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
    
    
}