package com.ejemplo.lista_compra.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * Clase principal de la aplicación.
 *
 * Hereda de Application, que es la clase base
 * para cualquier aplicación JavaFX.
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/fxml/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        // Añade la hoja de estilos CSS a la escena
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        stage.setTitle("BASKETO");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.centerOnScreen();
        // Añade el icono personalizado de la aplicación
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/logo_basketo.png"))));

        stage.show();
    }
// Punto de entrada principal al programa
    public static void main(String[] args) {
        launch();
    }
}