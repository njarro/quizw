
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
        if (miembros[rol] == null) {
            String rol_p = "", sexo_p;
            switch (rol) {
                case(0):
                    rol_p = "Padre";
                    break;
                case(1):
                    rol_p = "Madre";
                    break;
                case(2):
                    rol_p = "Hijo mayor";
                    break;
                case(3):
                    rol_p = "Hijo menor";
                    break;
            }
            if (sexo == 1) sexo_p = "Masculino";
            else sexo_p = "Femenino";

            miembros[rol] = new Persona( nombre, apellido, edad, sexo_p, rol_p );
            return true;
        } else return false;
    }
    
    public String getApellido() {
        return apellido;
    }
}
