package Stacks;
import java.util.*;
public class LLImplementation {
    public static class Node{      //user-defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{    //user-defined data structure
        Node head= null;
        int size= 0;
        void push(int x){
            Node temp= new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayReverse(){
            Node temp=head;
            while(temp!= null){
                System.out.print(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }

        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+ " ");
            
        }
        void display(){    //using recursion
            displayrec(head);
            System.out.println();
        }

        int size(){    //getter
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x=head.val;
            head= head.next;
            size--;
            return x;
            

        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;

        }
        boolean isEmpty(){
            if(size()==0){
                return true;
            }
            return false;
        }


    }

    public static void main(String[] args) {
        LLStack st = new LLStack();

        st.display();
        st.push(2);
        st.display();
        st.push(10);
        st.display();
        st.push(11);
        st.display();
        st.push(5);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(1);
        st.push(3);
        st.display();
        st.push(13);
    }
}
