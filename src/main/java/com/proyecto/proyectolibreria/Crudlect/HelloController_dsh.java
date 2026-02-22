package com.proyecto.proyectolibreria.Crudlect;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController_dsh {

    @FXML private TableView<Libro_dsh> tablaLibros;
    @FXML private TableColumn<Libro_dsh, Integer> colId;
    @FXML private TableColumn<Libro_dsh, String> colTitulo;
    @FXML private TextField txtTitulo;


    private ObservableList<Libro_dsh> listaLibroDshes = FXCollections.observableArrayList();
    private int contadorId = 1;

    @FXML
    public void initialize() {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));

        tablaLibros.setItems(listaLibroDshes);
    }

    @FXML
    protected void onPublicarClick() {
        String nombre = txtTitulo.getText();
        if (!nombre.isEmpty()) {
            listaLibroDshes.add(new Libro_dsh(contadorId++, nombre));
            txtTitulo.clear();
        }
    }

    @FXML
    protected void onModificarClick() {
        Libro_dsh seleccionado = tablaLibros.getSelectionModel().getSelectedItem();
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
        Libro_dsh seleccionado = tablaLibros.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            listaLibroDshes.remove(seleccionado);
        }
    }
}
