# API de Estudiantes

Esta API proporciona endpoints para gestionar estudiantes en el sistema universitario.

## URL Base
```http
http://localhost:8080
```

## Endpoints

### Obtener todos los estudiantes

Retorna una lista de todos los estudiantes registrados en el sistema.

#### Request
```http
GET http://localhost:8080/api/estudiantes
```

#### Curl
```bash
curl -X GET http://localhost:8080/api/estudiantes
```

#### Respuesta

```json
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

#### Campos de respuesta

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único del estudiante |
| nombre | String | Nombre del estudiante |
| apellido | String | Apellido del estudiante |
| email | String | Correo electrónico del estudiante |
| fechaNacimiento | Date | Fecha de nacimiento (formato: YYYY-MM-DD) |
| nroInscripcion | String | Número de inscripción del estudiante |

## Modelo de datos

### EstudianteDTO

Este es el objeto de transferencia de datos que se utiliza en las respuestas de la API.

```json
{
  "id": 1,
  "nombre": "Estudiante 1",
  "apellido": "App1",
  "email": "estudiante1@gmail.com",
  "fechaNacimiento": "2000-05-15",
  "nroInscripcion": "S001"
}
```