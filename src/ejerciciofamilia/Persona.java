
package ejerciciofamilia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int sexo;
    private String rol;

    public Persona(String nombre, String apellido, int edad, int sexo, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getSexo() {
        return sexo;
    }

    public String getRol() {
        return rol;
    }
}
