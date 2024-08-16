Feature: 
  Background:
    Given the user navigate to home page
  @tanu's
    Scenario: Verify the Entry ad
      When the user follow "Entry Ad" link
      And the user click on close add
@lucky
Scenario:
  When the user follow "Exit Intent" link
  And the user move the cursor out of view pane
  Then the user click on close button


Scenario: Verify the Jquery menu
  When the user follow "JQuery UI Menus" link
  Then the user click on enabled button
  And the user can see "Downloads" option on the page
 Then user click on JQuery UI option
    And the user can see "JQuery UI" in the page



