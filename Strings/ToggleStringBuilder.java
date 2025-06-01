package Strings;
import java.util.*;
public class ToggleStringBuilder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb= new StringBuilder(sc.nextLine());
        System.out.println(sb);
        //toggle
        for(int i=0; i<=sb.length()-1; i++){
            //check if alphabet is capital
            boolean flag= true;  //true-> capital
            char ch= sb.charAt(i);
            if(ch==' ') continue;
            int ascii= (int)ch;
            if(ascii>= 97){
                flag= false;
            }
            if(flag==true){   //CAPITAL TO SMALL
                ascii+= 32;
                char c= (char)ascii;
                sb.setCharAt(i,c);
            }
            else{
                ascii= ascii- 32;
                char c= (char)ascii;
                sb.setCharAt(i,c);
            }
        }
        System.out.println(sb);
    }
}
