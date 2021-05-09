package eu.aravinda.pages;

import eu.aravinda.helpes.BaseElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends Page {

    String url = "check24.de";

    @FindBy(xpath = "//div[@class='c24-cookie-consent-notice']")
    @CacheLookup
    private WebElement cookieNotice;

    @FindBy(xpath = "//a[@class='c24-cookie-consent-button'][contains(text(),'Akzeptieren')]")
    @CacheLookup
    private WebElement cookieAcceptBtn;

    public void urlContains() {
        BaseElement.urlContains(url);
    }

    public void waitForCookie() {
        BaseElement.waitForElement(cookieNotice);
    }

    public void acceptCookie() {
        cookieAcceptBtn.click();
    }
}
