
package ejercicioescenario;

public class Carro extends Objeto{
    
    private Chasis chasis;
    private Llanta llantaTrasera;
    private Llanta llantaDelantera;
    

    public Carro(int x, int y) {
        super(x, y);
        this.chasis = new Chasis(x, y - 50); 
        this.llantaTrasera = new Llanta(x + 20, y + 50);
        this.llantaDelantera = new Llanta(x + 60, y + 50);
    }
    
    @Override
    public void mover() {
        setX(getX() + 1);
        
        this.chasis.mover();
        this.llantaTrasera.mover();
        this.llantaDelantera.mover();
        
    }

    public Chasis getChasis() {
        return chasis;
    }

    public Llanta getLlantaTrasera() {
        return llantaTrasera;
    }

    public Llanta getLlantaDelantera() {
        return llantaDelantera;
    }
    
    
}
