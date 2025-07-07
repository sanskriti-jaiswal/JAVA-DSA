package Trees;

public class LowestCommonAncestor {

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root){
            return root;
        }
        if(p==q) return p;
        boolean leftp= contains(root.left,p);
        boolean rightq= contains(root.right,q);
        if((leftp && rightq) || (!leftp && !rightq)) return root;
        if(leftp && !rightq) return lowestCommonAncestor(root.left,p,q);
        if(!leftp && rightq) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    public boolean contains(TreeNode root, TreeNode node){
        if(root==null) return false;
        if(root==node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }
}
}
