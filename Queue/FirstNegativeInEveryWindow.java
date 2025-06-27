package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInEveryWindow {
    class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        // Collect all negative indices
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        // Process each window
        for (int i = 0; i < n - k + 1; i++) {
            while (!q.isEmpty() && q.peek() < i) {
                q.remove();
            }
            if (!q.isEmpty() && q.peek() <= i + k - 1) {
                res.add(arr[q.peek()]);
            } else {
                res.add(0);
            }
        }

        return res;
    }
}

}
