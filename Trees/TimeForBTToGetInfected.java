package Trees;
import java.util.*;
public class TimeForBTToGetInfected {
       
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
    public TreeNode getNode(TreeNode root, int start){
        if(root==null) return null;
        if(root.val==start) return root;
        TreeNode left= getNode(root.left, start);
        TreeNode right= getNode(root.right, start);
        if(left==null) return right; 
        else return left;
    }
    public void preorder(TreeNode root, HashMap<TreeNode, TreeNode> parent){
        if(root==null) return;
        if(root.left!=null){
            parent.put(root.left, root);
        }
        if(root.right!=null){
            parent.put(root.right, root);
        }
        preorder(root.left, parent);
        preorder(root.right, parent);

    }
    public int amountOfTime(TreeNode root, int start) {
        TreeNode node= getNode(root, start);  //to find start node
        //hashmap to store child and their parent
        HashMap<TreeNode, TreeNode> parent = new HashMap<>(); //child, parent
        preorder(root, parent);
        //bfs
        Queue<TreeNode> q= new LinkedList<>();
        q.add(node);
        //hashmap for visited nodes
        HashMap<TreeNode, Integer> visited = new HashMap<>();
        visited.put(node,0);
        while(q.size()>0){
            TreeNode temp= q.peek();
            int level= visited.get(temp);
            if(temp.left!=null && !visited.containsKey(temp.left)){
                q.add(temp.left);
                visited.put(temp.left, level+1);
            }
            if(temp.right!=null && !visited.containsKey(temp.right)){
                q.add(temp.right);
                visited.put(temp.right, level+1);
            }
            if(parent.containsKey(temp) && !visited.containsKey(parent.get(temp))){
                 q.add(parent.get(temp));
                visited.put(parent.get(temp), level+1);
            }
            q.remove();
        }
        int max=-1;
        for(int level: visited.values()){
            max= Math.max(max, level);

        }
        return max;
    }
}
}
