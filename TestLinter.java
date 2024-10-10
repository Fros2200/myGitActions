public class TestLinter {

    public static void main(String[] args) {
        String goodVariableName = "Hello, Linter!"; // Correct naming convention (camelCase)
        String result = add(5, 10); // Function call
        System.out.println(result); // Print result
    }

    public static String add(int a, int b) {
        int result = a + b;
        if (a == 5) { // Proper formatting with spaces
            System.out.println("a is 5!"); // Correct indentation
        }
        return "Sum: " + result;
    }

}
