package stepdefinitions;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultPage;

public class BaseSteps {
	protected WebDriver driver = Hooks.getDriver();
	protected HomePage homePage = new HomePage(driver);
	protected SearchResultPage resultPage = new SearchResultPage(driver);
	protected ProductPage productPage = new ProductPage(driver);

}
