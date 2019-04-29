
package ejerciciofamilia;

public class Familia {
    private String apellido;
    private Persona[] miembros;
    
    public Familia ( String apellido ) {
        this.apellido = apellido;
        this.miembros = new Persona[4];
    }
    
    public boolean consultarFamilia( String apellido ) {
        return true;
    }
    
    public boolean consultarMiembro( String nombre ) {
        return true;
    }
    
    public boolean agregarMiembro( String nombre, String apellido, int edad, int sexo, int rol ) {
        return true;
    }
    
    public String getApellido() {
        return apellido;
    }
}
