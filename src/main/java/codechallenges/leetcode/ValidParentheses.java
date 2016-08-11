package codechallenges.leetcode;

/**
 * Created by jacksonchang on 8/10/16.
 */

import java.util.Stack;


/**
 * Created by jacksonchang on 8/10/16.
 *
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 *
 * Used Hint to get answer
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if(s.length() % 2 == 1)
            return false;
        Stack<Character> stack = new Stack<Character>();

        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == ')' && (stack.isEmpty() || stack.pop() != '(')) return false;
            if (s.charAt(i) == '}' && (stack.isEmpty() || stack.pop() != '{')) return false;
            if (s.charAt(i) == ']' && (stack.isEmpty() || stack.pop() != '[')) return false;
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }


    public static void main (String [] args){
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()()()()()()"));
        System.out.println(vp.isValid("{}{}{{}}"));
        System.out.println(vp.isValid("()()()())()))()"));
        System.out.println(vp.isValid("()()()([][]][][])()"));

    }

}