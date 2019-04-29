
package Registro;

public class Registro {
    
    private Familia[] familias;
    
    public Registro(){
        this.familias = new Familia[100];
    }
    
    public boolean añadirFamilia(Familia familia){
        for (int i=0; i<this.familias.length; i++){
            if (this.familias == null){
                this.familias = familia;
            }
        }
    }
    
    public static void main(String[] args) {
        Familia familia = new Familia("Perez");
        
                
        familia.añadirMadre("Yolanda", "Perez", 37, "Femenino", "48536218");
        familia.añadirPadre("Diego", "Perez", 40, "Masculino", "145321585");
    }
}
