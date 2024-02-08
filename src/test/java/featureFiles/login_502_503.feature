Feature: Login Function
  As a user I want to be able to login
  with my valid username and password

  Scenario: Login with the valid username and password
    Given Navigate to the website
    And Enter "dyg21kk@gmail.com" and "olive1234"
    When Click on Login Button
    Then User should login successfully

    @RegressionTest
    Scenario Outline: Login with invalid username and password
      Given Navigate to the website
      And Enter "<username>" and "<password>"
      When Click on Login Button
      Then User should get an error

      Examples:
  |username | password |
  |dyg21kk@gmail.com | oliveee|
  |dyg21kk@gmail.com | ooo111222|
  |email98765@gmail.com|olive1234|
  |dyg21kk@gmail.com | |
  | | olive1234