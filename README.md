# Challenge

## Detalles

Esta tarea puede resolverse en cualquier lenguaje de programación orientado a objetos,
preferentemente C#.
Utilizar Selenium como herramienta de automatización. Preferentemente utilizar XPath o CssSelector
como localizadores de elementos.
Resolver utilizando todas las buenas prácticas y patrones de diseño que considere relevantes para la
tarea.
Evitar el uso de herramientas de automatización low code.

### Objetivo:
**Como** un cliente, **cuando** busco por Smartphone en el buscador de la plataforma de Mercado Libre
**quiero** saber si la tercera opción en la segunda página de resultados está disponible **para** comprar
(puede ser añadido al carrito).

Plantilla de ejemplo:
Acción:
**GIVEN** el usuario está en la página principal de www.mercadolibre.com.ar
**WHEN** Busca por “Smartphone”
**AND** Navega hacia la segunda página de resultados
**AND** Selecciona el tercer ítem de la lista
Resultado esperado:
**THEN** El ítem está habilitado para comprar



## Solución

Se implementó el patrón de diseño Page Object Model , se estructuró el desafío de la siguiente manera:





Donde: 

- **HomePage.java:** Representa la página de inicio y tiene los métodos necesarios para : realizar búsquedas,confirmar la búsqueda, omitir envío y aceptar cookies. 
- **SearchResultPage.java:** Representa la página de resultados de búsqueda y tiene métodos para interactuar con los resultados.
- **ProductPage.java**: Representa la página del producto y tiene métodos para verificar la disponibilidad y añadir al carrito



## Ejecución del Script



https://youtu.be/1YyPDhZMucI?si=6MSgzGy_LyIvJE0O

## Reporte Generado



![image-20231228173421809](C:\Users\Martin\AppData\Roaming\Typora\typora-user-images\image-20231228173421809.png)