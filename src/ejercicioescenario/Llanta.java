
package ejercicioescenario;

public class Llanta extends Objeto{

    public Llanta(int x, int y) {
        super(x, y);
    }

    @Override
    public void mover() {
        setX(getX() + 1);
    }
}
