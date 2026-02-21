package com.proyecto.proyectolibreria.Crudlect;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML private TableView<Libro> tablaLibros;
    @FXML private TableColumn<Libro, Integer> colId;
    @FXML private TableColumn<Libro, String> colTitulo;
    @FXML private TextField txtTitulo;


    private ObservableList<Libro> listaLibros = FXCollections.observableArrayList();
    private int contadorId = 1;

    @FXML
    public void initialize() {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));

        tablaLibros.setItems(listaLibros);
    }

    @FXML
    protected void onPublicarClick() {
        String nombre = txtTitulo.getText();
        if (!nombre.isEmpty()) {
            listaLibros.add(new Libro(contadorId++, nombre));
            txtTitulo.clear();
        }
    }

    @FXML
    protected void onModificarClick() {
        Libro seleccionado = tablaLibros.getSelectionModel().getSelectedItem();
        String nuevoTitulo = txtTitulo.getText();
        if (seleccionado != null && !nuevoTitulo.isEmpty()) {
            seleccionado.setTitulo(nuevoTitulo);
            tablaLibros.refresh();
            txtTitulo.clear();
            System.out.println("Modificado exitosamente");
        }else{
            System.out.println("Seleccione un libro y escriba el nuevo titulo");
        }
    }

    @FXML
    protected void onEliminarClick() {
        Libro seleccionado = tablaLibros.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            listaLibros.remove(seleccionado);
        }
    }
}
