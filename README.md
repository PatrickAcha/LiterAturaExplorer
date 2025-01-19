# Proyecto de Literatura

Este proyecto es una aplicación Java Spring creada para gestionar libros y autores. Puedes buscar libros por título, listar libros registrados, listar autores registrados y vivos, así como listar libros por idioma.

## Requisitos

- Java 11 o superior
- Maven 3.x
- Spring Framework

## Estructura del Proyecto

El proyecto consta de las siguientes partes:

- **Controllers**: Manejan las peticiones y respuestas.
  - `Principal`: Controlador principal que maneja el menú de opciones para la gestión de libros y autores.
  
- **Services**: Contienen la lógica de negocio.
  - `LibroService`: Servicio para la gestión de libros.
  - `AutoService`: Servicio para la gestión de autores.
  - `ConsumoAPI`: Servicio para consumir APIs externas.
  - `ConvierteDatos`: Servicio para convertir datos.

- **Models**: Representan las entidades del dominio.
  - `Libro`: Clase que representa un libro.

## Cómo ejecutar la aplicación

1. **Clonar el repositorio**:
    ```bash
    git clone (https://github.com/PatrickAcha/LiterAturaExplorer.git)
    cd proyecto-literatura
    ```

2. **Compilar y empaquetar el proyecto**:
    ```bash
    mvn clean install
    ```

3. **Ejecutar la aplicación**:
    ```bash
    mvn spring-boot:run
    ```

## Uso de la aplicación

Al ejecutar la aplicación, se mostrará un menú con las opciones disponibles:

```plaintext
--- LITERATURA ---
1 - Buscar libro por título
2 - Listar libros registrados
3 - Listar autores registrados
4 - Listar autores vivos en un año
5 - Listar libros por idioma
0 - Salir
Seleccione una opción:
