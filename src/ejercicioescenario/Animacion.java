
package ejercicioescenario;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Animacion extends AnimationTimer{
    
    private Carro carro;
    private GraphicsContext lapiz;

    public Animacion(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Carro(0, 100);
    }
    
    
    //En este metodo se dibuja
    public void handle(long l) { 
        lapiz.clearRect(0, 0, 600, 600);
        
        Chasis chasis = this.carro.getChasis();
        
        double[] puntosX = {chasis.getX(), chasis.getX() + 30, chasis.getX() + 70, chasis.getX() + 100};
        double[] puntosY = {chasis.getY() + 50, chasis.getY(), chasis.getY(), chasis.getY() + 50};
        
        lapiz.setFill(Color.BLUE);
        lapiz.fillPolygon(puntosX, puntosY, 4);
        
        lapiz.setFill(Color.CYAN);
        lapiz.fillRect(this.carro.getX(), this.carro.getY(), 100, 50);
        lapiz.setFill(Color.BLACK);
        lapiz.fillOval(this.carro.getLlantaTrasera().getX(), this.carro.getLlantaTrasera().getY(), 30, 30);
        lapiz.fillOval(this.carro.getLlantaDelantera().getX(), this.carro.getLlantaDelantera().getY(), 30, 30);
        
        this.carro.mover();
        
        /*lapiz.strokeText("Puntaje: ", 400, 50);
        
        lapiz.setStroke(Color.BLUE);
        
        lapiz.strokeRect(xRef, yRef, 200.0, 50.0); //strokeRect(xRef,yRef, ancho, alto);
        lapiz.setFill(Color.YELLOW);
        lapiz.fillRect(xRef, yRef, 200.0, 50.0);
        
        lapiz.strokeOval(xRef + 30.0, yRef + 51.0, 30.0, 30.0); //strokeOval(xRef,yRef, radioX, radioY);
        lapiz.strokeOval(xRef + 120.0, yRef + 51.0, 30.0, 30.0);
        */
    }
    
}
