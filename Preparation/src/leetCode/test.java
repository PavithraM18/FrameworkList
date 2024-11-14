package leetCode;
import java.util.Stack;

public class test {

    public boolean isValid(String s) {
        // Initialize a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If the stack is empty or the top of the stack doesn't match the closing bracket
                if (stack.isEmpty() || !isMatching(stack.peek(), c)) {
                    return false;
                }
                // Pop the matching opening bracket from the stack
                stack.pop();
            }
        }
        
        // If the stack is empty, all opening brackets were properly matched
        return stack.isEmpty();
    }

    // Helper method to check if the opening and closing brackets match
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    // Main method to test the function
    public static void main(String[] args) {
        test validator = new test();
        
        String test1 = "()"; // true
        String test2 = "()[]{}"; // true
        String test3 = "(]"; // false
        String test4 = "([)]"; // false
        String test5 = "{[]}"; // true
        
        System.out.println(validator.isValid(test1));
        System.out.println(validator.isValid(test2));
        System.out.println(validator.isValid(test3));
        System.out.println(validator.isValid(test4));
        System.out.println(validator.isValid(test5));
    }
}
