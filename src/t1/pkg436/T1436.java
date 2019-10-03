/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.pkg436;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class T1436 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Contenedor principal
        Group root = new Group();
        
        //Zona de dibujo
        Canvas canvas = new Canvas (300,300);
        GraphicsContext gc= canvas.getGraphicsContext2D();
        
        //Añade el canvas a la escena
        root.getChildren().add(canvas);
        
        //Crea escena
        Scene scene = new Scene (root, 300, 300);
        
        //Se asocia la ventana al parámetros primaryStage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejercicio T1_436");
        primaryStage.show();
        
        
        //Dibuja el círculo
        //Desde una posición
        gc.strokeOval(90, 90, 120, 120);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
