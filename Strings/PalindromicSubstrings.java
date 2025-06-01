package Strings;
import java.util.*;
public class PalindromicSubstrings {

    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        boolean flag= true; //true-> palindrome
        while(i<j){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String str= sc.nextLine();
        int count =0;
        for(int i=0; i<=str.length()-1; i++){
            for(int j=i+1; j<=str.length(); j++){
                if(isPalindrome(str.substring(i,j))== true){
                    System.out.println(str.substring(i,j));
                    count ++;
                }
            }
        }
        System.out.println(count);

    }
}
