Feature: Check OrangeHRM home page functionality

  # Login operation
  Scenario: Login to OrangeHRM portal successfully
    Given user is on login page
    When user enters username and password
    And user click on login button
    Then user is redirected to home page

  #Add operation
  Scenario Outline: PIM user created successfully
    Given user clicks on PIM option
    And user clicks +Add button
    When user enters <firstname>, <middlename> , <lastname>
    Then user enters save button

    Examples: 
      | firstname | middlename | lastname |
      | Roma      | Raman      | Verma    |
      | Jim      | Jackson    | Jacob    |

	# Search and delete operation
  Scenario Outline: PIM user searched and deleted successfully
    Given user clicks on PIM homepage button
    When user enters <username> in Employee Name textbox
    And user clicks on Search button
    #Then user record is displayed
    Then user deletes the record by selecting delete button

    Examples: 
      | username           |
      | Roma Raman Verma   |
      | Jim Jackson Jacob |
