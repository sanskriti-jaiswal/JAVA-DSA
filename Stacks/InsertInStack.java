package Stacks;
import java.util.Stack;
import java.util.Scanner;
public class InsertInStack {
    public static void main(String[] args) {
        Stack <Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //index is from 0
        //size is 1 when index is 0
        int idx= 2;
        int x=7; //1 2 7 3 4 5
        Stack <Integer> temp= new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
