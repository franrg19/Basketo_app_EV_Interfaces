package com.ejemplo.lista_compra.controller;

import com.ejemplo.lista_compra.model.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;


/**
 * Clase controladora principal de la aplicación.
 * Se encarga de gestionar los eventos y la lógica
 * de la lista de la compra.
 */
public class HelloController {

    // Campo de texto donde el usuario escribe el nombre del producto
    @FXML
    private TextField txtProducto;

    // ListView que mostrará los productos de la lista
    @FXML
    private ListView<Producto> listaProductos;

    /**
     * Méto-do initialize().
     * Se ejecuta automáticamente al iniciar la ventana.
     * Configura cómo se mostrarán los productos en el ListView.
     */
    @FXML
    public void initialize() {

        listaProductos.setCellFactory(param -> new ListCell<>() {

            private final CheckBox checkBox = new CheckBox();

                /**
                 * Méto-do que actualiza cada elemento de la lista.*/
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


    /**
     * Méto-do para agregar un nuevo producto a la lista.
     * Se ejecuta al pulsar el botón "Agregar".
     */

    @FXML
    public void agregarProducto() {

        String nombreProducto = txtProducto.getText();

        if (!nombreProducto.isEmpty()) {

            Producto nuevoProducto = new Producto(nombreProducto);

            listaProductos.getItems().add(nuevoProducto);

            txtProducto.clear();
        }
    }

    /**
     * Méto-do para eliminar un producto seleccionado de la lista.
     * Se ejecuta al pulsar el botón "Eliminar".
     */
    @FXML
    public void eliminarProducto() {

        Producto seleccionado =
                listaProductos.getSelectionModel().getSelectedItem();

        listaProductos.getItems().remove(seleccionado);
    }
}