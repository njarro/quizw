
package ejerciciosgui.ejerciciojuegobasico;

import javafx.scene.canvas.GraphicsContext;

public abstract class Object {
    private Vector position;
    
    public Object(double x, double y) {
        position = new Vector (x, y);

    }

    public Vector getPosition() {
        return position;
    }
    
    public abstract void draw(GraphicsContext drawer);
}
