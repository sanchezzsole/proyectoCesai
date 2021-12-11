package modelo;

public class Pacientes {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String provincia;
    private String email;
    private int telefono;

    //ME HACE CREAR ESTE CONSTRUCTOR, SINO ME DA ERROR..... Y YA ESTABA
    //EL CONSTRUCTOR ABAJO CREADO...
     public Pacientes (int id, String nombre, String apellido, int edad, String provincia, String email, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
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
