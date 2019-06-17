
package ejerciciosgui.ejerciciojuegobasico;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Person extends Object {
    
    private Image[][] states;
    
    public Person(double x, double y) {
        super(x, y);
        final String s = "file:src//ejerciciosgui//ejerciciojuegobasico//";
        states = new Image[4][3];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (i == 0) states[i][j]= new Image(s + "up" + j +".png");
                if (i == 1) states[i][j]= new Image(s + "left" + j +".png");
                if (i == 2) states[i][j]= new Image(s + "right" + j +".png");
                if (i == 3) states[i][j]= new Image(s + "down" + j +".png");
            }
        }
    }
    
    @Override
    public void draw(GraphicsContext drawer) {
        
    }
}
