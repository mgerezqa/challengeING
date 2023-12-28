package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	private String searchField = "//input[@id='cb1-edit']";
			

	private String deliveryAlert =  "//span[normalize-space()='Más tarde']";
	private String searchButton= "//button[@class='nav-search-btn']";
	private String cookieBanner = "//div[@class='cookie-consent-banner-opt-out__container']";
	private String cookieAcceptButton = "//button[normalize-space()='Aceptar cookies']";
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	

	public void navegateToMercadoLibre() {
		navigateTo("https://mercadolibre.com.ar");
	}
	
	public void clickSearchField() {
		clickElement(searchField);
	}
	
	public void acceptCookies() {
		   if (elementIsDisplayed(cookieBanner)) {
	            // Hacer clic en el botón para aceptar las cookies
			   clickElement(cookieAcceptButton);
//	            WebElement acceptButton = cookieBanner.findElement(By.xpath("//button[@id='accept-cookies-button']"));
//	            acceptButton.click();
	        }
	}
	public void skipDelivery() {
		clickElement(deliveryAlert);
	}
	
	public void searchField(String palabraClave) {
		write(searchField,palabraClave);
		
	}
	
	public void clickSearch() {
		clickElement(searchButton);
	}
	

	
	
}
