
package config;

import java.sql.*;

public class Conexion {
    public Connection getConection(){
        Connection c = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tpcodoacodo",
                    "sole", "123456");
        }catch(ClassNotFoundException | SQLException error){
            System.out.println(error.toString());
        }
        return c;
    }
    public static void main(String[]args) throws SQLException{
        Connection conexion = null;
        Conexion con = new Conexion(); //acá NO va nada dentro de los paréntesis xq la clase Conexion NO tiene constructor
        conexion = con.getConection();
        
        PreparedStatement ps;
        ResultSet rs;
        ps = conexion.prepareStatement("SELECT * FROM registros");
        rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            System.out.println("\n Id: " + id + "\n nombre: " + nombre + "\n apellido: " + apellido); 
        } 
    }
}
