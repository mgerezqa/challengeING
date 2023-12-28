package stepdefinitions;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MercadoLibreSteps extends BaseSteps {
	

	@Given("El usuario está en la página principal de www.mercadolibre.com.ar")
	public void el_usuario_está_en_la_página_principal_de_www_mercadolibre_com_ar() {
		homePage.navegateToMercadoLibre();
		System.out.println(">>Ingresé a MercadoLibre Argentina");
	}
	
	@When("Busca por palabra clave {string}")
	public void busca_por_palabra_clave_smartphone(String busqueda) {
		homePage.skipDelivery();
		System.out.println (">>Omití la verificación de envío:");
		homePage.acceptCookies();
		System.out.println ("Acepte cookies");
		homePage.searchField(busqueda);
		System.out.println (">>Ingresé la palabra clave:" + busqueda);
		homePage.clickSearch();
		System.out.println (">>Click en botón buscar" );

	}
	
	@And("Navega hacia la segunda página de resultados")
	public void navega_hacia_la_segunda_página_de_resultados() {
		resultPage.goToSecondPage();
		System.out.println (">>Estoy en la segunda página de resultados");
		
	}
	
	@And("Selecciona el tercer ítem de la lista")
	public void selecciona_el_tercer_ítem_de_la_lista() {
		resultPage.clickThirdResult();
		System.out.println (">>Clickee el tercer resultado");
	}
	
	@Then("El ítem está habilitado para comprar")
	public void el_ítem_está_habilitado_para_comprar() {
		System.out.println (">>Estoy en la pagina productos");
		Assert.assertEquals("Comprar ahora",productPage.isAvailable());
		System.out.println(">> El producto se puede comprar");
		

	}


	}
