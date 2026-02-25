package com.proyecto.Controllers.InfoLibro;
import com.proyecto.Clases.Material_Lectura.Libro;


import com.proyecto.Clases.UtilsDsh.Libro_dsh;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class HelloController_InfoLibro {

    @FXML
    private ListView<String> librosList;

    @FXML
    private Label welcomeText;
    private ArrayList<Libro> libros;

    public HelloController_InfoLibro(ArrayList<Libro> libros){
        this.libros = libros;
    }
    public HelloController_InfoLibro(){

    }

    public void setLibros(ArrayList<Libro>libros){
        this.libros=libros;
    }
    @FXML
    public void initialize(){
        welcomeText.setText("Bienvenido a la Biblioteca");

        }

        public void cargarLibros(){
            if (libros != null) {
                for (Libro libro : libros) {
                    librosList.getItems().add(libro.getTitulo());
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
    @FXML
    private void onVolverClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/proyecto/Interfaces/publicar.fxml")
            );

            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
