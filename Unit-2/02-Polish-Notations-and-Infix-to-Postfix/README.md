# Polish Notations and Infix-to-Postfix Conversion

## Definition
Polish notation is a mathematical notation in which operators are written before their operands. Reverse Polish notation (Postfix) places operators after their operands.

## Types of Notations
1. Infix: Operator is placed between operands. Example: `A + B`
2. Prefix: Operator is placed before operands. Example: `+ A B`
3. Postfix: Operator is placed after operands. Example: `A B +`

## Infix-to-Postfix Conversion
Infix expressions are converted into postfix expressions using a stack and operator precedence.

## Basic Rules
- Operands are added directly to the output.
- Operators are stored in a stack.
- Operators with higher or equal precedence are processed first, subject to associativity.
- Parentheses control the order of operations.

## Java Program
InfixToPostfix.java

## Sample Output

Infix Expression: A+B*C
Postfix Expression: ABC*+


## Time Complexity
| Operation | Time Complexity |
|---|---|
| Infix-to-Postfix Conversion | O(n) |

## Language
Java

## Difficulty
Beginner

---
Part of the ITM DSA Repository.
