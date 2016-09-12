Feature: Bucket

  Scenario: too many cukes
    Given I have 199 cukes in my bucket
    When I add 1 cukes
    Then my bucket should crack
