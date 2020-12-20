Feature: cucumber epam test
    Rule: user should open "https://www.epam.com/"
        Scenario: Check out buttons (epam)
            Given opened "https://www.epam.com/"
            When click on "<epam>"
            Then site should refresh

        Scenario: Check out buttons (contact us)
            Given opened "https://www.epam.com/"
            When click on "contact us"
            And scroll down and click another "contact us" button
            Then u should see the same pages

        Scenario: Check out buttons (find job)
            Given opened "https://www.epam.com/"
            When scroll down to "Join Our Team Today!" press on "FIND YOUR DREAM JOB"
            Then u should see template that can help find job

        Scenario: Check out buttoms (career)
            Given opened "https://www.epam.com/"
            When click on "careers"
            Then u should see the same page as u got in previous case

        Scenario: Check out buttoms (about)
            Given opened "https://www.epam.com/"
            When click on "About"
            Then u should see main information about Epam

        Scenario: Check out buttoms (insights)
            Given opened "https://www.epam.com/"
            When click on "Insights"
            Then u should see some interesting ideas in topics

        Background:
            Given user open "Search"
        Scenario Outline: Correct input search test
            Given choose <Search> in list
            When press "Enter" on keyboard
            Then u should see all bloogs about <Result>

            Examples:
                | Search                        | Result                        |
                | Automation                    | Automation                    |
                | BLOCKCHAIN                    | BLOCKCHAIN                    |
                | Cloud                         | Cloud                         |
                | C++                           | C++                           |
                | Contact                       | Contact                       |
                | DevOps                        | DevOp                         |
                | Governance, Risk & Compliance | Governance, Risk & Compliance |
                | Open Source                   | Open Source                   |
                | RPA                           | RPA                           |

        Scenario Outline: incorrect input search test
            Given type <Search> in Search field
            When press "Enter" on keyboard
            Then u should see <Result>
            And <and>

            Examples:
                | Search     | Result                                                                | and                     |
                | ckjdj      | Sorry, but your search returned no results. Please try another query. |                         |
                | Govermnent | Sorry, but your search returned no results. Please try another query. | Did you mean government |
                | freebie    | Sorry, but your search returned no results. Please try another query. | Did you mean freeby     |
