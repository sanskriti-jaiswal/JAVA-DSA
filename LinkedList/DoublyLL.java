package LinkedList;

public class DoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val= val;
        }   
    }
    public static void display(Node head){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static void display2(Node tail){
        Node temp= tail;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp= temp.prev;
        }
        System.out.println();
    }

    public static void display3(Node random){
        Node temp= random;
        //MOVE TEMP BACKWARDS TO THE HEAD
        while(temp.prev!= null){
            temp= temp.prev;
        }
        //PRINT THE LIST
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();

    }

    public static Node insertathead(Node head, int x){
        Node t= new Node(30);
        t.next= head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void main(String[] args) {
        //4 10 2 99 13
        Node a= new Node(4);
        Node b= new Node(10);
        Node c= new Node(2);
        Node d= new Node(99);
        Node e= new Node(13);
        a.prev=null;
        a.next= b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next= null;
        display(a);
        display2(e);
        display3(c);
        Node newhead= insertathead(a,35);
        display(newhead);
    }
    
}
