package com.proyecto.Controllers.Crud_Lectura;

import com.proyecto.Clases.Material_Lectura.Ilustrado;
import com.proyecto.Clases.Material_Lectura.Lectura;
import com.proyecto.Clases.Material_Lectura.Libro;
import com.proyecto.Controllers.InfoLibro.HelloController_InfoLibro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloController_Ilustrado {

    @FXML private TableView<Ilustrado> tablaLibros;

    @FXML private TableColumn<Ilustrado, String> colTitulo;
    @FXML private TableColumn<Ilustrado, Integer> colAnio;
    @FXML private TableColumn<Ilustrado, String> colAutor;
    @FXML private TableColumn<Ilustrado, String> colGenero;
    @FXML private TableColumn<Ilustrado, Integer> colPuntos;
    @FXML private TableColumn<Ilustrado, Boolean> colAcolor;
    @FXML private TableColumn<Ilustrado, Integer> colFrecuencia;

    @FXML private TextField txtTitulo;
    @FXML private TextField txtAnio;
    @FXML private TextField txtAutor;
    @FXML private TextField txtGenero;
    @FXML private TextField txtPuntos;
    @FXML private TextField txtFrecuencia;

    @FXML private CheckBox checkAcolor;

    private ObservableList<Ilustrado> listaIlustrados = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        colAnio.setCellValueFactory(new PropertyValueFactory<>("anio"));
        colAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        colGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
        colPuntos.setCellValueFactory(new PropertyValueFactory<>("puntos"));
        colAcolor.setCellValueFactory(new PropertyValueFactory<>("acolor"));
        colFrecuencia.setCellValueFactory(new PropertyValueFactory<>("frecuency"));

        tablaLibros.setItems(listaIlustrados);
    }

    @FXML
    protected void onPublicarClick() {

        try {
            String titulo = txtTitulo.getText();
            int anio = Integer.parseInt(txtAnio.getText());
            String autor = txtAutor.getText();
            String genero = txtGenero.getText();
            int puntos = Integer.parseInt(txtPuntos.getText());
            int frecuencia = Integer.parseInt(txtFrecuencia.getText());
            boolean esAcolor = checkAcolor.isSelected();

            Ilustrado nuevo = new Ilustrado(
                    titulo,
                    autor,
                    genero,
                    puntos,
                    anio,
                    esAcolor,
                    frecuencia
            );

            listaIlustrados.add(nuevo);
            limpiarCampos();

            mostrarInfo("Éxito", "Libro ilustrado agregado correctamente.");

        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Año, Puntos y Frecuencia deben ser números.");
        }
    }

    @FXML
    protected void onModificarClick() {

        Ilustrado seleccionado = tablaLibros.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            try {
                seleccionado.setTitulo(txtTitulo.getText());
                seleccionado.setAutor(txtAutor.getText());
                seleccionado.setGenero(txtGenero.getText());
                seleccionado.setPuntos(Integer.parseInt(txtPuntos.getText()));
                seleccionado.setAnio(Integer.parseInt(txtAnio.getText()));
                seleccionado.setImgVisualized(checkAcolor.isSelected());
                seleccionado.setFrecuency(Integer.parseInt(txtFrecuencia.getText()));

                tablaLibros.refresh();
                limpiarCampos();

                mostrarInfo("Éxito", "Libro ilustrado modificado.");

            } catch (NumberFormatException e) {
                mostrarAlerta("Error", "Datos numéricos inválidos.");
            }
        } else {
            mostrarInfo("Información", "Selecciona un libro para modificar.");
        }
    }

    @FXML
    protected void onEliminarClick() {

        Ilustrado seleccionado = tablaLibros.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            listaIlustrados.remove(seleccionado);
            mostrarInfo("Éxito", "Libro eliminado.");
        } else {
            mostrarInfo("Información", "Selecciona un libro para eliminar.");
        }
    }

    @FXML
    protected void onMostrarClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/proyecto/Interfaces/info-libros.fxml")
        );

        Parent root = loader.load();

        HelloController_InfoLibro controller = loader.getController();

        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(new Lectura("El Principito", "Antoine de Saint-Exupéry", "Ficción", 250, 1943));
        lista.add(new Lectura("1984", "George Orwell", "Distopía", 300, 1949));
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

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void limpiarCampos() {
        txtTitulo.clear();
        txtAnio.clear();
        txtAutor.clear();
        txtGenero.clear();
        txtPuntos.clear();
        txtFrecuencia.clear();
        checkAcolor.setSelected(false);
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void mostrarInfo(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    @FXML
    protected void onVolverClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/proyecto/Interfaces/publicar.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}