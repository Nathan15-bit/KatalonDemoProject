Feature: Test login functionality

  @smoke
  Scenario Outline: Check login is successful with valid credentials
    Given User in login page
    When User input <username> & <password>
    And Clicks on button login
    Then User redirected to homepage

    @valid
    Examples: 
      | username | password                 |
      | Admin    | hUKwJTbofgPU9eVlw/CnDQ== |

    @invalid
    Examples: 
      | username | password                 |
      | Test0000 | 409CYFkz9v/8iWRY40PXdQ== |
