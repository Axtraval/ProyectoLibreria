package com.proyecto.Controllers.Crud_Lectura;

import com.proyecto.Clases.Material_Lectura.Lectura;
import com.proyecto.Clases.Material_Lectura.Libro;
import com.proyecto.Clases.UtilsDsh.Libro_dsh;
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

public class HelloController_dsh {

    @FXML private TableView<Libro_dsh> tablaLibros;

    @FXML private TableColumn<Libro_dsh, Integer> colId;
    @FXML private TableColumn<Libro_dsh, String> colTitulo;
    @FXML private TableColumn<Libro_dsh, Integer> colAnio;
    @FXML private TableColumn<Libro_dsh, String> colAutor;
    @FXML private TableColumn<Libro_dsh, String> colGenero;
    @FXML private TableColumn<Libro_dsh, Integer> colPuntos;

    @FXML private TextField txtTitulo;
    @FXML private TextField txtAnio;
    @FXML private TextField txtAutor;
    @FXML private TextField txtGenero;
    @FXML private TextField txtPuntos;

    private ObservableList<Libro_dsh> listaLibroDshes = FXCollections.observableArrayList();
    private Funciones_Logica servicio = new Funciones_Logica();

    @FXML
    public void initialize() {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        colAnio.setCellValueFactory(new PropertyValueFactory<>("anio"));
        colAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        colGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
        colPuntos.setCellValueFactory(new PropertyValueFactory<>("puntos"));

        tablaLibros.setItems(listaLibroDshes);

        // Mostrar libros al iniciar
        listaLibroDshes.setAll(servicio.listar());
    }

    @FXML
    protected void onPublicarClick() {

        try {
            String titulo = txtTitulo.getText();
            int anio = Integer.parseInt(txtAnio.getText());
            String autor = txtAutor.getText();
            String genero = txtGenero.getText();
            int puntos = Integer.parseInt(txtPuntos.getText());

            if (!titulo.isEmpty() && !autor.isEmpty() && !genero.isEmpty()) {

                servicio.publicar(titulo, anio, autor, genero, puntos);
                listaLibroDshes.setAll(servicio.listar());

                limpiarCampos();
                mostrarInfo("Éxito", "Libro publicado correctamente.");
            }

        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Año y Puntos deben ser números.");
        }
    }

    @FXML
    protected void onModificarClick() {

        Libro_dsh seleccionado = tablaLibros.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            try {
                String titulo = txtTitulo.getText();
                int anio = Integer.parseInt(txtAnio.getText().trim());
                String autor = txtAutor.getText();
                String genero = txtGenero.getText();
                int puntos = Integer.parseInt(txtPuntos.getText().trim());

                servicio.modificar(seleccionado.getId(), titulo, anio, autor, genero, puntos);
                listaLibroDshes.setAll(servicio.listar());

                limpiarCampos();
                mostrarInfo("Éxito", "Libro modificado correctamente.");

            } catch (NumberFormatException e) {
                mostrarAlerta("Error", "Año y Puntos deben ser números.");
            }
        } else {
            mostrarInfo("Información", "Selecciona un libro para modificar.");
        }
    }

    @FXML
    protected void onEliminarClick() {

        Libro_dsh seleccionado = tablaLibros.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            servicio.eliminar(seleccionado.getId());
            listaLibroDshes.setAll(servicio.listar());

            mostrarInfo("Éxito", "Libro eliminado correctamente.");
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
}