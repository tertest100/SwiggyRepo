@Search
Feature: Swiggy website Testing

  @Sanity
  Scenario: The SignUp Functions to Swiggy Users
    Given The user is on the Swiggy Home Page
    When User click on SignUp
    Then User should be go to SignUp Page

  @Sanity
  Scenario Outline: Sign up the user to the Swiggy website
    Given The user is already on the Signup page
    When User enters "<Phone>" "<Name>" "<Email>" and "<Password>"
    And User Click Continue button
    Then User should be able to SignUp

    Examples: 
      | Phone      | Name  | Email         | Password |
      | 1234568591 | Terry | Terry@xyz.com | Test123  | 

  @Sanity
  Scenario: Provide the Kolkatta address
    Given user is already on the Signup Page
    When user click on Kolkatta
    Then user end testing
