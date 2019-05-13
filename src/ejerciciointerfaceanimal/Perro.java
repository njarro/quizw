
package ejerciciointerfaceanimal;

public class Perro implements Animal{
    private String nombre;
    private String raza;

    public Perro (String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Woff");
    }

    @Override
    public void correr() {
        System.out.println("Corriendo...");
    }
}
