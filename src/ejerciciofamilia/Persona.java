
package ejerciciofamilia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String rol;

    public Persona(String nombre, String apellido, int edad, String sexo, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.rol = rol;
    }
    
    public String getInfoCompleta() {
        return "Nombres: " + this.nombre + "\nApellidos: " + this.apellido +
               "\nEdad: " + this.edad + "\nSexo: " + this.sexo + "\n\n";
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

    public String getSexo() {
        return sexo;
    }

    public String getRol() {
        return rol;
    }
}
