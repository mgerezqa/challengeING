package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import runner.browser_manager.DriverManagerFactory;


public class Hooks {
	private static WebDriver driver;
	private static int numberOfCase = 0;
    private DriverManager driverManager;
//    public static long startTime;
//    public static long endTime;



	@Before
	public void setUp() {

		numberOfCase ++;
		System.out.println("Se está ejecutando el escenario nro: " + numberOfCase);

        // Registro de la hora de inicio
//        startTime = System.currentTimeMillis();

		//Con Controlador
		driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
//		driver.manage().window().maximize();

	}

	@After
	public void tearDown(Scenario scenario) {

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        // Registro de la hora de fin
//        long endTime = System.currentTimeMillis();

        // Cálculo de la duración en milisegundos
//        long duration = endTime - startTime;

		System.out.println("El escenario nro: " + numberOfCase + "se ejecutó correctamente");
//		System.out.println("Inicio de ejecución: " + new java.util.Date(startTime));
//        System.out.println("Fin de ejecución: " + new java.util.Date(endTime));
//        System.out.println("Duración de ejecución: " + duration + " milisegundos");

		driverManager.quitDriver();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
