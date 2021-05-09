package eu.aravinda.pages;

import eu.aravinda.helpes.Driver;
import org.openqa.selenium.support.PageFactory;

public class Page extends Driver{
    public Page() {
        PageFactory.initElements(driver, this);
    }
}
