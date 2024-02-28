@Regression
Feature: Practo Page

  Scenario: Find Doctors
    Given user is on the practo site
    When user click Find doctors on the header section
    
  Scenario: Select CitySpecialization
    Given user is on the practo site
    When user Enter the location and select the location
    And user search for specialization and select
    
  Scenario: Applying Filters
    Given user is on the practo site
    When user choose gender in the filters
    And user choose patientstories in the filter
    And user choose experience in the filter
    And user choose fees and avaliable in the filter
    And user choose relevance in the filter 
    Then user see the result
    
  Scenario: Print Top Five Doctors
    Given user is on the practo site
    Then user print top five doctor details in the console
    
  Scenario: Surgeries
    Given user is on the practo page 
    When user clicks on surgeris on header section
    
  Scenario: Print Popular Surgeries
    Given user is on the practo page 
    When user scrolldown the page
    Then user view the popular surgeries
    And store all the surgeries in a List and display  in the console
    
  Scenario: For Corporate
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    
  Scenario: Click to proceed
    Given user is on the practo website
    When user enter the invalid details in the schedule demo
    And user verify the schedule demo button is enabled or not
    Then user enter the valid details
    And verify it is enabled or not and click the button
    
  Scenario: Print Final Message
    Given user is on the practo website
    Then print the Thankyou information
    And user take screenshot on the Thankyou page
    