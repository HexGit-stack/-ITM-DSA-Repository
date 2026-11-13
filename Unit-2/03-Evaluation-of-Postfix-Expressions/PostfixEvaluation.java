import java.util.Stack;

public class PostfixEvaluation {

    static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int second = stack.pop();
                int first = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(first + second);
                        break;
                    case '-':
                        stack.push(first - second);
                        break;
                    case '*':
                        stack.push(first * second);
                        break;
                    case '/':
                        stack.push(first / second);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + ch);
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "23*54*+9-";

        System.out.println("Postfix Expression: " + expression);
        System.out.println("Result: " + evaluate(expression));
    }
}
