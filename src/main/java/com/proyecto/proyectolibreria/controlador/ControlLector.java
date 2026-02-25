package com.proyecto.proyectolibreria.controlador;

import com.proyecto.Clases.Material_Lectura.Lector;
import com.proyecto.proyectolibreria.basedatos.BasedeDatos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class ControlLector {
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtEdad;
    @FXML
    private Label lblMensaje;

    @FXML
    public void crearLector(String id, String correo,int edad){
        Lector lector = new Lector(id, correo,edad);
        BasedeDatos.lectores.add(lector);
    }

    public Lector buscalect(String id){
        for (int i = 0; i<BasedeDatos.lectores.size(); i++){
            if (BasedeDatos.lectores.get(i).getId().equals(id)){
                return BasedeDatos.lectores.get(i);
            }
        }
        return null;
    }

    public boolean updCorreo(String id,String nuevoCorreo){
        Lector lector = buscalect(id);
        if (lector != null){
            lector.setCorreo(nuevoCorreo);
            return true;
        }
        return false;
    }

    public boolean delLector(String id){
        Lector lector = buscalect(id);
        if (lector != null){
            BasedeDatos.lectores.remove(lector);
            return true;
        }
        return false;
    }

    @FXML
    private void crearLector(){
        crearLector(txtId.getText(), txtCorreo.getText(), Integer.parseInt(txtEdad.getText()));
        lblMensaje.setText("Lector creado");
    }

    @FXML
    private void buscar(){
        Lector lector = buscalect(txtId.getText());
        if (lector != null){
            txtCorreo.setText(lector.getCorreo());
            txtEdad.setText(String.valueOf((lector.getEdad())));
            lblMensaje.setText("Encontrado");
        }else{
            lblMensaje.setText("No existe");
        }
    }

    @FXML
    private void actualizar(){
        boolean actualizado = updCorreo(txtId.getText(), txtCorreo.getText());
        lblMensaje.setText(actualizado ? "Actualizado":"No encontrado");
    }

    @FXML
    private void eliminar(){
        boolean eliminado = delLector(txtId.getText());
        lblMensaje.setText((eliminado ? "Eliminado" : "No encontrado"));
    }

    @FXML
    private void finalizarLectura() {
        String id = txtId.getText();

        ControlLector control = new ControlLector();
        Lector lector = control.buscalect(id);

        if (lector != null) {
            lblMensaje.setText("Lectura finalizada, " + lector.getId());
        } else {
            lblMensaje.setText("No existe tal lector");
        }
    }
}