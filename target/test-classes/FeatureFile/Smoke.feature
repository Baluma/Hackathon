@smoke
Feature: Smoke Testing

  Scenario: Search for dentist in bangalore location in practo website
    Given user is on the practo site
    When user click Find doctors on the header section
    And user Enter the location and select the location
    And user search for specialization and select
    Then user see the result
    And user print top five doctor details in the console

  Scenario: Validate the Surgeries Page 
    Given user is on the practo page
    When user clicks on surgeris on header section
    And user validate the surgerypage

  Scenario: View the Popular surgeries in the surgeries Page
    Given user is on the practo page
    When user clicks on surgeris on header section
    And user scrolldown the page
    Then user view the popular surgeries

  Scenario: Store and print the Popular surgeries
    Given user is on the practo page
    When user clicks on surgeris on header section
    And user scrolldown the page
    Then user view the popular surgeries
    And store all the surgeries in a List and display  in the console

  Scenario:  Validation with invalid email and number
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    And user enter the invalid details in the schedule demo
    And user verify the schedule demo button is enabled or not

  Scenario: Validation with valid Details
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    Then user enter the Fullvalid Details
    And verify it is enabled or not and click the button
    And print the Thankyou information
