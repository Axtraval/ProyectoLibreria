package com.proyecto.crud_ingreso.controller;

import com.proyecto.crud_ingreso.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label mensaje;

    private ArrayList<Usuario> whitelist = new ArrayList<>();

    @FXML
    public void initialize() {
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        whitelist.add(new Usuario("Erick", "Manzana", 1254));
        whitelist.add(new Usuario("Braulio", "Pera", 7895));
        whitelist.add(new Usuario("Dasha", "Durazno", 185));
        whitelist.add(new Usuario("Fernando", "Banana", 5000));
    }

    @FXML
    private void ingresar() {

        String usuario = txtUsuario.getText();
        String contrasena = txtPassword.getText();

        boolean permitido = false;

        for (Usuario us : whitelist) {
            if (us.getId().equals(usuario) &&
                    us.getContrasena().equals(contrasena)) {
                permitido = true;
                break;
            }
        }

        if (permitido) {
            mensaje.setText("Acceso Concedido");
        } else {
            mensaje.setText("Acceso Denegado");
        }
    }

    @FXML
    private void registrarse() {

        String nuevoUsuario = txtUsuario.getText();
        String nuevaContrasena = txtPassword.getText();

        whitelist.add(new Usuario(nuevoUsuario, nuevaContrasena, 0));

        mensaje.setText("Usuario Registrado");
    }
}