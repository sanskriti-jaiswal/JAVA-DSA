package Stacks;
import java.util.*;
public class ValidParanthesis {
    class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.size() == 0) {
                    return false;
                } else if ((st.peek() == '(' && ch == ')') ||
                           (st.peek() == '{' && ch == '}') ||
                           (st.peek() == '[' && ch == ']')) {
                    st.pop();
                } else if ((st.peek() == '(' && ch != ')') ||
                           (st.peek() == '{' && ch != '}') ||
                           (st.peek() == '[' && ch != ']')) {
                    return false;
                }
            }
        }

        if (st.size() > 0) {
            return false;
        } else {
            return true;
        }
    }
}

}
