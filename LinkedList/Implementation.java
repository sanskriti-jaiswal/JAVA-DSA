package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    public static class linkedlist {
        Node head=  null;
        Node tail= null;
        int size=0;

        void display(){
            Node temp= head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();
        }

        int size(){
            //IF ONLY HEAD IS GIVEN - TC= O(N)
            // Node temp= head;
            // int count =0;
            // while(temp!= null){
            //     count++;
            //     temp= temp.next;
            // }
            // return count;

            //O(1) IF LL CLASS IS THERE
            return size;
        }

        void insertatend(int val){
            // O(N)
            Node temp= new Node(val);
            if(head== null){
                head= temp;
                tail= temp;
            }else{
                tail.next= temp;
                tail= temp;
            }
            size++;
        }

        void insertatbeg(int val){
            //O(1)
            Node temp= new Node(val);
            if(head== null){
                head= tail= temp;
            }
            else{
                temp.next= head;
                head= temp;
            }
            size++;
        }

        void insertat(int idx, int val){
            //TC  - O(N)
            //SPACE COMP= O(1) - NO EXTRA SPACE REQIRED
            Node t= new Node(val);
            Node temp= head;
            if(idx== size()){
                insertatend(val);
                return;
            }
            else if(idx==0){
                insertatbeg(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp= temp.next;
            }
            t.next= temp.next;
            temp.next= t;
            size++;
        }

        int getAt(int idx){
            //TIME COMP= O(N)
            if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return -1;
            }
            Node temp= head;
            for(int i=1; i<=idx; i++){
                temp= temp.next;
            }
            return temp.data;
        }

        void deleteatindex(int idx){
            if(idx==0){
                head= head.next;
                size--;
                return;
            }
            Node temp= head;
            for(int i=1; i<=idx-1; i++){
                temp= temp.next;
            }
            temp.next= temp.next.next;
            size--;
        }
        
    }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.insertatend(4);  //4
        ll.insertatend(7);  //4->7
        ll.display();
        System.out.println(ll.size());
        ll.insertatend(11);
        ll.display();           //4->7->11
        ll.insertatbeg(13);
        ll.display();    
        ll.insertat(1,5);
        ll.display();
        ll.insertat(5,10);
        ll.display();
        ll.insertat(10,5);
        ll.display();
        System.out.println(ll.getAt(1));
        ll.deleteatindex(0);
        ll.display();
    }
}
