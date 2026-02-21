package com.proyecto.proyectolibreria;

import com.proyecto.proyectolibreria.modolectura.Ilustrado;
import com.proyecto.proyectolibreria.modolectura.Lectura;
import com.proyecto.proyectolibreria.modolectura.Libro;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        ArrayList<Libro> libritos = new ArrayList<>();
        libritos.add(new Ilustrado("havana","camilo","fantasia",20,1990,false,3));
        libritos.add(new Lectura("bibiu","bollie","romance",15, 2005));

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("hello-view.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 500,300);

        HelloController controller =fxmlLoader.getController();
        controller.setLibros(libritos);
        controller.cargarLibros();

        stage.setTitle("Biblioteca -Proyecto Librería");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
