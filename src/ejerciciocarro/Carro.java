
package ejerciciocarro;

public class Carro {
    private String placa;
    private String marca;
    private Motor motor;
    private Llanta[] llantas;
    private Eje[] ejes;

    public Carro( String placa, String marca, Llanta[] llantas, Eje[] ejes ) {
        this.placa = placa;
        this.marca = marca;
        this.llantas = new Llanta[4];
        this.ejes = ejes;
    }
    
    public boolean addMotor( int potencia ) {
        if ( potencia > 0 ) {
            motor = new Motor ( potencia, ejes[0] );
            return true;
        } else return false;
    }
    
    public void dibujar() {
        
    }
}
