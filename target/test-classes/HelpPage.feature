@Feature_Help_Page

  Feature: Help Page

    @test22
    Scenario Outline: search for help
      Given I navigate to the help page url
      And I search for a term <searchTerm>
      Then Search results message should be displayed
      Examples:
        | searchTerm |
        | card       |
        | money      |
