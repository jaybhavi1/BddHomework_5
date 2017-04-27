
@SmokeTest
Feature: Catalog categories

  A as user
  I want to see two categories Tops and Dresses in Woman catalog
  So that I can navigate for Individual Category

  Scenario: user should see two categories Tops and Dresses in Woman catalog
    Given User is on Home page
    When he select woman tag
    Then he navigate to woman catalog
    And see the Tops and Dresses in Woman categories