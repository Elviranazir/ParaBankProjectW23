Feature: Bill Pay Functionality
  As a user I want to be able to pay bill


  Scenario: Pay different bills
    Given Navigate to Para Bank
    And Login with valid username and valid password
    And Click on Pay Bill Button
    When fill the form with valid data
      | Electricity Bill |
      | Snow street 12   |
      | NewYork          |
      | NeWYork          |
      | 11111            |
      | 123457878887     |
      | 555666444        |
      | 555666444        |
      | $85              |
    Then Click on send payment button
