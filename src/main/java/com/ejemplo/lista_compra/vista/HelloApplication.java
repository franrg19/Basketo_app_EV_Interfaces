package com.ejemplo.lista_compra.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/fxml/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        stage.setTitle("BASKETO");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/logo_basketo.png"))));

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}