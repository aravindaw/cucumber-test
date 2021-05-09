package eu.aravinda.Documents;

import eu.aravinda.pages.LandingPage;

public class LandingDocument extends LandingPage{

    public void access() {
        urlContains();
    }

    public void acceptCookies(){
        waitForCookie();
        acceptCookie();
    }
}
