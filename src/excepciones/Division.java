
package excepciones;

public class Division {
    public Division() throws PrimeraExcepcion{
        /*this.dividir();*/
        /*this.dividir2(0);*/
        this.dividir3(0);
    }
    
    public void dividir() {
        int x = 5/0;
    }
    
    public void dividir2(int x) {
        int r = 0;
        if(x == 0) throw new IllegalArgumentException();  
        else r = 5 / x;
    }
    
    public void dividir3(int x) throws PrimeraExcepcion{
        int r = 0;
        if(x == 0) throw new PrimeraExcepcion("Error...");  
        else r = 5 / x;
    }
}
