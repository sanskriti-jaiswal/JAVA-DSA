package Stacks;
import java.util.*;
public class MoveStackInSameOrder {
    //TC= O(2n)= O(n)
    //SC= O(n)
    //We can use two stacks to reverse the order of elements in a stack.
    public static void main(String[] args) {
        Stack <Integer> st= new Stack<>();
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter the no of elements");
        n= sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1; i<=n; i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        //reverse order
        Stack<Integer> rt= new Stack<>();
        while(st.size()>0){
            int x= st.peek();
            rt.push(x);
            st.pop();
            //OR rt.push(st.pop());
        }
        Stack<Integer> gt= new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);

    }
}
