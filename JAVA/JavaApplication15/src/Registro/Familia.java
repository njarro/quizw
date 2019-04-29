
package Registro;

public class Familia {
    private String apellido;
    private Padre padre;
    private Madre madre;
    private Hijo[] hijos;

    public Familia(String apellido) {
        this.apellido = apellido;
        this.hijos = new Hijo[2];
    }
    
    public void añadirMadre(String nombre, String apellido, int edad, String sexo, String ID){
        this.madre= new Madre(nombre, apellido, edad, sexo, ID);
    }
    
    public void añadirPadre(String nombre, String apellido, int edad, String sexo, String ID){
        this.padre= new Padre(nombre, apellido, edad, sexo, ID);
    }
    
    public boolean añadirnuevoHijo (String nombre, String apellido, int edad, String sexo, String ID){
         for (int i=0; i<this.hijos.length; i++){
            if (this.hijos[i]==null){
                this.hijos[i]=new Hijo(nombre, apellido, edad, sexo, ID);
                return true;
            }
        }
        return false;
    }
    
}
