
package ejerciciointerfaceanimal;

public class Main {
    public static void main (String args[]) {
        
        /*
        ********Clase abstracta no puede instanciar ******
        Animal animal = new Animal("XX", "Border");
        Gato gato1 = new Animal("ZZ", "Raza");
        */
        
        Animal perro = new Perro("XX", "Border");
        
        perro.hacerSonido();    
        perro.correr();
        
        Gato gato = new Gato("YY", "Raza");
        
        gato.hacerSonido();
        gato.correr();
    }
}
