package BinarySearchTrees;

public class Insertion {
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //insertion
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val>val){
            //go left
            if(root.left==null){ //if left is null
                root.left= new TreeNode(val); //insert
            }else{
                //if root.left is not null
                insertIntoBST(root.left, val); 
            }
        }else{ //go right
            if(root.right==null){ //if left is null
                root.right= new TreeNode(val); //insert
            }else{
                //if root.left is not null
                insertIntoBST(root.right, val); 
            }
        }
        
        return root;
    }
}
}
