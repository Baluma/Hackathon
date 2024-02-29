@Regression
Feature: Regression Testing

  Scenario: Validate the practo page
    Given user is on the practo site
    When user validate the homepage

  Scenario: Applying gender filter
    Given user is on the practo site
    When user Enter the location and select the location
    And user search for specialization and select
    And user choose gender in the filters
    Then user print top five doctor details in the console

  Scenario: Applying patientStories
    Given user is on the practo site
    When user Enter the location and select the location
    And user search for specialization and select
    And user choose patientstories in the filter
    Then user print top five doctor details in the console

  Scenario: Applying experience
    Given user is on the practo site
    When user Enter the location and select the location
    And user search for specialization and select
    And user choose experience in the filter
    Then user print top five doctor details in the console

  Scenario: Applying Fees and Availability
    Given user is on the practo site
    When user Enter the location and select the location
    And user search for specialization and select
    And user choose fees and avaliable in the filter
    Then user print top five doctor details in the console

  Scenario: Applying Relevance
    Given user is on the practo site
    When user Enter the location and select the location
    And user search for specialization and select
    And user choose relevance in the filter
    Then user print top five doctor details in the console

  Scenario: Navigate to surgeries page in practo website
    Given user is on the practo page
    When user clicks on surgeris on header section
    And user validate the surgerypage

  Scenario: Print the Popular surgeries
    Given user is on the practo page
    When user clicks on surgeris on header section
    And user scrolldown the page
    And store all the surgeries in a List and display  in the console

  Scenario: Corporate Health and Wellness Form Validation without providing name
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    And user validate the corporatepage
    And user enter Details Without Providing Name
    And user verify the schedule demo button is enabled or not

  Scenario: Corporate Health and Wellness Form Validation without providing Organization name
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    And user enter Details Without providing organization Name
    And user verify the schedule demo button is enabled or not

  Scenario: Corporate Health and Wellness Form Validation wrongly providing Contact Number
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    And user enter Details With wrong contact number
    And user verify the schedule demo button is enabled or not

  Scenario: Corporate Health and Wellness Form Validation wrongly providing Email Id
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    And user enter Details With wrong email id
    And user verify the schedule demo button is enabled or not

  Scenario: Corporate Health and Wellness Form Validation with valid details
    Given user is on the practo website
    When user clicks on corporate on the header section
    And user clicks on Health and Wellness plans
    And user validate the corporatepage
    Then user enter the Fullvalid Details
    And verify it is enabled or not and click the button
    And print the Thankyou information
    And user take screenshot on the Thankyou page
