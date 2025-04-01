# API de Estudiantes

Esta API proporciona endpoints para gestionar estudiantes en el sistema universitario.

## URL Base

```HTTP
http://localhost:8080
```
{style="block"}

## Endpoints

### 1. Crear Estudiante

Crea un nuevo estudiante en el sistema.

#### Request

```HTTP
POST http://localhost:8080/api/estudiantes
```
{style="block"}

#### Headers
```
Content-Type: application/json
```
{style="block"}

#### Request Body

```JSON
{
  "nombre": "Nuevo Estudiante",
  "apellido": "Apellido Nuevo",
  "email": "nuevo@gmail.com",
  "fechaNacimiento": "2000-05-15",
  "nroInscripcion": "S003"
}
```
{style="block"}

#### Curl

```Shell
curl -X POST http://localhost:8080/api/estudiantes \
  -H "Content-Type: application/json" \
  -d '{
    "nombre": "Nuevo Estudiante",
    "apellido": "Apellido Nuevo",
    "email": "nuevo@gmail.com",
    "fechaNacimiento": "2000-05-15",
    "nroInscripcion": "S003"
  }'
```
{style="block"}

#### Respuesta Exitosa (201 Created)

```JSON
{
  "id": 3,
  "nombre": "Nuevo Estudiante",
  "apellido": "Apellido Nuevo",
  "email": "nuevo@gmail.com",
  "fechaNacimiento": "2000-05-15",
  "nroInscripcion": "S003"
}
```
{style="block"}

### Obtener todos los estudiantes {id="get-all-students"}

Retorna una lista de todos los estudiantes registrados en el sistema.

#### Request {id="get-all-request"}

```HTTP
GET http://localhost:8080/api/estudiantes
```
{style="block"}

#### Curl {id="get-all-curl"}

```Shell
curl -X GET http://localhost:8080/api/estudiantes
```
{style="block"}

#### Respuesta {id="get-all-response"}

```JSON
[
  {
    "id": 1,
    "nombre": "Estudiante 1",
    "apellido": "App1",
    "email": "estudiante1@gmail.com",
    "fechaNacimiento": "2000-05-15",
    "nroInscripcion": "S001"
  },
  {
    "id": 2,
    "nombre": "Estudiante 2",
    "apellido": "App2",
    "email": "estudiante2@gmail.com",
    "fechaNacimiento": "2000-05-15",
    "nroInscripcion": "S002"
  }
]
```
{style="block"}

#### Campos de respuesta {id="get-all-fields"}

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único del estudiante |
| nombre | String | Nombre del estudiante |
| apellido | String | Apellido del estudiante |
| email | String | Correo electrónico del estudiante |
| fechaNacimiento | Date | Fecha de nacimiento (formato: YYYY-MM-DD) |
| nroInscripcion | String | Número de inscripción del estudiante |

### Obtener un estudiante por ID {id="get-student-by-id"}

Retorna la información de un estudiante específico según su ID.

#### Request {id="get-by-id-request"}

```HTTP
GET http://localhost:8080/api/estudiantes/{id}
```
{style="block"}

#### Curl {id="get-by-id-curl"}

```Shell
curl -X GET http://localhost:8080/api/estudiantes/1
```
{style="block"}

#### Respuesta {id="get-by-id-response"}

```JSON
{
  "id": 1,
  "nombre": "Estudiante 1",
  "apellido": "App1",
  "email": "estudiante1@gmail.com",
  "fechaNacimiento": "2000-05-15",
  "nroInscripcion": "S001"
}
```
{style="block"}

#### Campos de respuesta {id="get-by-id-fields"}

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único del estudiante |
| nombre | String | Nombre del estudiante |
| apellido | String | Apellido del estudiante |
| email | String | Correo electrónico del estudiante |
| fechaNacimiento | Date | Fecha de nacimiento (formato: YYYY-MM-DD) |
| nroInscripcion | String | Número de inscripción del estudiante |

### Actualizar un estudiante {id="update-student"}

Actualiza la información de un estudiante existente según su ID.

#### Request {id="update-request"}

```HTTP
PUT http://localhost:8080/api/estudiantes/{id}
```
{style="block"}

#### Curl {id="update-curl"}

```Shell
curl -X PUT http://localhost:8080/api/estudiantes/1 \
  -H "Content-Type: application/json" \
  -d '{
    "nombre": "Estudiante Actualizado",
    "apellido": "Apellido Actualizado",
    "email": "actualizado@gmail.com",
    "fechaNacimiento": "2000-05-15",
    "nroInscripcion": "S001"
  }'
```
{style="block"}

#### Request Body {id="update-request-body"}

```JSON
{
  "nombre": "Estudiante Actualizado",
  "apellido": "Apellido Actualizado",
  "email": "actualizado@gmail.com",
  "fechaNacimiento": "2000-05-15",
  "nroInscripcion": "S001"
}
```
{style="block"}

#### Respuesta {id="update-response"}

```JSON
{
  "id": 1,
  "nombre": "Estudiante Actualizado",
  "apellido": "Apellido Actualizado",
  "email": "actualizado@gmail.com",
  "fechaNacimiento": "2000-05-15",
  "nroInscripcion": "S001"
}
```
{style="block"}

#### Códigos de respuesta {id="update-response-codes"}

| Código | Descripción |
|--------|-------------|
| 200 | OK - Estudiante actualizado correctamente |
| 404 | Not Found - No se encontró el estudiante con el ID especificado |

### Eliminar un estudiante {id="delete-student"}

Elimina un estudiante existente según su ID.

#### Request {id="delete-request"}

```HTTP
DELETE http://localhost:8080/api/estudiantes/{id}
```
{style="block"}

#### Curl {id="delete-curl"}

```Shell
curl -X DELETE http://localhost:8080/api/estudiantes/1
```
{style="block"}

#### Códigos de respuesta {id="delete-response-codes"}

| Código | Descripción |
|--------|-------------|
| 204 | No Content - Estudiante eliminado correctamente |
| 404 | Not Found - No se encontró el estudiante con el ID especificado |

## Códigos de Estado

| Código | Descripción |
|--------|-------------|
| 200 | OK - La petición se completó exitosamente |
| 201 | Created - Recurso creado exitosamente |
| 204 | No Content - Recurso eliminado exitosamente |
| 400 | Bad Request - Error en la petición |
| 404 | Not Found - Recurso no encontrado |

## Modelo de Datos

### EstudianteDTO

```JSON
{
  "id": 1,
  "nombre": "Estudiante 1",
  "apellido": "App1",
  "email": "estudiante1@gmail.com",
  "fechaNacimiento": "2000-05-15",
  "nroInscripcion": "S001"
}
```
{style="block"}

#### Campos

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único del estudiante |
| nombre | String | Nombre del estudiante |
| apellido | String | Apellido del estudiante |
| email | String | Correo electrónico del estudiante |
| fechaNacimiento | Date | Fecha de nacimiento (formato: YYYY-MM-DD) |
| nroInscripcion | String | Número de inscripción del estudiante |


