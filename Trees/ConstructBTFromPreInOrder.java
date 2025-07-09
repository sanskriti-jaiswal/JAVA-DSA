package Trees;

public class ConstructBTFromPreInOrder {
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

    public TreeNode helper(int[] preorder,int preLowIdx, int preHighIdx, int[] inorder, int inLowIdx, int inHighIdx){
        if(preLowIdx>preHighIdx){
            return null;
        }
        TreeNode root= new TreeNode(preorder[preLowIdx]); //root is first index of preorder
        int i= inLowIdx;
        //traverse in inorder till root found
        while(inorder[i]!=preorder[preLowIdx]){
            i++;
        }
        int leftSize= i- inLowIdx;
        root.left=helper(preorder,preLowIdx+1, preLowIdx+leftSize, inorder, inLowIdx, i-1);
        root.right= helper(preorder, preLowIdx+leftSize+1, preHighIdx, inorder, i+1, inHighIdx);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n= preorder.length;
        return helper(preorder,0, n-1, inorder, 0, n-1);

    }
}
}
