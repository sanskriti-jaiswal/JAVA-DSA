package LinkedList;
//WE ARE IMPLEMENTING THE LIST MANUALLY HERE
public class Basics {

    
    public static void display(Node head){
        //HERE HEAD IS PRESERVED
        Node temp= head;
        while(temp!= null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

    // public static void display(Node head){
    //     //WE WILL LOOSE OUR HEAD ONCE IT TRAVERSES THE WHOLE LIST
    //     //AFTER CALLING DISPLAY AGAIN IT WONT TRAVERSE AGAIN AND DOESNT PRINT ANYTHING SINCE HEAD= NULL
    //     while(head!= null){
    //         System.out.println(head.data);
    //         head= head.next;
    //     }
    // }

    public static void displayrecursive(Node head){
        //DISPLAY LIST RECURSIVELY
        if(head== null) return;
        System.out.println(head.data+ "  ");
        displayrecursive(head.next);
    }

    public static void displayrecursiveinreverse(Node head){
        //TO DISPLAY LIST IN REVERSE
        if(head== null) return;
        displayrecursiveinreverse(head.next);
        System.out.println(head.data+ "  ");
    }

    public static int length(Node head){
        int count=0;
        while(head!= null){
            count++;
            head= head.next;
        }
        return count;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            
        }
    }
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
        // System.out.println(a);
        // System.out.println(a.next);
        // System.out.println(b);
        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println(e.data);

        // System.out.println(a.next.data); //b.data
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        
        // Node temp= a;
        // for(int i=1; i<=5; i++){
        //     System.out.println(temp.data);
        //     temp= temp.next;
        // }

        // Node temp= a;
        // while(temp!= null){
        //     System.out.println(temp.data+ " ");
        //     temp= temp.next;
        // }

        // display(a);
        // System.out.println();
        // displayrecursive(a);
        // displayrecursiveinreverse(a);

        System.out.println(length(a));



    }
}
