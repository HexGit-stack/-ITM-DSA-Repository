public class Recursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
        System.out.println("Sum of first 5 natural numbers: " + sum(5));
    }
}
