package Strings;
import java.util.*;
public class Equals {
    public static void main(String[] args) {
        String s1= "hello";
        String s2="hello";
        String s3= new String("hello");
        System.out.println(s1==s2);       //TRUE
                                          // COMPARES ADDRESS NOT VALUES

        System.out.println(s1==s3);       //FALSE
        System.out.println(s1.equals(s3)); //TRUE- COMPARES VALUE

    }
}
