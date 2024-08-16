Feature:

  Background:
    Given the user navigate to home page
@lucky
    Scenario: Verify drag and drop
      When the user follow "Drag and Drop" link
    And the user drag columnB to columnA and drop
      Then the user drag columnA to column B
@Smoketest
      Scenario: Verify the context menu
        When the user follow "Context Menu" link
        And the user right click on the page
    Then the user can see "You selected a context menu" in the context menu page
    And the user click OK of the alert popup
