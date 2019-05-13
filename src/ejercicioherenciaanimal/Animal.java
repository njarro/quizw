
package ejercicioherenciaanimal;

public abstract class Animal {
    protected String nombre;
    protected String raza;

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    public abstract void hacerSonido();
    
    public void correr() {
        System.out.println("Corriendo...");
    }
}
