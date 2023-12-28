package stepdefinitions;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MercadoLibreSteps extends BaseSteps {
	

	@Given("El usuario está en la página principal de www.mercadolibre.com.ar")
	public void el_usuario_está_en_la_página_principal_de_www_mercadolibre_com_ar() {
		home.navegateToMercadoLibre();
		System.out.println(">>Ingresé a MercadoLibre Argentina");
	}
	
	@When("Busca por palabra clave {string}")
	public void busca_por_palabra_clave_smartphone(String busqueda) {
		home.skipDelivery();
		System.out.println (">>Omití la verificación de envío:");
		home.searchField(busqueda);
		System.out.println (">>Ingresé la palabra clave:" + busqueda);
		home.clickSearch();
	}
	
	@When("Navega hacia la segunda página de resultados")
	public void navega_hacia_la_segunda_página_de_resultados() {
		home.nextPage();
		System.out.println (">>Estoy en la segunda página de resultados");
		
	}
	
	@When("Selecciona el tercer ítem de la lista")
	public void selecciona_el_tercer_ítem_de_la_lista() {
		

	}
	
	@Then("El ítem está habilitado para comprar")
	public void el_ítem_está_habilitado_para_comprar() {

	}


	}
