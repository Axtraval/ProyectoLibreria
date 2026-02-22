package com.proyecto.proyectolibreria;
import com.proyecto.proyectolibreria.modolectura.Libro;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.ArrayList;
import javafx.scene.control.ListView;

public class HelloController {

    @FXML
    private ListView<String> librosList;

    @FXML
    private Label welcomeText;
    private ArrayList<Libro> libros;

    public HelloController(ArrayList<Libro> libros){
        this.libros = libros;
    }
    public HelloController(){

    }

    public void setLibros(ArrayList<Libro>libros){
        this.libros=libros;
    }
    @FXML
    public void initialize(){
        welcomeText.setText("bienvenido a la lista");

        }

        public void cargarLibros(){
            if (libros != null) {
                for (Libro libro : libros) {
                    librosList.getItems().add(libro.getTitulo()); // solo título
                }
            }
        }


    @FXML
    protected void onMostrarLibrosClick() {
        int index = librosList.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Libro seleccionado = libros.get(index);
            welcomeText.setText(seleccionado.mostrarInfo());
        } else {
            welcomeText.setText("No has seleccionado ningún libro.");
        }


    }
}
