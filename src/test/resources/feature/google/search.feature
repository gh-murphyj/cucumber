Feature: Test Google's search engine
  As a Googlear
  I want to be able to search for things on the web
  So that Google returns me a useful page of links

  Scenario: Searching for Tom Cruise
    Given I am on Google's home page
    When I search for "Tom Cruise"
    Then The page returned should include a link entitled "Tom Cruise - IMDb"
