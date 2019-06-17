
package ejerciciosgui.ejerciciojuegobasico;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

public class Animation extends AnimationTimer {
    
    private GraphicsContext drawer;
    private Person joe;
    
    public Animation(GraphicsContext drawer) {
        this.drawer = drawer;
        this.joe = new Person(100, 100);
    }
    
    @Override
    public void handle(long l) {
        joe.draw(drawer);
    }
}
