package com.proyecto.Controllers.Crud_Ingreso;

import com.proyecto.Clases.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
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
    private void ingresar(ActionEvent event) throws IOException {

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

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/proyecto/Interfaces/publicar.fxml")
            );

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

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