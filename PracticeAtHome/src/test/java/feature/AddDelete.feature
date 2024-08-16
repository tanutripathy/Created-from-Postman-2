Feature:
  Background:
    Given the user navigate to home page
    @tanu
    Scenario: Verify add and delete element
      When the user follow "Add/Remove Elements" link
      Then the user click on add element
      And the user see "Delete" option on the page
      Then the user click on delete element
      