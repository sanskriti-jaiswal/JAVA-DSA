package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {

    // static void reverseList(ArrayList<Integer> list){
    //     int i=0, j=list.size()-1;
    //     while(i<j){
    //         // int temp=a;
    //         // a=b;
    //         // b=temp;

    //         Integer temp= Integer.valueOf(list.get(i));
    //         list.set(i, list.get(j));
    //         list.set(j,temp);
    //         i++;
    //         j--;

    //     }
    // }

    public static void main(String [] args){
        ArrayList <Integer> list = new ArrayList <>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original list"+list);
        // reverseList(list);
        Collections.reverse(list);
        System.out.println("reversed list"+list);
        Collections.sort(list);
        System.out.println("ascending order"+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("descending order"+list);

        //SORTING AN ARRAYLIST WITH STRINGS
        ArrayList<String> list2= new ArrayList<>();
        list2.add("hello");
        list2.add("sans");
        list2.add("how");
        list2.add("are");
        list2.add("you");
         System.out.println("original list"+list2);
         //TO SORT IN ASC ORDER
        //  Collections.sort(list2);
        // System.out.println("sorted list"+list2);
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println("sorted in descending order by alphabets list"+list2);




    }
}
