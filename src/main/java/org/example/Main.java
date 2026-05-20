
package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox(10);//creamos etiqueta y campo de texto
        Label titulo = new Label("Introduce tu dirección:");
        TextField direccionField = new TextField();
        Button button = new Button("Confirmar direccion"); //el boton

        button.setOnAction(event -> { //saltara una alerta u otra si completamos la direccion o no
            if (direccionField.getText().isEmpty()) {// si detecta empty salta in warning y si no un mensaje con la direccion dada
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("Da una direccion, por favor");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Confirmacion");
                alert.setContentText("Direccion dada: " + direccionField.getText());
                alert.showAndWait();
            }
        });
        vbox.getChildren().addAll(titulo, direccionField, button);

        Scene scene = new Scene(vbox, 350, 150);
        primaryStage.setTitle("Eje 13 - Direccion");
        primaryStage.setScene(scene);
        primaryStage.show();//creamos la escena, la ponemos titulo, le asignamos la ventana y se hace visible
    }

    public static void main(String[] args) {
        launch(args);
    }
}
