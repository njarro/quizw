
package ejerciciointerfaceanimal;

public class Gato implements Animal{
    private String nombre;
    private String raza;

    public Gato(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void correr() {
        System.out.println("Corriendo...");
    }
    
    
}
