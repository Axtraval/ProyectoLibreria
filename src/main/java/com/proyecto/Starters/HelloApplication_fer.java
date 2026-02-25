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

        //agregar frecuencia y isacolor (booleano)
        lista.add(new Ilustrado("havana", "camilo", "fantasia", 20, 1990, false, 3));
        lista.add(new Lectura("bibiu", "bollie", "romance", 15, 2005));
        lista.add(new Ilustrado("El Hobbit (Edicion Ilustrada)", "J.R.R. Tolkien", "Fantasia", 1000, 1937, true, 3));
        lista.add(new Ilustrado("Harry Potter Y La Piedra Filosofal (Edicion Ilustrada)", "J.K. Rowling", "Fantasia", 900, 1997, true, 4));
        lista.add(new Ilustrado("El Principe Cruel (Edicion Ilustrada)", "Holly Black", "Fantasia", 700, 2018, true, 1));
        lista.add(new Ilustrado("Star Wars Archives (Edicion Ilustrada)", "Paul Duncan", "Ciencia Ficcion", 600, 2020, true, 2));
        lista.add(new Ilustrado("Ready Player One (Edicion Ilustrada)", "Ernest Cline", "Ciencia Ficcion", 750, 2011, false, 0));
        lista.add(new Ilustrado("Atlas del Futuro (Edicion Ilustrada)", "Chris Wormell", "Ciencia Ficcion", 950, 2023, true, 0));
        lista.add(new Ilustrado("Sherlock Holmes (Edicion Ilustrada)", "Arthur Conan Doyle", "Misterio", 650, 1887, false, 1));
        lista.add(new Ilustrado("Nancy Drew", "Carolyn Keene", "Misterio", 600, 1930, false, 2));
        lista.add(new Ilustrado("El Libro DeLa Selva", "Rudyard Kipling", "Aventura", 500, 1894, true, 1));
        lista.add(new Ilustrado("La Dama y el Vagabundo (Ilustrado)", "Disney", "Romance", 550, 1955, false, 4));
        lista.add(new Ilustrado("Orgullo y Prejuicio (Ilustrado)", "Jane Austen", "Romance", 700, 1813, true, 5));
        lista.add(new Ilustrado("Romeo y Julieta (Edicion Grafica)", "William Shakespeare", "Romance", 800, 1597, true, 6));
        lista.add(new Ilustrado("Coraline (Novela Grafica)", "Neil Gaiman", "Terror", 750, 2002, true, 3));
        lista.add(new Ilustrado("El Gato Negro (Edicion Ilustrada)", "Edgar Allan Poe", "Terror", 650, 1843, true, 1));
        lista.add(new Ilustrado("It (Edicion Ilustrada)", "Stephen King", "Terror", 1200, 1986, false, 3));
        lista.add(new Lectura("El Nombre del Viento", "Patrick Rothfuss", "Fantasia", 700, 2007));
        lista.add(new Lectura("La Quinta Estacion", "N.K. Jemisin", "Fantasia", 650, 2015));
        lista.add(new Lectura("El Temor de un Hombre Sabio", "Patrick Rothfuss", "Fantasia", 750, 2011));
        lista.add(new Lectura("Dune", "Frank Herbert", "Ciencia Ficcion", 850, 1965));
        lista.add(new Lectura("Neuromante", "William Gibson", "Ciencia Ficcion", 600, 1984));
        lista.add(new Lectura("Fundacion", "Isaac Asimov", "Ciencia Ficcion", 700, 1951));
        lista.add(new Lectura("El Codigo Da Vinci", "Dan Brown", "Misterio", 650, 2003));
        lista.add(new Lectura("La Chica del Tren", "Paula Hawkins", "Misterio", 600, 2015));
        lista.add(new Lectura("Asesinato en el Orient Express", "Agatha Christie", "Misterio", 550, 1934));
        lista.add(new Lectura("Bajo la Misma Estrella", "John Green", "Romance", 500, 2012));
        lista.add(new Lectura("El Cuaderno de Noah", "Nicholas Sparks", "Romance", 550, 1996));
        lista.add(new Lectura("Orgullo y Prejuicio", "Jane Austen", "Romance", 450, 1813));
        lista.add(new Lectura("It", "Stephen King", "Terror", 1100, 1986));
        lista.add(new Lectura("El Exorcista", "William Peter Blatty", "Terror", 800, 1971));
        lista.add(new Lectura("Cementerio de Animales", "Stephen King", "Terror", 900, 1983));

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

