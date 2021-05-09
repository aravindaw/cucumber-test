package eu.aravinda;

import eu.aravinda.Documents.LandingDocument;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Check24FlightBooking {

    @Given("Access check24 page")
    public void access_check24_page() {
        LandingDocument landingDocument = new LandingDocument();
        landingDocument.access();
        landingDocument.acceptCookies();
    }

    @When("Accept cookies")
    public void accept_cookies() {
        System.out.println("@@@@@@@@@@@@@@@@@");
    }

    @When("Navigate to the flight booking page")
    public void navigate_to_the_flight_booking_page() {
        System.out.println("@@@@@@@@@@@@@@@@@");
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
