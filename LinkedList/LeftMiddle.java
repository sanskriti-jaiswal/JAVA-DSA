package LinkedList;

public class LeftMiddle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            
        }
    }

    public static Node leftMiddleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //IN CASE OF EVEN LIST
    public static void main(String[] args) {
        
        Node a= new Node(5);
        Node b= new Node(3);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(16);
        Node f= new Node(100);
        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;
        e.next= f;

        Node q= leftMiddleNode(a);
        System.out.println(q.data);

    }
}
