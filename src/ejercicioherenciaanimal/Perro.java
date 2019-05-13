
package ejercicioherenciaanimal;

public class Perro extends Animal {

    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Wof Wof...");
    }
    
}
