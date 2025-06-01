package Strings;
import java.util.*;
public class StringCompression {
    public static void main(String[] args) {
        String str= "aaabbbbccddde";              //a3b4c2d3e
        String ans= ""+ str.charAt(0);
        int count =1;
        for(int i=1; i<str.length(); i++){
            char crr= str.charAt(i);
            char prev= str.charAt(i-1);   
            if(crr==prev){
                count++;
            }  
            else{
                ans= ans+count;
                count =1;
                ans = ans+crr;
            }  
        }
        System.out.println(ans);
    }
}
