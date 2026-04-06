# Bus API - Backend

API REST desarrollada con Spring Boot para la gestión de buses.

## Tecnologías

* Java 17
* Spring Boot 3
* Spring Data JPA
* Spring Security (Basic Auth)
* PostgreSQL

## Funcionalidades

* Listado de buses con paginación
* Obtención de bus por ID
* Relación entre Bus y Marca
* Seguridad en endpoints con autenticación básica

## Endpoints

### Obtener lista de buses (paginado)

GET /bus?page=0&size=5

### Obtener bus por ID

GET /bus/{id}

## Credenciales

Usuario: admin
Password: 1234

## Ejecución

1. Clonar repositorio
2. Configurar base de datos en `application.properties`
3. Ejecutar:

mvn spring-boot:run

## Base de datos

Motor: PostgreSQL

Asegúrate de tener creada la base de datos y configurar:

spring.datasource.url=jdbc:postgresql://localhost:5432/tu_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password

## Autor

Michael Colan Herbozo
