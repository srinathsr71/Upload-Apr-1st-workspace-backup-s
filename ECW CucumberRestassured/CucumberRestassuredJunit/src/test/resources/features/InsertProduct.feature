Feature: insert products using POST API

  Scenario Outline: validate post product api status code works correctly
    Given I hit the url of post product api endpoint
    And I pass the request body of product title <ProductTitle>
    Then I receive the response code as 200
   Examples:
     | ProductTitle |
     | Shoes        |

  Scenario Outline: validate post product api response body works correctly
    Given I hit the url of post product api endpoint
    And I pass the request body of product title <ProductTitle>
    Then I receive the response body with id as <id>
    Examples:
      | ProductTitle | id |
      | Shoes        | 21 |

