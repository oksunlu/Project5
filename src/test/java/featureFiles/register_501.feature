Feature: Registration Function
  As a user I want to register successfully

  Scenario: Register with a valid email address and a password
    Given Navigate to the website
    And Enter "Olive", "Tree", "dyg21kk@gmail.com", "olive1234", "olive1234"
    When Click on Register Button
    Then Account should be created successfully


