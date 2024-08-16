Feature: Verify the basic authentication

  Background:
    Given the user navigate to home page
@Smoketest
Scenario:
    When the user follow "Basic Auth" link
  Then the user enter "admin" in username field and enter "admin" at password field
    And the user can see "Basic Auth" in the basic auth page
@Smoketest
  Scenario: Verify the digest Authentication
    When the user follow "Digest Authentication" link
    Then the user enter "admin" in username field and enter "admin" at password fields
    And the user see "Congratulations! You must have the proper credentials." in the digest auth page

Scenario: Verify the secure download page
  When the user follow "Secure File Download" link
  Then the user enter "admin" in username field and enter "admin" at password field's
