Feature: Feature to test contact form functionality.

  Background: User is in Contact form page
    Given User is in Home page
    And User navigates to contact form page
    Then user is in contact form page

  Scenario Outline: Check the functionality of contact form with valid credentials
    When User enters  <Messagecontent>,<Fullname> and <email>
    And User clicks on checkbox
    And Click on submit button
    Then Contact form submitted successfully.

    Examples: 
      | Messagecontent                                       | Fullname | email           |
      | Please send me the details of new locations to visit | Haran    | hrzei@gmail.com |

  Scenario: Check proper error message is displayed while submitting form with blank fields
    When User clicks on submit button
    Then Proper error message is displayed

  Scenario Outline: Check the functionality of Checkbox
    When User enters  <Messagecontent>,<Fullname> and <email>
    And click on submit button without marking checkbox
    Then Proper error message is displayed in order to tick the checkbox

    Examples: 
      | Messagecontent                                            | Fullname | email          |
      | Plese help me to get the details of best choice to travel | Hima     | hima@gmail.com |

  Scenario Outline: Check if email address is properly validated
    When User entering <Messagecontents>,<name> and <emailfield>
    Then Proper error message for email validation is displayed

    Examples: 
      | Messagecontents | name | emailfield |
      | agrvc           | Fida | fidan@      |
