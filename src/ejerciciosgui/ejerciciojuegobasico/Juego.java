
package ejerciciosgui.ejerciciojuegobasico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Juego extends Application{
    private final int width = 600;
    private final int height = 600;
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Canvas canvas = new Canvas(width, height);
        pane.getChildren().add(canvas);
        Scene scene = new Scene(pane, width, height, Color.WHITE);
        GraphicsContext drawer = canvas.getGraphicsContext2D();
        
        Animation animation = new Animation(drawer);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("MiJuego");
        primaryStage.show();
    }
}
