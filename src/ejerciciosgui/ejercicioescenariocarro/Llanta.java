
package ejerciciosgui.ejercicioescenariocarro;

public class Llanta extends Objeto{

    public Llanta(int x, int y) {
        super(x, y);
    }

    @Override
    public void mover() {
        setX(getX() + 1);
        if (y + 30 < Piso.y)
            setY(getY() + 1);
    }
}
