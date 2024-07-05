Feature: N11 Web E2E
  Scenario: The user will log into their account and add items to the cart.
    Given The user navigates to the homepage.
    When It is confirmed that the homepage has loaded.
    And The user finds the 'Sign In' button on the homepage and clicks it.
    And It is confirmed that the login page has loaded.
    And The user enters a valid username in the username field on the login page.
    And The user enters a valid password in the password field on the login page.
    And The user clicks on the 'Sign In' button.
    And It is confirmed that the user has successfully logged into their account.
    Then The user clicks on the search box.
    And The user clicks on the search button.
    And The user clicks on the product.
    Then  The product is added to the cart.

