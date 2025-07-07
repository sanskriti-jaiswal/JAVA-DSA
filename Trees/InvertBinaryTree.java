package Trees;
import java.util.*;
public class InvertBinaryTree {

    //TC= O(n)
    //SC= O(h), h=height of the tree
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        //swapping one node
        TreeNode temp= root.left;
        root.left= root.right;
        root.right= temp;
        //for each node
        root.left= invertTree(root.left);
        root.right= invertTree(root.right);
        return root;
    }
}
}
