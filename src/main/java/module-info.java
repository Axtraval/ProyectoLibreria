module com.proyecto.proyectolibreria {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.proyecto.crud_ingreso to javafx.fxml;
    exports com.proyecto.crud_ingreso;

    opens com.proyecto.crud_ingreso.controller to javafx.fxml;

    opens com.proyecto.proyectolibreria.Crudlect to javafx.fxml;
    exports com.proyecto.proyectolibreria.Crudlect;
}