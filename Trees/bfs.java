package Trees;
import java.util.*;
//LEVEL ORDER TRAVERSAL USING QUEUE-> BFS
public class bfs {
    public static class Node{
        int val; //0
        Node left; //null
        Node right;  //null

        public Node(int val){     //create constructor
            this.val=val;
        }
    }
    public static void breadfirstsearch(Node root){
        Queue<Node> q =new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp= q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
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
        breadfirstsearch(root);
}
}