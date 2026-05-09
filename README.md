# 🛒 Basketo - lista de la compra - JavaFX

## 📌 Descripción del proyecto

Aplicación desarrollada en Java utilizando JavaFX que permite gestionar una lista de la compra de forma sencilla e intuitiva.

La aplicación permite:

* Añadir productos
* Eliminar productos
* Marcar productos como comprados
* Utilizar una interfaz gráfica moderna con CSS

Este proyecto ha sido desarrollado siguiendo una arquitectura MVC (Modelo - Vista - Controlador).

---
<h2>📸 Captura de pantalla</h2>

<p align="center">
  <img src="images/basketo.png" width="350">
</p>


# 🚀 Tecnologías utilizadas

* Java 21
* JavaFX
* Maven
* CSS
* FXML
* IntelliJ IDEA

---

# 🧠 Arquitectura MVC

## 🔹 Modelo (Model)

Contiene las clases encargadas de gestionar los datos.

### Producto.java

Representa cada producto de la lista.

Atributos principales:

* nombre
* comprado

---

## 🔹 Vista (View)

Se encarga de mostrar la interfaz gráfica.

### hello-view.fxml

Define visualmente la aplicación:

* Logo
* TextField
* Botones
* ListView

### style.css

Archivo CSS encargado del diseño visual:

* Colores
* Botones
* Bordes
* Tipografía
* Hover

---

## 🔹 Controlador (Controller)

Gestiona la lógica y eventos de la aplicación.

### HelloController.java

Funciones principales:

* Agregar productos
* Eliminar productos
* Marcar productos como comprados
* Mostrar alertas
* Gestionar eventos

---

# ✅ Funcionalidades principales

## ➕ Añadir productos

El usuario puede introducir un producto mediante un TextField.

El producto se añade:

* Pulsando el botón "Agregar"
* Pulsando la tecla ENTER

---

## ❌ Eliminar productos

Permite eliminar productos seleccionados de la lista.

---

## ☑️ Marcar productos como comprados

Cada producto contiene un CheckBox para indicar si ha sido comprado.

---
# 🎨 Diseño visual

La interfaz utiliza CSS para proporcionar:

* Fondo moderno
* Botones personalizados
* Bordes redondeados
* Hover en botones
* Interfaz más atractiva

---

# ▶️ Ejecución del proyecto

## Requisitos

* Java 21 o superior
* Maven
* IntelliJ IDEA recomendado

---

## Ejecutar la aplicación

Desde IntelliJ:

1. Abrir el proyecto
2. Ejecutar HelloApplication.java

---
# 👨‍💻 Autor

Proyecto desarrollado por Fran Rebollo como práctica de Desarrollo de Interfaces utilizando JavaFX.

