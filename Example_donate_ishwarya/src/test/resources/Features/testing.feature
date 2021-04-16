Feature: Donate feature

  Scenario Outline: Verify the donate feature
    Given navigate
    And click on user and password
    When enter <user> and <pass>
    And user clicks on login
    And enter user and password manually
    And click on signin manually
    And clcik on donate button
    And fill the information
    And click on donate now
    And Fill card details
    And click on contribute
    Then successful

    Examples: 
      | user      | pass        |
      | candidate | igcandidate |
