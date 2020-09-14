Feature:
  Scenario: Direction to Retail page from homepage
    Given user is on homepage of BJSS
    When user brings the cursor on 'Your Industry' and clicks on 'Retail' from Mouse Hover dropdown list
    Then user should be able to see the Retail page