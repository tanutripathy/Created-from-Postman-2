Feature:
  Background:
    Given the user navigate to home page

    Scenario:
      When the user follow "Notification Messages" link
      Then the user can see "Action successful" in the page
    And the user click on close notification
  @APITest
  Scenario:Verify the slider
    When the user follow "Horizontal Slider" link
    Then the user drag the slider