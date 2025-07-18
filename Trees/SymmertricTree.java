package Trees;

public class SymmertricTree {
   
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
    public boolean isSameTree(TreeNode p, TreeNode q){ //helper
        if(p==null && q==null) return true;
        if(p==null || q==null) return false; //if any node is null while the other node is not null
        if(p.val!=q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public TreeNode invertTree(TreeNode root){ //helper
        if(root==null) return root;
        TreeNode l= root.left;
        TreeNode r= root.right;
        root.left= invertTree(r);
        root.right= invertTree(l);
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        //invert the left subtree
        if(root==null) return true;
        root.left=invertTree(root.left);
        return isSameTree(root.left, root.right);
    }
}
}
