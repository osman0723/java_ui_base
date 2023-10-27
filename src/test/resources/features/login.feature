Feature: login page

  @smoke
  Scenario: login saucedome web page
    Given visit homepage
    When fill_in username
    And fill_in password
    And click login button
    Then verify inventory page
