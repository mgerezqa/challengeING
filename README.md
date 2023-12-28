# Challenge

## Detalles

Esta tarea puede resolverse en cualquier lenguaje de programación orientado a objetos,
preferentemente C#.
Utilizar Selenium como herramienta de automatización. Preferentemente utilizar XPath o CssSelector
como localizadores de elementos.
Resolver utilizando todas las buenas prácticas y patrones de diseño que considere relevantes para la
tarea.
Evitar el uso de herramientas de automatización low code.<br>

### Objetivo:
**Como** un cliente, cuando busco por Smartphone en el buscador de la plataforma de Mercado Libre <br>
**quiero** saber si la tercera opción en la segunda página de resultados está disponible <br> 
**para** comprar  (puede ser añadido al carrito).<br>

### Plantilla de ejemplo: 
Acción:<br>
**GIVEN** el usuario está en la página principal de www.mercadolibre.com.ar <br> 
**WHEN** Busca por “Smartphone” <br>
**AND** Navega hacia la segunda página de resultados <br>
**AND** Selecciona el tercer ítem de la lista <br>
Resultado esperado: <br>
**THEN** El ítem está habilitado para comprar <br> 

<hr>

# Solución

Para resolver el desafío se utilizó en el proyecto el lenguaje de programación **JAVA** y las librerías **Selenium** y **Cucumber**. <br>
Se implementó el patrón de diseño Page Object Model , se estructuró el desafío de la siguiente manera:

### 
- src/test/java
  - features
    - search.feature
  - pages
    - HomePage.java
    - SearchResultPage.java
    - ProductPage.java
  - runner
    - TestRummer.java
    - browser_manager
        - ChromeDriverManager.java
        - DriverManager.java
        - DriverManagerFactory.java
        - DriverType.java
        - FirexFoxDriverMamager.java
  - stepsdefimitions
    - MercadoLibreSteps.java
    - Hooks.java
    - BaseSteps.java
- target
  - CucumberReport.html
- pom.xml

###

### **Detalle**: 

_**Package features**_:
- **Search.feature:** Se describe la funcionalidad de busqueda y sus condiciones.

_**Package stepdefinitions**_:
- **MercoLibreSteps.java:** Representa el escenario de prueba escrito en lenguaje **Gherkin**.
  
_**Package pages**_:
- **HomePage.java:** Representa la página de inicio y tiene los métodos necesarios para : realizar búsquedas,confirmar la búsqueda, omitir envío a domicilio y aceptar cookies. 
- **SearchResultPage.java:** Representa la página de resultados de búsqueda y tiene métodos para interactuar con los resultados.
- **ProductPage.java**: Representa la página del producto y tiene métodos para verificar la disponibilidad y añadir al carrito.

_**Package target**_:
- **CucumberReport.html:** Representa el informe de los resultados ejecutados. 

## Ejecución del Script

https://youtu.be/1YyPDhZMucI?si=6MSgzGy_LyIvJE0O

## Reporte Generado
Se adjunta una captura del informe generado:

![reporteIngematica](https://github.com/mgerezqa/challengeING/assets/54424951/2f70713a-a9f7-4430-942b-b0790ee5b7eb)
