package Trees;

public class PathSum3 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val= val;
        }
    }
    class Solution {
    public int numberOfPaths(TreeNode root, long targetSum){
        if(root==null) return 0;
        int cnt=0;
        if((long)root.val==targetSum){
            cnt++;
        }
        return cnt+numberOfPaths(root.left, targetSum-(long)root.val)+ numberOfPaths(root.right, targetSum-(long)root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
         if(root==null) return 0;
        int count=numberOfPaths(root, (long)targetSum);
        count =count+(pathSum(root.left,targetSum)+ pathSum(root.right, targetSum));
        return count;

    }
}
}
