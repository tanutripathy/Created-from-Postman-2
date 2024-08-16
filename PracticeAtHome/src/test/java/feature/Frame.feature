Feature: 
  Background:
    Given the user navigate to home page

    Scenario: Verify the iframe
      When the user follow "Frames" link
      Then the user click on iframe
      And the user can see "An iFrame containing the TinyMCE WYSIWYG Editor" in the page
      Then the user enter "Name:Tanu Tripathy"in the box

  Scenario: Verify the input page
    When the user follow "Inputs" link
    Then the user enter "99375889"in text box

