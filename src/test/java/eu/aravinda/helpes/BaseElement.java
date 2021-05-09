package eu.aravinda.helpes;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseElement{

    static int timeOut = 5;

    public static void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void isVisible(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

    public static String urlContains(String text) {
        String currentUrl = Driver.driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(text));
        return currentUrl;
    }

    public static void seeText(String text) {
        String source = Driver.driver.getPageSource();
        Assert.assertTrue(source.contains(text));
    }
}
