

Feature: Login Feature
  

  Scenario Outline: Validate user can do login with valid credentials
    Given user launch the browser and enters the url
    And user enters "<username>" and "<password>"
    And user clicks on login button
    Then user lands on home page and validate the homepage title
 
    Examples: 
      | username  | password |
      | test18@gmail.com |     test@123| 
      | test27@gmail.com |     test@123 | 
