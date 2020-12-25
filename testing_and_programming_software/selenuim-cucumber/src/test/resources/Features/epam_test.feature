Feature: cucumber epam test
    Rule: user should open "https://www.epam.com/"

  Scenario: Check out buttoms (Careers)
    Given open "https://www.epam.com/"
    When click on Careers
    Then u should be on "https://www.epam.com/careers"
