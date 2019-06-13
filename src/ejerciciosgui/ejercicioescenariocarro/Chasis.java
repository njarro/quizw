
package ejerciciosgui.ejercicioescenariocarro;

public class Chasis extends Objeto{

    public Chasis(int x, int y) {
        super(x, y);
    }

    @Override
    public void mover() {
        setX(getX() + 1);
        
        if (y + 80 < Piso.y)
            setY(getY() + 1);
        
    }
    
}
