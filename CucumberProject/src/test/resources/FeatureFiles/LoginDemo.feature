Feature: Login Functionality

@Smoke
  Scenario: User enters Valid Credentials
    Given User Launch DemoWebshop application
    When User enters username and password
    And User clicks on Login button
    Then Home Page is displayed
    And Close the browser

@Sanity
  Scenario: User enters Invalid Credentials
    Given User Launch DemoWebshop application
    When User enters Invalid username and password
    And User clicks on Login button
    Then Home Page is displayed
    And Close the browser 

@Smoke
  Scenario Outline: Verify valid Credentials
    Given User Launch DemoWebshop application
    When User enters Valid "<username>" and "<password>"
    And User clicks on Login button
    Then Home Page is displayed
    And Close the browser

    Examples: 
      | username  | password |
      | hkc@d.com | test123  |
      | asdfa..   | test123  |