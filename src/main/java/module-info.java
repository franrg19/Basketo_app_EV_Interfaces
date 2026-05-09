module com.ejemplo.lista_compra {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ejemplo.lista_compra.controller to javafx.fxml;
    exports com.ejemplo.lista_compra.vista;
}