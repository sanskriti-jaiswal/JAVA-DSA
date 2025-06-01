package Strings;
import java.util.*;
public class ChangeString {
    public static void main(String[] args) {
        String s= "Hello";   //HEYLO
        //2-> y
        s= s.substring(0,2)+ "y"+ s.substring(3);
        System.out.println(s);
    }
}
