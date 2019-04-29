
package Registro;

public class Padre {
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String ID;
    private Hijo[] hijos;

    public Padre(String nombre, String apellido, int edad, String sexo, String ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.ID = ID;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Hijo[] getHijos() {
        return hijos;
    }

    public void setHijos(Hijo[] hijos) {
        this.hijos = hijos;
    }
    
}
