module com.proyecto.proyectolibreria {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.proyecto.Controllers.Crud_Ingreso to javafx.fxml;
    opens com.proyecto.Controllers.Crud_Lectura to javafx.fxml;
    opens com.proyecto.Controllers.InfoLibro to javafx.fxml;

    exports com.proyecto.Clases.Clientes;
    exports com.proyecto.Clases.Material_Lectura;
    exports com.proyecto.Clases.UtilsDsh;

    exports com.proyecto.Starters;
}