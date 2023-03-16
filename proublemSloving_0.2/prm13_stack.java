import java.util.Stack;

/*
 * Reverse String: Write a program that reads in a string and reverses the order of its characters using a stack.
 *  For example, the string "hello world" should become "dlrow olleh".
 */
public class prm13_stack {
    public static void main(String[] args) {
        String input ="Hello world";
        convertString(input);
    }

    private static void convertString(String input) {

        Stack<String> stakholder = new Stack<String>();
        
        
        for (int i = 0; i < input.length();i++){
            String charactor = Character.toString(input.charAt(i));
            stakholder.push(charactor);
        }
       for (int j =0; j<input.length();j++){
        String value  =  stakholder.pop();
        System.out.print(value);
       }
    }
    
}
