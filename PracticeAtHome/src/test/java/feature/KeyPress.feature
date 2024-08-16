Feature: 
  Background:
    Given the user navigate to home page
@Smoketest
    Scenario: Verify the KeyPress page
      When the user follow "Key Presses" link
      Then the user can see "Key Presses" in the page
      And the user click on control key
  And the user can see "You entered: CONTROL" in the page
  Then the user click on backsapce key
  And the user can see "You entered: BACK_SPACE" in the page
      Then the user click on escape key
      And the user can see "You entered: ESCAPE" in the page



    Scenario: Verify MultipleWindows page
      When the user follow "Multiple Windows" link
      Then the user click on click here on the page
    And the user press crtl+a to select all