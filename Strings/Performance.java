package Strings;
import java.util.*;
public class Performance {
    public static void main(String[] args) {
        String str= " ";
        for(int i=0; i<=10; i++){
            str= str+ i;
        }
        System.out.println(str); //012345678910

        //BUT IN MEMORY
        // 0
        // 01
        // 012
        // 0123
        // 01234
        // 012345
        // 0123456
        // 01234567
        // 012345678
        // 0123456789
        // 012345678910
    }
}
