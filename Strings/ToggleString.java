package Strings;
import java.util.*;
public class ToggleString {
    public static void main(String[] args) {
        String str= "PhYSicS";
        //CONVERT THE STRING TO STRINGBUILDER
        // StringBuilder sb= new StringBuilder(str); 
        
        for(int i=0; i<str.length(); i++){
            boolean flag= true; //Capital letter
            char ch= str.charAt(i);
            int ascii= (int)ch;
            if(ch==' ') {
                continue;}
            if(ascii>=97){
                flag= false;
            }
            if(flag== true){
                ascii+= 32;
                char c= (char)ascii;
                str= str.substring(0, i)+ c+ str.substring(i+1);
            }
            else{
                ascii-= 32;
                char c= (char)ascii;
                str= str.substring(0, i)+ c+ str.substring(i+1);
            }


        }
        System.out.println(str);
    }
}
