package Strings;
import java.util.*;
public class Interning {
    public static void main(String[] args) {
        String s= "hello";
        String x= "hello";
        x= "mello";
        System.out.println(x);
        System.out.println(s);       //no change in s
        
    }
}
