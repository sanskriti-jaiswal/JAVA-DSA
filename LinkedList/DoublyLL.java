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

    public static void display2(Node tail){  //DISPLAY IN REVERSE
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
        Node t= new Node(x);
        t.next= head;
        head.prev=t;
        head=t;
        t.prev=null;
        return head;
    }

    public static void insertattail(Node head, int x){
        Node temp= head;
        while(temp.next!=null){
            temp= temp.next;
        }
        Node t= new Node(x);
        temp.next=t;
        t.prev=temp;
        
    }

    public static void insertAtIdx(Node head, int idx, int x){
        Node s= head;
        for(int i=1; i<=idx-1; i++){
            s= s.next;
        }
        Node r= s.next;
        Node t= new Node(x);
        // s.next=t;
        // t.prev=s;
        // t.next=r;
        // r.prev=t;
        //OR
        t.next=r;
        r.prev=t;
        t.prev=s;
        s.next=t;
    }
    public static void deleteAtHead(Node head){
        head= head.next;
        head.prev= null;
    }
    public static void deleteAtTail(Node head){
        Node temp= head;
        while(temp.next!= null){
            temp=temp.next;
        }
        temp=temp.prev;
        temp.next=null;

    }
    public static void deleteAtIndex(Node head, int idx){
        Node temp= head;
        for(int i=1; i<=idx-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;

    }
    public static void main(String[] args) {
        //4 10 2 99 13
        //HARD-CODED LINKED LIST
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
        // display2(e);
        // display3(c);
        Node newhead= insertathead(a,35);
        display(newhead);
        insertattail(a,90 );
        display(a);
        // insertAtIdx(a, 2, 15);
        // display(a);
        deleteAtHead(a);
        display(a);
        deleteAtTail(a);
        display(a);
        deleteAtIndex(a, 2);
        display(a);

    }
    
}
