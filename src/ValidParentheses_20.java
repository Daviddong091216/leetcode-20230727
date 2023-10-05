import java.util.Stack;

public class ValidParentheses_20 {


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); // create an empty stack
        for (char c : s.toCharArray()) { // loop through each character in the string
            if (c == '(') // if the character is an opening parenthesis
                stack.push(')'); // push the corresponding closing parenthesis onto the stack
            else if (c == '{') // if the character is an opening brace
                stack.push('}'); // push the corresponding closing brace onto the stack
            else if (c == '[') // if the character is an opening bracket
                stack.push(']'); // push the corresponding closing bracket onto the stack
            else if (stack.isEmpty() || stack.pop() != c) // if the character is a closing bracket
                // if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
                // does not match the closing bracket, the string is not valid, so return false
                return false;
        }
        // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
        // so the string is valid, otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses_20 obj = new ValidParentheses_20();
        String s1 = "()[]{}";
        System.out.println(obj.isValid(s1));
        String s2 = "()[]}";
        System.out.println(obj.isValid(s2));
        String s3 = "([]{}";
        System.out.println(obj.isValid(s3));
        String s4 = "(}";
        System.out.println(obj.isValid(s3));

    }
}
