package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void navegateToMercadoLibre() {
		navigateTo("https://mercadolibre.com.ar");
	}
}
