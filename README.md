# Ruben.play 🎬

Proyecto personal de página de multimedia desarrollado en Java con Spring Boot.

## Descripción

Ruben.play es una aplicación web de multimedia que permite visualizar y reproducir contenido de video en una interfaz moderna y responsive. Este proyecto está construido con tecnologías Java modernas para proporcionar una plataforma de streaming de videos personalizable.

## Tecnologías Utilizadas

- **Java 11**: Lenguaje de programación principal
- **Spring Boot 2.7.14**: Framework para aplicaciones Java
- **Spring MVC**: Para el manejo de peticiones web
- **Thymeleaf**: Motor de plantillas para las vistas HTML
- **Maven**: Gestión de dependencias y construcción del proyecto
- **HTML5/CSS3**: Para la interfaz de usuario
- **JavaScript**: Para la funcionalidad del reproductor

## Características

- ✅ Interfaz web moderna y responsive
- ✅ Reproductor de video HTML5 integrado
- ✅ Navegación entre diferentes secciones
- ✅ Diseño adaptable para móviles y tablets
- ✅ Múltiples videos con controles personalizados

## Requisitos Previos

- Java 11 o superior
- Maven 3.6 o superior

## Instalación y Ejecución

1. Clonar el repositorio:
```bash
git clone https://github.com/higrub89/Ruben.play.git
cd Ruben.play
```

2. Compilar el proyecto:
```bash
mvn clean install
```

3. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```

4. Abrir el navegador en:
```
http://localhost:8080
```

## Estructura del Proyecto

```
Ruben.play/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ruben/multimedia/
│   │   │       ├── MultimediaApplication.java
│   │   │       ├── controller/
│   │   │       │   └── MultimediaController.java
│   │   │       └── model/
│   │   │           └── MediaItem.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── style.css
│   │       │   └── js/
│   │       │       └── player.js
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   └── videos.html
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/ruben/multimedia/
│               ├── MultimediaApplicationTests.java
│               └── controller/
│                   └── MultimediaControllerTests.java
├── pom.xml
└── README.md
```

## Ejecutar Tests

```bash
mvn test
```

## Personalización

Para agregar tus propios videos, edita el método `getSampleVideos()` en `MultimediaController.java` y añade nuevos objetos `MediaItem` con las URLs de tus videos.

## Autor

Ruben - Proyecto personal de página de videos

## Licencia

Este es un proyecto personal de código abierto.
