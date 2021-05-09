package eu.aravinda;

import eu.aravinda.helpes.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
    @Before
    public static void startDriver() {
        Driver.chromeDriver();
    }

    @After
    public static void quiteDriver() {
        Driver.quite();
    }
}
