
package excepciones;

public class Main {
    public static void main(String[] args) {
        /*Division d = null;
        try{
            d = new Division();
        } catch (ArithmeticException e) {
            System.out.println("Div por cero");
        }*/
        
        /*Division d = null;
        try{
            d = new Division();
        } catch (IllegalArgumentException e) {
            System.out.println("Div por cero");
        }*/
        
        Division d = null;
        try{
            d = new Division();
        } catch (PrimeraExcepcion e) {
            System.out.println("Error en el argumento");
        }
        
        System.out.println("Termino");
        
    }
}
