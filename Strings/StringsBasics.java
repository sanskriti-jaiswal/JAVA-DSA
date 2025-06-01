package Strings;
import java.util.*;
public class StringsBasics {
    public static void main(String[] args) {
        // char arr[]= new char[10];  //strings are basically character arrays, but here the size is fixed 
        // //thus we use the String Class


        // String str= "sanskriti";
        // System.out.println(str);
        // System.out.println("enter a string");
        // Scanner sc= new Scanner(System.in);
        // // String str= sc.next();
        // String str= sc.nextLine(); 
        // System.out.println(str);

        //str.length()
        String str= "hello world";
        int len= str.length();
        System.out.println(len);

        //str.charAt(index)
        char ch= str.charAt(2);   //charAt(index)
        System.out.println(str.charAt(3));

        //str.indexOf(character)
        int ind= str.indexOf('e');
        System.out.println(ind);

        //str1.compareTo(str2)
        //used with two strings; str==gtr ->0; str>gtr ->positive ; str<gtr ->negative
        String gtr= "dello";
        System.out.println(str.compareTo(gtr));

        //str.contains("substring")
        System.out.println(str.contains("ello"));

        //str.startsWith
        System.out.println(str.startsWith("hell"));
        System.out.println(str.endsWith("wor"));

        //toLowerCase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // s1.concat(s2)
        String s3= str.concat(gtr);
        System.out.println(s3);
        //OR
        System.out.println(str.concat(gtr));

    }
}
