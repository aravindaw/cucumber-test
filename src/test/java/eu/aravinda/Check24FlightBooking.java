package eu.aravinda;

import eu.aravinda.Documents.LandingDocument;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Check24FlightBooking {

    LandingDocument landingDocument = new LandingDocument();

    @Given("Access check24 page")
    public void access_check24_page() {
        landingDocument.access();
    }

    @When("Accept cookies")
    public void accept_cookies() {
        landingDocument.acceptCookies();
    }

    @When("Navigate to the flight booking page")
    public void navigate_to_the_flight_booking_page() {
        landingDocument.clickNavBarTab("flights");
    }

    @When("Select flight and date")
    public void select_flight_and_date() {
        System.out.println("@@@@@@@@@@@@@@@@@");
    }

    @Then("I see flight confirmation")
    public void i_see_flight_confirmation() {
        System.out.println("@@@@@@@@@@@@@@@@@");
    }
}
