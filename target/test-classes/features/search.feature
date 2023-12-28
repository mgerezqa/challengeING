#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@MercadoLibre
Feature: Search functionality
  **Como** un cliente, cuando busco por Smartphone en el buscador de la plataforma de Mercado Libre
	**quiero** saber si la tercera opción en la segunda página de resultados está disponible **para** comprar
	(puede ser añadido al carrito).

  @Cart
  Scenario: Buscar tercera opción en mercadolibre
  Given El usuario está en la página principal de www.mercadolibre.com.ar
	When Busca por palabra clave "Smartphone"
	And Navega hacia la segunda página de resultados
	And Selecciona el tercer ítem de la lista
	Then El ítem está habilitado para comprar
	

  