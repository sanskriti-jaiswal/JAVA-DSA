package Trees;

public class ZigZagTraversal {
    public static class Node{
        int val; //0
        Node left; //null
        Node right;  //null

        public Node(int val){     
            this.val=val;
        }
    }
    //left to right
    public static void nthLevel(Node root, int n){ //TC= O(n)
        if(root==null){
            return;
        }
        if(n==1){ //if level is one
            System.out.print(root.val+ " ");
            return;              //return when level is 1
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static void nthLevel2(Node root, int n){ //TC= O(n)
        if(root==null){
            return;
        }
        if(n==1){ //if level is one
            System.out.print(root.val+ " ");
            return;              //return when level is 1
        }
        nthLevel2(root.right, n-1);
        nthLevel2(root.left, n-1);
    }

    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        Node root= new Node(1);      //root object is intsantiated
        Node a= new Node(2);
        Node b= new Node(3);
        root.left=a;
        root.right=b;
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);
        Node f= new Node(7);
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
        int level=height(root)+1;
        for(int i=1; i<=level; i++){
            if(i%2!=0){
                nthLevel(root,i);
            }else{
                nthLevel2(root, i);
            }
            
            System.out.println();
        }
}
}
