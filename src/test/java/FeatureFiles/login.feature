Feature: login

  @loginPlaceholder
  Scenario: verify user can login with valid credential
    Given I am at TalentTek login page
    And I input valid ID and password
    And I click login

    @loginWithInvalidPassword
    Scenario: verify user can login with valid ID and invalid password
      Given I am at TalentTek login page
      And I input valid ID and invalid password
      And I click login

      @loginWithInvalidIDValidPassword

      Scenario: verify user can login with Invalid ID and valid password
        Given I am at TalentTek login page
        And I input Invalid ID and valid password
        And I click login


