package Stacks;
import java.util.*;
public class ArrayImplementation {
    public static class Stack{
        int[] arr= new int[5];
        int idx= 0; //MOST IMP
        void push(int x){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx]= x;
            idx++;
            
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top= arr[idx-1];
            arr[idx-1]= 0; // Optional: Clear the popped element
            idx--;
            return top;
        }
        void display(){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                 return true;
            }else{
                return false;
            }
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }else{
                return false;
            }
        }
        int capacity(){
            return arr.length;
        }
        

    }
    public static void main(String[] args) {
        Stack st= new Stack();
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
        System.out.println(st.isFull());
        st.push(13);
        
    }
}
