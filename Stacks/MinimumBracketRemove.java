package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketRemove {
     public static int minRemovalsToMakeBalanced(String str){
        Stack<Character> st = new Stack<>();
        int count = 0;
        int n = str.length();

        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else {  // ch == ')'
                if(st.size() == 0){
                    count++;  // unmatched ')'
                } else if(st.peek() == '('){
                    st.pop();  // matched pair
                }
            }
        }

        //st.size() has number of Remaining unmatched '(' in stack
        count += st.size();

        return count;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(minRemovalsToMakeBalanced(str));
    }

}
