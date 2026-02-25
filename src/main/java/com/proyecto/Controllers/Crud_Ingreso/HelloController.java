package com.proyecto.Controllers.Crud_Ingreso;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class HelloController {

    @FXML
    private void login(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("/com/proyecto/Interfaces/login-view.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}