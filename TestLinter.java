public class TestLinter {

    public static void main(String[] args) {
        int UnusedVariable = 100; // Unused variable (will trigger a warning)
        String badVariableName = "Hello, Linter!"; // Bad naming convention (should be camelCase)
        String result = add(5, 10); // Function call
        System.out.println(result); // Print result
    }

    public static String add(int a, int b) {
        int result = a + b;
        if(a == 5) {System.out.println("a is 5!");} // Improper formatting (missing spaces and indentation)
        return "Sum: " + result;
    }

}
