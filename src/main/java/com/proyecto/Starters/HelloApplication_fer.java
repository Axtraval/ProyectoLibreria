package com.proyecto.Starters;

import com.proyecto.Clases.Material_Lectura.Ilustrado;
import com.proyecto.Clases.Material_Lectura.Libro;
import com.proyecto.Clases.Material_Lectura.Lectura;
import com.proyecto.Controllers.InfoLibro.HelloController_InfoLibro;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HelloApplication_fer extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/proyecto/Interfaces/info-libros.fxml")
        );

        Scene scene = new Scene(loader.load());

        HelloController_InfoLibro controller = loader.getController();

        ArrayList<Libro> lista = new ArrayList<>();

        lista.add(new Lectura("El Principito", "Antoine de Saint-Exupéry", "Ficción", 250, 1943));
        lista.add(new Ilustrado("1984", "George Orwell", "Distopía", 300, 1949,false,3));

        controller.setLibros(lista);
        controller.cargarLibros();

        stage.setTitle("MyReadingBook");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}