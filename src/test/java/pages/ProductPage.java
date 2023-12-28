package pages;

import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
	String buttonShopNow = "//span[normalize-space()='Comprar ahora']";
	

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	public String isAvailable(){
		return textFromElement(buttonShopNow);
	}
}
