package ValidParentheses;

import java.util.Stack;

public class Leetcode_20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }

        return stack.isEmpty();

    }
}
