package leetcode.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(]";

        /**
         * Intuition
         * The problem requires us to determine if the given string of brackets is valid or not.
         * We can use a stack data structure to keep track of opening brackets encountered and check
         * if they match with the corresponding closing brackets.
         *
         * Approach
         * Here is the step-by-step approach of the algorithm:
         *
         * 1. Initialize an empty stack.
         *
         * 2. Traverse the input string character by character.
         *
         * 3. If the current character is an opening bracket (i.e., '(', '{', '['), push it onto the stack.
         *
         * 4. If the current character is a closing bracket (i.e., ')', '}', ']'), check if the stack is empty.
         * If it is empty, return false, because the closing bracket does not have a corresponding opening bracket.
         * Otherwise, pop the top element from the stack and check if it matches the current closing bracket.
         * If it does not match, return false, because the brackets are not valid.
         *
         * 5. After traversing the entire input string, if the stack is empty, return true, because all opening brackets
         * have been matched with their corresponding closing brackets. Otherwise, return false, because some opening brackets
         * have not been matched with their corresponding closing brackets.
         */

//        System.out.println(s.toCharArray());

//        char[] d = s.toCharArray();
//        System.out.println(d[0]);

        /**
         * s = "(]"
         *
         * c[0] = (
         *
         * c[1] = ]
         */
        // Create an empty stack to keep track of opening brackets
        Stack<Character> stack = new Stack<Character>();

        // Loop through every character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else { // If the character is a closing bracket
                // If the stack is empty, there is no matching opening bracket, so return false
                if (stack.isEmpty()) {
                    System.out.println(false);
                }
                // Otherwise, get the top of the stack and check if it's the matching opening bracket
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                } else { // Otherwise, the brackets don't match, so return false
                    System.out.println(false);
                }
            }
        }
        // If the stack is empty, all opening brackets have been closed, so return true
        // Otherwise, there are unmatched opening brackets, so return false
        System.out.println(stack.isEmpty());
    }
}
