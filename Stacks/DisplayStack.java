package Stacks;
import java.util.*;
public class DisplayStack {

    //WHILE DISPLAY RECURSIVELY, TC=0(n) AND SC= O(n) , since call stack is used
    public static void displayReverseRecusrsively(Stack<Integer> s){
        if(s.size()== 0){
            return;
        }
        int top= s.pop();
        System.out.println(top+" ");
        displayReverseRecusrsively(s);
        s.push(top);  
    }
    public static void displayRecusrsively(Stack<Integer> s){
        if(s.size()== 0){
            return;
        }
        int top= s.pop();
        displayRecusrsively(s);
        System.out.println(top+" ");
        s.push(top);  
    }
    public static void main(String[] args) {
        Stack <Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverseRecusrsively(st);
        displayRecusrsively(st);
    
        // System.out.println(st);
        //OR BY USING STACK
        // BUT HERE TC=0(n) AND SC= O(n)
        // Stack <Integer> rt= new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //     int x= rt.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }


        //OR WITH ARRAYS
        //TC= O(n) and extra space 
        // int n= st.size();
        // int[] arr= new int[n];
        // for(int i=n-1; i>=0; i--){
        //         arr[i]=st.pop();
        // }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }

    }
}
