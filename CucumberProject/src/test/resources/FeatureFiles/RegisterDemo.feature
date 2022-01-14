Feature: User Registration

  Scenario: User registers himself into application
    Given User has launched application
    When User clicks on Register button on first page
    Then User enters his details
      | field           | value            |
      | Gender          | Male             |
      | Firstname       | Aakash           |
      | Lastname        | Thapliyal        |
      | Email           | thapli@gmail.com |
      | Password        | Yes1234          |
      | Confirmpassword | Yes1234          |
    And User clicks on Register button
    And User closes the browser
