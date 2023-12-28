package stepdefinitions;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MercadoLibreSteps extends BaseSteps {
	

	@Given("el usuario está en la página principal de www.mercadolibre.com.ar")
	public void el_usuario_está_en_la_página_principal_de_www_mercadolibre_com_ar() {
		home.navegateToMercadoLibre();
	}
	
	@When("Busca por “Smartphone”")
	public void busca_por_smartphone() {

	}
	
	@When("Navega hacia la segunda página de resultados")
	public void navega_hacia_la_segunda_página_de_resultados() {

	}
	
	@When("Selecciona el tercer ítem de la lista")
	public void selecciona_el_tercer_ítem_de_la_lista() {

	}
	
	@Then("El ítem está habilitado para comprar")
	public void el_ítem_está_habilitado_para_comprar() {

	}


	}
