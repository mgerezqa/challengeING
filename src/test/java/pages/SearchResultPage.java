package pages;

import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {
	private String nextpage = "//a[@title='Siguiente']";
//	private String listResult = "ui-search-layout"; //className
	private String thirdResult = "/html[1]/body[1]/main[1]/div[1]/div[2]/section[1]/ol[1]/li[3]/div[1]/div[1]/div[2]/div[1]/a[1]/h2[1]"; //usé path absoluto al tercer resultado
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * Next Page: Primera versión
	 */
	public void nextPage() {
		clickElement(nextpage);
	}
	
	/*
	 * Next Page: Segunda versión
	 */
	public void goToSecondPage() {
		goToLinkText("Siguiente");
	}
	/*
	 * clickThirdResult: Ubico el tercer elemento de la búsqueda
	 */
	public void clickThirdResult() {
		clickElement(thirdResult);
//		selectNthElementFromList(listResult,2); //envío la lista por xpath y clickeo el tercer elemento
	}
}
