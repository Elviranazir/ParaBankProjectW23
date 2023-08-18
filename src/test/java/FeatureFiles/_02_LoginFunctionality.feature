Feature: Login Functionality
  As a user I want to be able to login with valid credentials


  Scenario Outline: Login with valid username and invalid password
    Given Navigate to Para Bank
    And Enter valid "<username>"
    And Enter invalid "<password>"
    And Click on LoginButton
#    Then User should not be login successfully
    Examples:
      | username         | password |
      | mary1.smith@mail | 0000     |
      | mary1.@mail      | 123456   |
      | mary1.@mail      | 000      |
      |                  | 123456   |
      | mary1.smith@mail |          |
      |                  |          |
      | mary1.smith@mail | 123456   |



