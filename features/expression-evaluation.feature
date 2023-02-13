Feature: Math expression evaluation
  There is only so much science, as there is mathematics.

  Scenario: Calculate expression
    Given Enter expression evaluator page
    When Input the expression
    Then The result should be 21

#    Examples:
#      | expression  | result |
#      | 3 * 7       | 21     |
#      | 3 * (3 + 4) | 21     |