Feature: Check24 flight booking
  Book flight in check24 flight booking page

  Scenario: Book flight
    Given Access check24 page
    When Accept cookies
    And Navigate to the flight booking page
    And Select flight and date
    Then I see flight confirmation