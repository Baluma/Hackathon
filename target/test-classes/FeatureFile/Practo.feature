Feature: Practo

  Scenario: Search Doctors
    Given user is on the practo site
    When user validate the homepage
    And user click Find doctors on the header section
    And user Enter the location and select the location
    And user search for specialization and select
    And user Applying all the filters
    Then user see the result
    And user print top five doctor details in the console

  Scenario: Surgeries
    Given user is on the practo page
    When user clicks on surgeris on header section
    And user validate the surgerypage
    And user scrolldown the page
    Then user view the popular surgeries
    And store all the surgeries in a List and display  in the console

  Scenario: For Corporate
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    And user validate the corporatepage
    And user enter the invalid details in the schedule demo
    And user verify the schedule demo button is enabled or not
    Then user enter the valid details
    And verify it is enabled or not and click the button
    And print the Thankyou information
    And user take screenshot on the Thankyou page
