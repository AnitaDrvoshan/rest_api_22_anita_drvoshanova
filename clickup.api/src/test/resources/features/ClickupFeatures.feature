Feature:  This feature tests ClickUp api

  Scenario: Add a new list to Folder after you verify that the name is correct
    Given The Folder exists with the name "New Folder"
    When I create a new list in the Folder
    And Check that the list name is correct
    Then I create a task with a title "new task"
    And I check that the task name is "new task"
    Then I delete the task from the list

