Feature: Signup

  @loginPlaceHolder
  Scenario: verify place holder for userName and Password
    Given I am at TalentTek
    And I verify there is placeHolder for userName and Password
    And I verify email should be unit