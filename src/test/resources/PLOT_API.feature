@Feature_PLOT_API_ARTICLES

  Feature: Plot_apis

    @Test33
    Scenario: When I request an end point for 6 articles with DNA in the title then I should see the right number of articles returned
      Given I send a request to the api to get 6 articles with DNA in the title
      Then I should see the 6 titles in the response with subject DNA
      And 200 statusCode should be displayed for subject DNA
      And I should see only articles containing DNA
      DFDFDFDFDFD
