package eu.aravinda.helpes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;

    public static WebDriver chromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/aravinda/Installs/chromedriver");
        String URL = "https://www.check24.de/";
        driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    public static WebDriver quite() {
        driver.quit();
        return driver;
    }
}
