package Trees;
//LEVEL ORDER TRAVERSAL USING Nth LEVEL
public class nthLevel {
    public static class Node{
        int val; //0
        Node left; //null
        Node right;  //null

        public Node(int val){     //create constructor
            this.val=val;
        }
    }
    // public static void nthLevel(Node root, int n){ //TC= O(nlogn)
    //     if(root==null){
    //         return;
    //     }
    //     if(n==1){ //if level is one
    //         System.out.print(root.val+ " ");
    //     }
    //     nthLevel(root.left, n-1);
    //     nthLevel(root.right, n-1);
    // }
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
            nthLevel(root, i);
            System.out.println();
        }
}
}
