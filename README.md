# T1 Feign Grupo 8

Proyecto correspondiente a la Pregunta 1 de la evaluación. Consume `GET https://jsonplaceholder.typicode.com/albums` mediante OpenFeign y devuelve solamente los álbumes con `userId` par e `id` impar.

## Tecnologías requeridas

- Java 25
- Spring Boot 4.1.1
- Spring Cloud 2025.1.3
- OpenFeign

## Clases principales

- `AlbumsPlaceHolder`: modelo con `userId`, `id` y `title`.
- `AlbumClient`: cliente Feign que consume `/albums`.
- `AlbumService`: aplica los filtros solicitados.
- `AlbumController`: expone el resultado para demostrar el funcionamiento.

## Ejecutar desde IntelliJ IDEA

1. Abre la carpeta `T1-FeignGrupo8` con **File > Open**.
2. Importa el proyecto como Maven.
3. Ejecuta `T1FeignGrupo8Application`.
4. Consulta: `GET http://localhost:8080/api/albums/filtrados`.

La respuesta contiene únicamente los álbumes cuyo `userId` es par y cuyo `id` es impar.
