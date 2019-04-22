
package ejerciciorectangulo;

public class Main {
    public static void main(String[] args) {
        //Dependencia
        Rectangulo r1 = new Rectangulo( 3, 4 );
        System.out.println( "Perimetro: " + r1.calcularPerimetro() );
        System.out.println( "Area: " + r1.calcularArea() );
    }
    
}
