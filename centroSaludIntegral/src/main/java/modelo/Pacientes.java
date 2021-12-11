package modelo;

public class Pacientes {
    private int id;
    private String nombres;
    private String apellidos;
    private int edad;
    private String provincia;
    private String email;
    private int telefono;

    //ME HACE CREAR ESTE CONSTRUCTOR, SINO ME DA ERROR..... Y YA ESTABA
    //EL CONSTRUCTOR ABAJO CREADO...
     public Pacientes (int id, String nombres, String apellidos, int edad, String provincia, String email, int telefono){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.provincia = provincia;
        this.email = email;
        this.telefono = telefono;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    

}
