package com.ejemplo.lista_compra.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Esta clase representa al producto que añadimos a la lista de la compra
 * Cada producto tendrá:
 * - un nombre
 * -un estado comprado.
 */
public class Producto {
    private StringProperty nombre;
    private BooleanProperty comprado;

    //Creamos el constructor de la clase.

    public Producto(String nombre) {
        this.nombre = new SimpleStringProperty(nombre);
        this.comprado = new SimpleBooleanProperty(false); // Por defecto NO COMPRADO
    }

    //GETTERS

    //Se devuelve el valor real
    public String getNombre (){
        return nombre.get();
    }

    //Se devuelve el objeto property
    public StringProperty nombreProperty (){
        return nombre;
    }

    //devuelve si el producto esta marcado como comprado
    public Boolean isComprado(){
        return comprado.get();
    }

    //Se devuelve el objeto property
    public BooleanProperty compradoProperty (){
        return comprado;
    }



    //SETTERS

    //cambia el estado de comprado
    public void setComprado (boolean comprado){
        this.comprado.set(comprado);
    }

    //TO STRING


    @Override
    public String toString() {

        if (isComprado()) {
            return "✔ " + getNombre();
        } else {
            return getNombre();
        }
    }
}
