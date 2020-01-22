Feature: login functionality

  Scenario: Login successfully with valid credential
    Given User navigate to website www.bmail.com
    When  User enter username "Rajpatel"
    And   User enter password "Test123"
    And   user click on Sign In
    Then  User should be login successfully
    And   welcome message should be displayed

  Scenario:  Not able to login with invalid credential
    Given User navigate to website www.bmail.com
    When  User enter username "Rajpatel"
    And   User enter invalid password "Abc123"
    And   user click on Sign In
    Then  User should not be able to login
    And   Error message should be displayed

  Scenario:  Not able to login with invalid credential
    Given User navigate to website www.bmail.com
    When  User enter username "Rajpatel"
    But   Keep password field blank
    And   user click on Sign In
    Then  User should not be able to login
    And   Error message should be displayed

  Scenario:  Not able to login with invalid credential
    Given User navigate to website www.bmail.com
    When  User enter invalid username "Ashpatel"
    And   User enter password "Test123"
    And   user click on Sign In
    Then  User should not be able to login
    And   Error message should be displayed

  Scenario:  Not able to login with invalid credential
    Given User navigate to website www.bmail.com
    When  User enter invalid username "Ashpatel"
    And   User enter invalid password Abc123"
    And   user click on Sign In
    Then  User should not be able to login
    And   Error message should be displayed

  Scenario:  Not able to login with invalid credential
    Given User navigate to website www.bmail.com
    When  User enter invalid username "Ashpatel"
    But   Keep password field blank
    And   user click on Sign In
    Then  User should not be able to login
    And   Error message should be displayed

  Scenario:  Not able to login with invalid credential
    Given User navigate to website www.bmail.com
    When  User keep username field blank
    And   User enter password "Test123"
    And   user click on Sign In
    Then  User should not be able to login
    And   Error message should be displayed

  Scenario:  Not able to login with invalid credential
    Given User navigate to website www.bmail.com
    When  User keep username field blank
    And   User enter invalid password "Abc123"
    And   user click on Sign In
    Then  User should not be able to login
    And   Error message should be displayed

  Scenario:  Not able to login with invalid credential
    Given User navigate to website www.bmail.com
    When  User keep username field blank
    And   User keep password field blank
    And   user click on Sign In
    Then  User should not be able to login
    And   Error message should be displayed


