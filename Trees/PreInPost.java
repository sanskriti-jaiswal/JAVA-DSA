package Trees;
import java.util.*;
public class PreInPost {
    public static class Node{
        int val; //0
        Node left; //null
        Node right;  //null

        public Node(int val){     //create constructor
            this.val=val;
        }
    }
    public static void preorder(Node root){
        //root left right
        if(root==null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        //left root right
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void postorder(Node root){
        //left root right
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
        
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
        // preorder(root);
        // inorder(root);
        // postorder(root);
        // nthLevel(root, 1);
        // nthLevel(root, 3);
        
    }
}
