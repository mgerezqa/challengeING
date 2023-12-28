package stepdefinitions;

import org.openqa.selenium.WebDriver;

import pages.HomePage;

public class BaseSteps {
	protected WebDriver driver = Hooks.getDriver();
	protected HomePage home = new HomePage(driver);

	

}
