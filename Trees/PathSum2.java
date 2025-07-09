package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val= val;
        }
    }
    class Solution {
    public void helper(List<List<Integer>> ans,List<Integer> arr, TreeNode root, int targetSum ){
        if(root==null) return;
        if(root!=null && root.left==null && root.right==null){ //leaf node
            arr.add(root.val);
            if(root.val==targetSum){
                List<Integer> a= new ArrayList<>(); //new arraylist 
                for(int i=0; i<arr.size(); i++){
                    a.add(arr.get(i));
                }
                ans.add(a);// a added to ans arraylist
            }
            arr.remove(arr.size()-1);// remove element if not equal to target sum
            return;
        }
        arr.add(root.val);
        helper(ans, arr, root.left, targetSum-root.val);
        helper(ans, arr, root.right, targetSum-root.val);
        arr.remove(arr.size()-1);
        return;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        helper(ans, arr, root, targetSum);
        return ans;
    }
}
}
