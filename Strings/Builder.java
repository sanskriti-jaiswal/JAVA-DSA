package Strings;
import java.util.*;
public class Builder {
    public static void main(String[] args) {
        // StringBuilder str= new StringBuilder("hello");
        // // str+= "world";    //error
        // str.append(("world"));
        // System.out.println(str);
        // //IN MEMORY - helloworld

        // //we can change a char in string
        // str.setCharAt(0,'m');
        // System.out.println(str);
        // str.append(true);
        //  System.out.println(str);
        //  str.insert(2,'y');
        //  System.out.println(str);
        //  str.deleteCharAt('2');
        //  System.out.println(str);


        StringBuilder sb= new StringBuilder("physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(2,4);
        System.out.println(sb);


    }
}
