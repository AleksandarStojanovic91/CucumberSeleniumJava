Feature: Login

 Scenario Outline: This is first Test
   Given I open Google Chrome and navigate to saucelabs.com
   When I login to the website with valid "<username>" and "<password>"
   Then Home page and Robot logo is shown
   And User logs out
   Examples:
     |username                | password     |
     |standard_user           | secret_sauce |
     |problem_user            | secret_sauce |
     |performance_glitch_user | secret_sauce |
     |locked_out_user         | secret_sauce |