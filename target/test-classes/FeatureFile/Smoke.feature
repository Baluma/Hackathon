@smoke
Feature: Practo website

  Scenario: Validate Homepage
    Given user is on the practo site
    When user validate the homepage

  Scenario: Click Find Doctors
    Given user is on the practo site
    When user click Find doctors on the header section

  Scenario: Enter Location
    Given user is on the practo site
    When user Enter the location and select the location

  Scenario: Enter Specialization
    Given user is on the practo site
    When user search for specialization and select

  Scenario: Select Gender
    Given user is on the practo site
    When user choose gender in the filters

  Scenario: Select PatientStories
    Given user is on the practo site
    When user choose patientstories in the filter

  Scenario: Select Experience
    Given user is on the practo site
    When user choose experience in the filter

  Scenario: Select Fees and Availability
    Given user is on the practo site
    When user choose fees and avaliable in the filter

  Scenario: Select Relevance
    Given user is on the practo site
    When user choose relevance in the filter

  Scenario: Filter Result
    Given user is on the practo site
    Then user see the result

  Scenario: Click Surgeries
    Given user is on the practo page
    When user clicks on surgeris on header section

  Scenario: Validate SurgeryPage
    Given user is on the practo page
    When user validate the surgerypage

  Scenario: Scrolldown the Page
    Given user is on the practo site
    When user scrolldown the page

  Scenario: Popular Surgeries
    Given user is on the practo site
    Then user view the popular surgeries

  Scenario: Click Corporate
    Given user is on the practo website
    When user clicks on corporate on the header section

  Scenario: Click Health and Wellness Plans
    Given user is on the practo website
    When user clicks on Health and Wellness plans

  Scenario: Validate CorporatePage
    Given user is on the practo website
    When user validate the corporatepage

  Scenario: Invalid Details
    Given user is on the practo website
    When user enter the invalid details in the schedule demo

  Scenario: Verification
    Given user is on the practo website
    When user verify the schedule demo button is enabled or not

  Scenario: Valid Details
    Given user is on the practo website
    Then user enter the valid details

  Scenario: Verify and click
    Given user is on the practo website
    Then verify it is enabled or not and click the button
