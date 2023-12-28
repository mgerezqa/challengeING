package runner;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import utilities.LogHelper;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepdefinitions",
		plugin = {"json:test/report/cucumber_report.json"}

		)

public class TestRunner {
    private static final Logger LOGGER = LogHelper.getLogger(TestRunner.class);
	
	@AfterClass
	public static void cleanDriver() throws InterruptedException {
		
        try {
            LOGGER.log(Level.INFO, "Generating report...");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            LOGGER.log(Level.INFO, "Report successfully generated!");

        }catch (Exception ex){
            LOGGER.log(Level.WARNING, "The report could not be generated.");
            ex.printStackTrace();
        }
        Thread.sleep(5*1000);//espero 5 segundos antes de cerrar la pagina
	
	}

}
