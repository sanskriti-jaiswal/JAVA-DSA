package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    //this code  is push efficient -> O(n). pop and peek O(n)
    class MyStack {
    Queue<Integer> q= new LinkedList<Integer>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        //1 2 3 4
        for(int i=1; i<=q.size()-1; i++){
            q.add(q.remove());
        }
        int val= q.peek();
        q.remove();// 1 2 3
        return val;
    }
    
    public int top() {
        //1 2 3 4
        for(int i=1; i<=q.size()-1; i++){
            q.add(q.remove());
        }
        //4 1 2 3
        int x=q.peek();
        q.add(q.remove());
        return x;
    }
    
    public boolean empty() {
        if(q.size()==0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */


//class MyStack {
//THIS IS POP AND PEEK EFFICIENT-> O(1), PUSH IN O(n)
Queue<Integer> q= new LinkedList<Integer>();
   // public MyStack() {
        
   // }
    
    public void push(int x) {
        if(q.size()==0){
            q.add(x);
        }else{
            q.add(x);
            for(int i=1; i<=q.size()-1; i++){
                q.add(q.remove());
            }
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()==0){
            return true;
        }else{
            return false;
        }
    }
//}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
