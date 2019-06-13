
package ejerciciosgui.ejercicioescenariocarro;

public class Carro extends Objeto{
    
    private Chasis chasis;
    private Llanta llantaTrasera;
    private Llanta llantaDelantera;

    public Carro(int x, int y) {
        super(x, y);
        this.chasis = new Chasis(x + 10, y - 30); 
        this.llantaTrasera = new Llanta(x + 10, y + 20);
        this.llantaDelantera = new Llanta(x + 60, y + 20);
    }
    
    @Override
    public void mover() {
        setX(getX() + 1);
        
        if(llantaTrasera.getY() + 30 < Piso.y)
            setY(getY() + 1);
        
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
