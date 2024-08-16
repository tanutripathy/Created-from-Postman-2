Feature:
  Background:
    Given the user navigate to home page

  Scenario:
    When the user follow "Hovers" link
    Then the user move cursor towards the first image
    And the user can see "name: user1" in the page

 Scenario: Verify the infinite scroll
   When the user follow "Infinite Scroll" link
   Then the user scroll down on the page