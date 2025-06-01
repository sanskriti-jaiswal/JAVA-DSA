package Strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String str= sc.nextLine();
        // // String str= "abcdcba";
        // //WE WANT TO REVERSE THE STRING WHICH WE CANT IN STRING USING A FUNCTION SO USING STRINGBUILDER
        // StringBuilder gtr= new StringBuilder(str);
        // //OR
        // // StringBuilder gtr= new StringBuilder(sc.nextLine());
        // gtr= gtr.reverse();
        // // if(str.compareTo(gtr))   //WE CANT COMPARE A STRING TO A STRINGBUILDER
        // String s= gtr+"";
        // //NOW TWO STRINGS CAN BE COMPARED
        // if(str.equals(s)){
        //     System.out.println("palindrome");
        // }
        // else{
        //     System.out.println("not palindrome");
        // }


        //BETTER METHOD
        int i=0;
        int j= str.length()-1;
        boolean flag= true;  //true->palindrome
         while(i<j){
            if(str.charAt(i)!= str.charAt(j)){
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
