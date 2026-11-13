# Evaluation of Postfix Expressions

## Definition
Postfix notation is a mathematical notation in which operators are written after their operands. A stack is used to evaluate postfix expressions.

## Evaluation Process
1. Read the expression from left to right.
2. If the character is a number, push it onto the stack.
3. If the character is an operator, pop two operands.
4. Perform the operation and push the result back.
5. The final stack element is the answer.

## Operators Supported
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)

## Java Program
PostfixEvaluation.java

## Sample Output

Postfix Expression: 23*54*+9-
Result: 17


## Time Complexity
| Operation | Time Complexity |
|---|---|
| Postfix Evaluation | O(n) |

## Space Complexity
O(n), where n is the number of elements in the expression.

## Language
Java

## Difficulty
Beginner

---
Part of the ITM DSA Repository.
