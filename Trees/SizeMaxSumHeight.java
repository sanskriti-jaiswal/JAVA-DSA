package Trees;
import java.util.*;

import Arrays.sum;
public class SizeMaxSumHeight {
    // static int size=0; //global variable
    public static class Node{
        int val; //0
        Node left; //null
        Node right;  //null

        public Node(int val){     //create constructor
            this.val=val;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        // size++;
        preorder(root.left);
        preorder(root.right);
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        return root.val+ sum(root.left)+ sum(root.right);
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){   //leaf node should return 0
            return 0;
        }
        return 1+Math.max(height(root.left), height(root.right));
    }

    public static int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        // int a=root.val;
        // int b= max(root.left);
        // int c=max(root.right);
        // return Math.max(a, Math.max(b,c));
        //OR SIMPLY
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    
    public static int min(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int a=root.val;
        int b=min(root.left);
        int c=min(root.right);
        return Math.min(a, Math.min(b,c));
    }

    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return 1+ size(root.left)+ size(root.right);
    }

    public static int product(Node root){
        if(root==null){
            return 1;
        }
        return root.val*(product(root.left))*(product(root.right));
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
        a.left=c;
        a.right=d;
        b.right=e;
        Node f= new Node(7);
        e.left=f;
        // preorder(root);
        // // System.out.println(size);
        // System.out.println(size(root));
        // System.out.println(sum(root));
        // System.out.println(max(root));
        // System.out.println(height(root));
        System.out.println(min(root));
        System.out.println(product(root));
    }
}
