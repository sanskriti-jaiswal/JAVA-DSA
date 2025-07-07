package Trees;

public class PathSum1 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val= val;
        }
    }
    class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false; //if any node is null return false
        if(root!=null && root.left==null && root.right==null){ //leaf node
            if(root.val==targetSum) return true;
            else return false;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);   //if any of the subtree returns true then return true
    }
}
}
