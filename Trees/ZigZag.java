package Trees;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
    }
  }
  class Solution {
    public void nthLevel(TreeNode root, int n, List<Integer> arr){ //TC= O(n)
        if(root==null){
            return;
        }
        if(n==1){ //if level is one
            arr.add(root.val);
            return;              //return when level is 1
        }
        nthLevel(root.left, n-1, arr);
        nthLevel(root.right, n-1, arr);
    }
    public void nthLevel2(TreeNode root, int n, List<Integer> arr){ //TC= O(n)
        if(root==null){
            return;
        }
        if(n==1){ //if level is one
            arr.add(root.val);
            return;              //return when level is 1
        }
        nthLevel2(root.right, n-1, arr);
        nthLevel2(root.left, n-1, arr);
    }
    public static int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level=height(root)+1;
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        for(int i=1; i<=level; i++){
            List<Integer> arr= new ArrayList<>();
            if(i%2!=0){
                nthLevel(root,i, arr);
            }else{
                nthLevel2(root, i, arr);
            }
            ans.add(arr);

        }
        return ans;
    }
}

}
