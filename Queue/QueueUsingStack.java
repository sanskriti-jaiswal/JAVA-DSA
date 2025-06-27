package Queue;
import java.util.*;
public class QueueUsingStack {
    //THIS IS PUSH EFFICIENT APPROACH
    class MyQueue {
    Stack<Integer> st= new Stack<>();
    Stack<Integer> helper= new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int x= st.pop();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return x;
        
    }
    
    public int peek() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int x= st.peek();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return x;
    }
    
    public boolean empty() {
        if(st.size()==0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

//THIS IS POP AND PEEK EFFICFIENT APPRACH-> O(1), PUSH IN O(n)
//class MyQueue {
    Stack<Integer> st= new Stack<>();
    Stack<Integer> helper= new Stack<>();
    // public MyQueue() {
        
    // }
    
    public void push(int x) {
        if(st.size()==0){
            st.push(x);
        }else{
            while(st.size()>0){
                helper.push(st.pop());
            }
            st.push(x);
            while(helper.size()>0){
                st.push(helper.pop());
            }
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size()==0){
            return true;
        }else{
            return false;
        }
    //}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
