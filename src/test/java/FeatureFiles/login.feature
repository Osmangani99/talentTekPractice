Feature: login

  @loginPlaceholder
  Scenario: verify user can login with valid credential
    Given I am at TalentTek login page
    And I input valid ID and password
    And I click login

    Scenario: verify user password accept integer value
      Given I am at TalentTek login page


