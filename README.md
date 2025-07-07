# Universo Marvel Comics

Una aplicación para Android que te permite explorar el vasto universo de Marvel Comics. Descubre información sobre tus personajes, cómics y series favoritas.

## Descripción

Esta aplicación se conecta a la API oficial de Marvel para obtener datos actualizados sobre el contenido de Marvel. Este proyecto fue realizado para la postulación a la SCESI 2025.

## Características Principales

*   Listado de personajes, cómics y series.
*   Búsqueda de contenido específico.
*   Visualización de detalles, incluyendo descripciones, imágenes y apariciones.

## Tecnologías Utilizadas

*   **Kotlin:** Lenguaje de programación principal.
*   **Jetpack Compose:** Para la construcción de la interfaz de usuario.
*   **ViewModel:** Para la gestión de datos de la interfaz de usuario.
*   **Navigation Compose:** Para la navegación entre las diferentes pantallas de la aplicación.
*   **Retrofit:** Para realizar las peticiones a la API de Marvel.
*   **Coil:** Para la carga y visualización de imágenes.
*   **JUnit y Espresso:** Para las pruebas unitarias y de instrumentación.

## Estructura del Proyecto

El proyecto sigue una arquitectura MVVM (Model-View-ViewModel) y está organizado en los siguientes paquetes:

*   **data:** Contiene los modelos de datos, las fuentes de datos (API de Marvel) y los repositorios.
*   **ui:** Contiene las vistas (Composable functions), los ViewModels y la navegación de la aplicación.

## Futuras Implementaciones

- [ ] Vista de detalle para las series.
- [ ] Sección de creadores y eventos.
- [ ] Soporte para offline caching utilizando **Room**.
- [ ] Implementar tests unitarios y de instrumentación.
- [ ] Integración con **Firebase** para funcionalidades adicionales (ej. autenticación, notificaciones push).

## Requisitos Previos

Para compilar y ejecutar este proyecto, necesitarás:

*   Android Studio
*   Una clave de API de Marvel. Puedes obtener una de forma gratuita en el [Portal de Desarrolladores de Marvel](https://developer.marvel.com/).

## Configuración del Proyecto

1.  **Clona este repositorio en tu máquina local.**

2.  **Configura tus claves de API:**
    *   En la raíz del proyecto, crea un archivo llamado `local.properties`.
    *   Copia el contenido del archivo `local.properties.example` y pégalo en tu nuevo archivo `local.properties`.
    *   Reemplaza los valores de `MARVEL_PUBLIC_KEY` y `MARVEL_PRIVATE_KEY` con tus propias claves obtenidas del portal de Marvel.

    ```properties
    sdk.dir=/home/user/Android/Sdk
    MARVEL_PUBLIC_KEY=TU_CLAVE_PÚBLICA_AQUÍ
    MARVEL_PRIVATE_KEY=TU_CLAVE_PRIVADA_AQUÍ
    ```

## Cómo Compilar y Ejecutar

1.  Abre el proyecto con Android Studio.
2.  Deja que Gradle sincronice todas las dependencias.
3.  Selecciona un emulador o un dispositivo físico.
4.  Haz clic en el botón "Run" para compilar y ejecutar la aplicación.
