Feature: Feature to subscribe to a Newsletter

  Background: User is in Subscribe Newsletterform
    Given User opens Home page
    And Navigates to subscriber Newsletter form

  Scenario Outline: Test to check email validation
  
    When The User enters <Invalidemail>
    Then Proper validation message is displayed there

    Examples: 
      | Invalidemail |
      | nuy6a2@        |

  Scenario Outline: Test to subscribe Newsletter with valid email
    
    When Passs valid email <Validemail>
    And Click on Inspire Me button
    Then User is Subscribed to the  Newsletter successfully

    Examples: 
      | Validemail        |
      | bilg@gmail.com |

