package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	private String searchField = "//body[1]/header[1]/div[1]/div[2]/form[1]/input[1]";
	private String nextpage = "//span[@class='andes-pagination__arrow-title']";
	private String deliveryAlert =  "//span[normalize-space()='Más tarde']";
	private String searchButton= "//button[@class='nav-search-btn']";
	
	
			
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void navegateToMercadoLibre() {
		navigateTo("https://mercadolibre.com.ar");
	}
	
	public void clickSearchField() {
		clickElement(searchField);
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
	
	
	public void nextPage() {
		clickElement(nextpage);
	}
	
	
}
