package com.proyecto.Starters;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication_dsh extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication_dsh.class.getResource("/com/proyecto/Interfaces/publicar.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 400, 450);

        stage.setTitle("Publicador de Libros");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}