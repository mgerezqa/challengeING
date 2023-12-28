#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Search
  **Como** un cliente, cuando busco por Smartphone en el buscador de la plataforma de Mercado Libre
	**quiero** saber si la tercera opción en la segunda página de resultados está disponible **para** comprar
	(puede ser añadido al carrito).

  @tag1
  Scenario: Buscar tercera opción en mercadolibre
  Given el usuario está en la página principal de www.mercadolibre.com.ar
	When Busca por “Smartphone”
	And Navega hacia la segunda página de resultados
	And Selecciona el tercer ítem de la lista
	Then El ítem está habilitado para comprar

  