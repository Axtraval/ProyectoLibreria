module com.proyecto.proyectolibreria {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.proyecto.proyectolibreria to javafx.fxml;
    exports com.proyecto.proyectolibreria;

    opens com.proyecto.proyectolibreria.Crudlect to javafx.fxml;
    exports com.proyecto.proyectolibreria.Crudlect;
}