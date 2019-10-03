$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HelpPage.feature");
formatter.feature({
  "line": 3,
  "name": "Help Page",
  "description": "",
  "id": "help-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_Help_Page"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "search for help",
  "description": "",
  "id": "help-page;search-for-help",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@test22"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the help page url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search for a term \u003csearchTerm\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Search results message should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "help-page;search-for-help;",
  "rows": [
    {
      "cells": [
        "searchTerm"
      ],
      "line": 11,
      "id": "help-page;search-for-help;;1"
    },
    {
      "cells": [
        "card"
      ],
      "line": 12,
      "id": "help-page;search-for-help;;2"
    },
    {
      "cells": [
        "money"
      ],
      "line": 13,
      "id": "help-page;search-for-help;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11091283500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "search for help",
  "description": "",
  "id": "help-page;search-for-help;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@test22"
    },
    {
      "line": 1,
      "name": "@Feature_Help_Page"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the help page url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search for a term card",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Search results message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HelpPageStepDef.i_navigate_to_the_helpl_page_url()"
});
formatter.result({
  "duration": 1157408100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "card",
      "offset": 20
    }
  ],
  "location": "HelpPageStepDef.iSearchForATerm(String)"
});
formatter.result({
  "duration": 1422576201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search results",
      "offset": 0
    }
  ],
  "location": "HelpPageStepDef.message_should_be_displayed(String)"
});
formatter.result({
  "duration": 170576099,
  "status": "passed"
});
formatter.after({
  "duration": 782132100,
  "status": "passed"
});
formatter.before({
  "duration": 10077020500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "search for help",
  "description": "",
  "id": "help-page;search-for-help;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@test22"
    },
    {
      "line": 1,
      "name": "@Feature_Help_Page"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the help page url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search for a term money",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Search results message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HelpPageStepDef.i_navigate_to_the_helpl_page_url()"
});
formatter.result({
  "duration": 812083100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "money",
      "offset": 20
    }
  ],
  "location": "HelpPageStepDef.iSearchForATerm(String)"
});
formatter.result({
  "duration": 1148092799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search results",
      "offset": 0
    }
  ],
  "location": "HelpPageStepDef.message_should_be_displayed(String)"
});
formatter.result({
  "duration": 115507701,
  "status": "passed"
});
formatter.after({
  "duration": 838834700,
  "status": "passed"
});
});