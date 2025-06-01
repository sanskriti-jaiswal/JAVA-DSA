package ArrayList;
import java.util.ArrayList;

public class ArrayListTutorial {
    public static void main(String[] args) {
        // ArrayList is a resizable array implementation of the List interface
        // It allows dynamic resizing and provides methods to manipulate the elements.
        
        ArrayList<Integer> l1= new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        System.out.println(l1.get(2));

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
       
        System.out.println(l1);

        l1.add(1,100);
        System.out.println(l1);

        l1.set(1,10);  //modify an element at a index
        System.out.println(l1);

        l1.remove(1);          //remove at index
        System.out.println(l1);

        l1.remove(Integer.valueOf(7));   //remove element
        System.out.println(l1);

        //check if an element exists
        boolean ans= l1.contains(Integer.valueOf(7));
        System.out.println(ans);

        //if you dont specify any class, you can put anything inside l
        ArrayList l= new ArrayList();
        l.add("pqrs");
        l.add(3);
        l.add(1);
        l.add(false);
        System.out.println(l);
    }
}
