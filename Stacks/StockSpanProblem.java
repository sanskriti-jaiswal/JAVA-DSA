package Stacks;
import java.util.Stack;
import java.util.ArrayList;

public class StockSpanProblem {
    class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>(); // stack to store indices

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                span.add(i + 1);
            } else {
                span.add(i - st.peek());
            }

            st.push(i);
        }

        return span;
    }
}
}

