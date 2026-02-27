package com.proyecto.Controllers.InfoLibro;
import com.proyecto.Clases.Material_Lectura.Libro;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import com.proyecto.Clases.UtilsDsh.Libro_dsh;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class HelloController_InfoLibro {

    @FXML
    private ListView<String> librosList;

    @FXML
    private Label welcomeText;
    private ArrayList<Libro> libros;
    private int puntos = 0;
    private Timeline timeline;

    public HelloController_InfoLibro(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public HelloController_InfoLibro() {

    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    private Libro libroActual;


    @FXML
    public void initialize() {
        welcomeText.setText("Bienvenido a la Biblioteca");

    }

    public void cargarLibros() {
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
            welcomeText.setText(seleccionado.mostrarInfo()+ "\n Puntos acumulados:"+seleccionado.getPuntoslectura());
        } else {
            welcomeText.setText("No has seleccionado ningún libro.");
        }


    }

    @FXML
    private void onVolverClick(ActionEvent event) {
        if (timeline != null) {
            timeline.stop();
        }
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

    @FXML
    protected void onInicializarLecturaClick() {
        int index = librosList.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            libroActual = libros.get(index);
            libroActual.reinciarPuntosLectura();
            welcomeText.setText("Iniciando lectura de: "+libroActual.getTitulo());
            if (timeline != null) {
                timeline.stop();
            }
            timeline = new Timeline(new KeyFrame(Duration.seconds(5), e -> {
                libroActual.sumarPuntoLectura();
                welcomeText.setText("Leyendo " + libroActual.getTitulo() + " | Puntos: " + libroActual.getPuntoslectura());
            }));
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
        } else {
            welcomeText.setText("Selecciona un libro primero");
        }
    }

    @FXML
    protected void onFinalizarLecturaClick() {
        if (timeline != null) {
            timeline.stop();
        }
        if (libroActual != null) {
            welcomeText.setText("Lectura Finalizada \n Libro: " + libroActual.getTitulo() + "\n Puntos acumulados: " + libroActual.getPuntoslectura());
        } else {
            welcomeText.setText("No hay ninguna lectura activa");


        }
    }

    @FXML
    protected void onMostrarPuntosClick(){
        int index = librosList.getSelectionModel().getSelectedIndex();
        int totalPuntos = 0;
        for (Libro libro:libros){
            totalPuntos += libro.getPuntoslectura();
        }
        if (index >=0){
            Libro seleccionado = libros.get(index);
            welcomeText.setText("Libro seleccionado: "+ seleccionado.getTitulo()+"\n Puntos obtenidos en este libro: "+seleccionado.getPuntoslectura()+"\n\n Total acumulado en todos los libros: "+totalPuntos);
        }else{
            welcomeText.setText("Total acumulado en todos los libros: "+totalPuntos);
        }
    }
}