package Strings;
import java.util.*;
public class ReverserWordInSentence {
    public static void main(String[] args) {
        String str= "Hello I am sanskriti";
        String ans="";
        StringBuilder sb= new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans= ans+ sb;
                ans= ans+ " ";
                sb.delete(0, sb.length());
            }
        }
        sb.reverse();
        ans= ans+ sb;
        System.out.println(ans);
    }
}
