Feature: Login Functionality

@Smoke
  Scenario: User enters Valid Credentials
    Given User Launch DemoWebshop applicationS
    When User enters username and passwordS
    And User clicks on Login buttonS
    Then Home Page is displayedS
    And Close the browserS

