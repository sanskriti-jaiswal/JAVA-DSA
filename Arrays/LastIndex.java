
package Arrays;
import java.util.Scanner;
public class LastIndex {
    Scanner sc = new Scanner(System.in);
    void lastIndex(int age[], int ele){
        int index=-1;
        for(int i=0; i<age.length; i++){
            if(age[i]==ele){
                index=i;
            }
        }
        System.out.println("The last index of element "+ele+" is "+index);
    }
    public static void main(String[] args) {
        int ages[]= {12, 34, 56, 78, 90, 23, 45, 67, 89,45, 100};
        int ele= 45;
        LastIndex obj= new LastIndex();
        obj.lastIndex(ages, ele);
    }
}
