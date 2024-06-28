import java.util.Stack;

public class isValidParenthesisStack {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();

        // Creating array and storing the array
        // returned by toCharArray() method
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];

            // Adding open brackets
            if (c =='(' || c=='{' || c=='[') {
                charStack.push(c);
            }



            // Closing the added open brackets
            if (c==')' || c=='}' || c==']') {
                if (charStack.isEmpty()) {
                    return false;
                }

                char r = charStack.pop();
                if (c==')' && r == '(') {
                }
                else if (c=='}' && r=='{') {
                }
                else if (c==']' && r=='[') {

                }
                else {
                    return false;
                }
            } // end if
        } // end for
        if (charStack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
