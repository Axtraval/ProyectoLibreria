module com.proyecto.crud_ingreso {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.proyecto.crud_ingreso to javafx.fxml;
    opens com.proyecto.crud_ingreso.controller to javafx.fxml;

    exports com.proyecto.crud_ingreso;
    exports com.proyecto.crud_ingreso.controller;
}