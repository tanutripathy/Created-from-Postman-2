Feature:
  Background:
    Given the user navigate to home page

    Scenario:
      When the user follow "File Download" link
      Then the user click on photo.JPG in the page
  @Smoketest
  Scenario: 
    When the user follow "File Upload" link
    Then the user select he file to  upload
    And the user click on upload button
    Then the user can see "File Uploaded!" in the page


#  name: user1
 # View profile

