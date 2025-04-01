# Universidad API

API REST para gestión de estudiantes universitarios.

## Estructura del Proyecto

```
src/main/java/org/bugabuga/univ/
├── controller
│   └── EstudianteController.java
├── dto
│   ├── DocenteDTO.java
│   ├── EstudianteDTO.java
│   └── MateriaDTO.java
├── model
│   ├── Docente.java
│   ├── Estudiante.java
│   ├── Materia.java
│   └── Persona.java
├── repository
│   └── EstudianteRepository.java
├── service
│   ├── IEstudianteService.java
│   └── impl
│       └── EstudianteServiceImpl.java
└── UnivApplication.java
```

## Instalación

```bash
mvn clean install
```

## Ejecución

```bash
mvn spring-boot:run
```

## Documentación

Para ver la documentación completa de los endpoints, consulte:
- [Documentación de la API de Estudiantes](./Writerside/topics/api-documentation.md)

## Tecnologías Utilizadas

- Spring Boot 3.4.4
- Java 21
- Maven
- Lombok

## Repositorio GitHub

[Enlace al repositorio](https://github.com/BugaPunk/API-st.git)
