@DragAndDropUI
Feature: Plivo - Test

  Scenario: Using selenium Automate the below process.
    When Go to QuickFuseApps link
    And I Click on Create App
    Then I click on Lets get started
    And I Create a new page with a name
    And I click on Messaging
    And I drag component Send an SMS to the main app page join the line from start acting as connector
    Then I Fill out the Phone Number and text
    And I drag component Send an Email from the left module and join line from Not sent output port
    And I Click on component Basic on left Module and drag Exit App to Sent output port of Sent sms box
    Then I Join all the open output ports of Send an Email to Exit app by dragging