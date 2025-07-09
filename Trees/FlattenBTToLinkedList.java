package Trees;

public class FlattenBTToLinkedList {
    class Solution {
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
    public void flatten(TreeNode root) {
        if (root == null) return;

        TreeNode leftTree = root.left;
        TreeNode rightTree = root.right;

        // Recursively flatten left and right subtrees
        flatten(leftTree);
        flatten(rightTree);

        // Set left to null and attach the flattened left subtree to right
        root.left = null;
        root.right = leftTree;

        // Move to the end of the newly attached right subtree (original left)
        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }

        // Attach the flattened right subtree
        temp.right = rightTree;
    }
}
}
