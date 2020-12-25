Feature: cucumber epam test
    Rule: user should open "https://www.epam.com/"

  Scenario: Check out buttons (epam)
    Given open "https://www.epam.com/"
    When click on epam
    Then site should refresh

  Scenario: Check out buttoms (Services)
    Given open "https://www.epam.com/"
    When click on Services
    Then u should be on "https://www.epam.com/services"

  Scenario: Check out buttoms (How we do it)
    Given open "https://www.epam.com/"
    When click on How we do it
    Then u should be on "https://www.epam.com/how-we-do-it"

  Scenario: Check out buttoms (About)
    Given open "https://www.epam.com/"
    When click on About
    Then u should be on "https://www.epam.com/about"

  Scenario: Check out buttoms (Careers)
    Given open "https://www.epam.com/"
    When click on Careers
    Then u should be on "https://www.epam.com/careers"

  Scenario: Check out buttons (search)
    Given open "https://www.epam.com/"
    When search "epam"
    Then u should see 'RESULTS FOR "EPAM"'

  Scenario: Check out buttons (find job)
    Given open "https://www.epam.com/"
    When scroll down to Join Our Team Today! click on "FIND YOUR DREAM JOB"
    Then u should be on "https://www.epam.com/careers"

  Scenario Outline: Correct input search test
    Given open "https://www.epam.com/"
    When search <Search>
    Then u should see <Result>

    Examples: 
      | Search                          | Result                          |
      | "Automation"                    | "Automation"                    |
      | "BLOCKCHAIN"                    | "BLOCKCHAIN"                    |
      | "Cloud"                         | "Cloud"                         |
      | "C++"                           | "C++"                           |
      | "Contact"                       | "Contact"                       |
      | "DevOps"                        | "DevOps"                        |
      | "Governance, Risk & Compliance" | "Governance, Risk & Compliance" |
      | "Open Source"                   | "Open Source"                   |
      | "RPA"                           | "RPA"                           |

  Scenario Outline: incorrect input search test
    Given open "https://www.epam.com/"
    When search <Search>
    Then u should see <Result> <and>

    Examples: 
      | Search       | Result                                                                  | and                       |
      | "ckjdj"      | "Sorry, but your search returned no results. Please try another query." | ""                        |
      | "Govermnent" | "Sorry, but your search returned no results. Please try another query." | "Did you mean government" |
      | "freebie"    | "Sorry, but your search returned no results. Please try another query." | "Did you mean freeby"     |
