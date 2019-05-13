
package ejercicioherenciaanimal;

public class Gato extends Animal {

    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau...");
    }
    
}
