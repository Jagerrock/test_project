# new feature
# Tags: optional
    
Feature: Object Creation
    @Test1
    Scenario: Article Creation
        Given Navigation to the project
        When You fill in all the data and click OK
        |Article has been created by me|
        Then The object has been created
    @Test2
    Scenario: Article Creation1
        Given Navigation to the project1
        When You fill in all the data and click OK1
            |Article has been created by me|
        Then The object has been created1