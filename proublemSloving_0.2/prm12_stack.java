import java.lang.invoke.CallSite;
import java.util.Stack;

/*
 * Parentheses Matching: Write a program that reads in a string containing parentheses, brackets, and braces, and determines whether they are balanced and properly nested.
 *  For example, the string "( { [ ] } )" should return true, but the string "( [ ) ]" should return false. 
 * Use a stack to keep track of the opening symbols and check if each closing symbol matches the last opening symbol on the stack.
 */

public class prm12_stack {

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
           
            if (c == '(' || c == '[' || c == '{') {
               
                stack.push(c);
                
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
               
                char top = stack.pop();
     
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                       
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String str1 = "( { [ ] } )";
        String str2 = "( [ ) ]";
        
        System.out.println(isBalanced(str1)); // true
        System.out.println(isBalanced(str2)); // false
    }
}
