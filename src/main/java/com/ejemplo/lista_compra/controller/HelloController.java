package com.ejemplo.lista_compra.controller;

import com.ejemplo.lista_compra.model.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

public class HelloController {

    @FXML
    private TextField txtProducto;

    @FXML
    private ListView<Producto> listaProductos;

    @FXML
    public void initialize() {

        listaProductos.setCellFactory(param -> new ListCell<>() {

            private final CheckBox checkBox = new CheckBox();

            @Override
            protected void updateItem(Producto producto, boolean empty) {

                super.updateItem(producto, empty);

                if (empty || producto == null) {

                    setGraphic(null);

                } else {

                    checkBox.setText(producto.getNombre());

                    checkBox.setSelected(producto.isComprado());

                    checkBox.setOnAction(e -> {
                        producto.setComprado(checkBox.isSelected());
                    });

                    setGraphic(checkBox);
                }
            }
        });
    }


    // AGREGAR PRODUCTO

    @FXML
    public void agregarProducto() {

        String nombreProducto = txtProducto.getText();

        if (!nombreProducto.isEmpty()) {

            Producto nuevoProducto =
                    new Producto(nombreProducto);

            listaProductos.getItems().add(nuevoProducto);

            txtProducto.clear();
        }
    }

    //ELIMINAR PRODUCTO
    @FXML
    public void eliminarProducto() {

        Producto seleccionado =
                listaProductos.getSelectionModel().getSelectedItem();

        listaProductos.getItems().remove(seleccionado);
    }
}