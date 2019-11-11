# new feature
# Tags: optional
    
Feature: Object Creation
    @Test1
    Scenario: Article Creation
        Given Navigation to the project
        When You fill in all the data and click OK
        |Article has been created by me|
        Then The object has been created