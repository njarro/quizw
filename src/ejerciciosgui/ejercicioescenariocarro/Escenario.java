
package ejerciciosgui.ejercicioescenariocarro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Escenario extends Application { //Application es una clase abstracta
    
    public static void main(String[] args) {
        Application.launch(args); //Metodo de clase de Application para ejecutar la ventana
    }
    
    public void start(Stage escenarioPrimario) throws Exception { // Metodo que se ejecuta al iniciar la aplicacion
        final int alto = 600, ancho = 600;
        
        Pane panel = new Pane();
        Canvas tablero = new Canvas(ancho, alto);  //Canvas recibe las dimensiones como parametros del constructor
        panel.getChildren().add(tablero); //Cada Nodo tiene "hijos". getChildren() devuelve la lista <> de hijos
        Scene escena = new Scene(panel, ancho, alto, Color.WHITE); //parametros del constructor de escena: Pane, dimx, dimy, color(opcional)
        GraphicsContext lapiz = tablero.getGraphicsContext2D();  //Un objeto canvas tiene un GraphicsContext, que se puede usar para crear un objeto para dibujar
        
        Animacion animacion = new Animacion(lapiz);
        
        animacion.start();

        //Estas lineas deben ser escritas siempre
        escenarioPrimario.setScene(escena); //La escena debe ir dentro del Stage
        escenarioPrimario.setTitle("Escenario interactivo"); 
        escenarioPrimario.show();

    }
}
