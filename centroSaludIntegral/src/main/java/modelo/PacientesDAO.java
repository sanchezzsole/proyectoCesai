package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacientesDAO {
    Connection conexion;
    
    public PacientesDAO(){
        Conexion con = new Conexion(); 
        conexion = con.getConection();
    }
    
    public List<Pacientes> listarPacientes(){
        PreparedStatement ps;
        ResultSet rs;
        List<Pacientes> lista = new ArrayList<>();
        try{
            ps = conexion.prepareStatement("SELECT * FROM participantes");
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                String provincia = rs.getString("provincia");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");
                Pacientes pacientes = new Pacientes (id, nombres, apellidos, edad, provincia, email, telefono);
                lista.add(pacientes);
            }
            return lista;
            
        }catch(SQLException e){
            
            System.out.println(e.toString());
            return null;
        }
      }
    
    public Pacientes mostrarPaciente(int _id){
        PreparedStatement ps;
        ResultSet rs;
        Pacientes paciente = null;
        
        try{
            ps = conexion.prepareStatement("SELECT * FROM registros WHERE id=?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                String provincia = rs.getString("provincia");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");
               paciente = new Pacientes(id, nombres, apellidos, edad, provincia, email, telefono);
            } return paciente;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
            
      }
        public boolean insertarPaciente(Pacientes paciente){
            PreparedStatement ps;
            try{
                 ps = conexion.prepareStatement("INSERT INTO registros (nombres, apellidos, edad, provincia, email, telefono) VALUES (?,?,?,?,?,?)");
                 ps.setString(1, paciente.getNombres());
                 ps.setString(2, paciente.getApellidos());
                 ps.setInt(3, paciente.getEdad());
                 ps.setString(4, paciente.getProvincia());
                 ps.setString(5, paciente.getEmail());
                 ps.setInt(6, paciente.getTelefono());
                 ps.execute();   
                 return true;
            }catch(SQLException e){
                System.out.println(e.toString());
                return false;
            }   
        }
        
        public boolean actualizarPaciente(Pacientes paciente){
            PreparedStatement ps;
            try{ 
            ps = conexion.prepareStatement("UPDATE registros SET nombres=?, apellidos=?, edad=?, provincia=?, email=?, telefono=? WHERE id=?) VALUES (?,?,?,?,?,?)");
                 ps.setString(1, paciente.getNombres());
                 ps.setString(2, paciente.getApellidos());
                 ps.setInt(3, paciente.getEdad());
                 ps.setString(4, paciente.getProvincia());
                 ps.setString(5, paciente.getEmail());
                 ps.setInt(6, paciente.getTelefono());
                 ps.setInt(7, paciente.getId());
                 ps.execute();   
                 return true;
            }catch(SQLException e){
                System.out.println(e.toString());
                return false;
            }   
        }
        
        public boolean eliminarPaciente (int _id){
            PreparedStatement ps;    
                try{
                    ps = conexion.prepareStatement("DELETE * FROM registros WHERE id=?");
                    ps.setInt(1, _id);
                    ps.execute();
                    return true;
        } catch(SQLException e){
                System.out.println(e.toString());
                return false;
            }   
    }
}
    