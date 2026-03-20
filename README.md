# 📚 Librería Online API - Spring Boot

Este proyecto es una **API REST** desarrollada con **Spring Boot** para la gestión de un catálogo de libros. Implementa un CRUD completo siguiendo una arquitectura por capas, con persistencia en una base de datos **MySQL**.

## 🛠️ Tecnologías Utilizadas

* **Java 25** (o la versión que estés usando)
* **Spring Boot 4.x**
* **Spring Data JPA**: Para el manejo de la persistencia.
* **MySQL**: Base de datos relacional.
* **Maven**: Gestor de dependencias.
* **Postman**: Para pruebas de endpoints.
* **Lombok**: (Opcional) Para reducir el código boilerplate.

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una estructura de **arquitectura por capas** para garantizar la separación de responsabilidades:

1.  **Model (Entity):** Define la estructura de la tabla `libro` en la base de datos.
2.  **Repository:** Interfaz que extiende de `JpaRepository` para las operaciones CRUD.
3.  **Service:** Contiene la lógica de negocio y comunica el controlador con el repositorio.
4.  **Controller:** Expone los endpoints de la API y gestiona las peticiones HTTP.

## 🚀 Configuración e Instalación

### 1. Base de Datos
Crea una base de datos en MySQL llamada `librosdb`:
```sql
CREATE DATABASE librosdb;
