Feature: Feature to test Search for any location using search bar

  Background: User is serch screen
    Given User is in trivago magazine home page
    And Clicks on search icon
    Then user is taken to search page.

  Scenario Outline: Check search functionality os working fine with valid keyword
    When User enters <locationname> in search field
    And Click on enter key
    Then Proper search result for corresponding location is displayed

    Examples: 
      | locationname |
      | TEXAS        |
      | FLORIDA      |

  Scenario Outline: Check the search functionality using non matching keywords
    When Non matching keyword enters <Invalidlocationname>   in search field
    And User Clicks on enter key
    Then No results are displayed for the corresponding location

    Examples: 
      | Invalidlocationname |
      | Kerala              |
      | Kannur              |

  Scenario: Check the functionality of all destination tab under search filed
    When user clicks on All destination tab
    Then Proper result for all destinations is displayed
