package com.proyecto.proyectolibreria.Crudlect;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication_dsh extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication_dsh.class.getResource("/com/proyecto/proyectolibreria/Crudlect/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 450);
        stage.setTitle("Publicador de Libros");
        stage.setScene(scene);
        stage.show();
    }
}
