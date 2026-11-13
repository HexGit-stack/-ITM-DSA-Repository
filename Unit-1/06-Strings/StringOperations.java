public class StringOperations {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);

        System.out.println("Length of First String: " + str1.length());

        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        System.out.println("Are both strings equal? " + str1.equals(str2));

        String reversed = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed = reversed + str1.charAt(i);
        }

        System.out.println("Reversed First String: " + reversed);
    }
}
