package Interface;
import java.util.*;
public class SetInterface {
    //HASHSET LINKEDHASHSET TREESET(IN SORTED SET)
    public static void main(String[] args) {
        // HashSet<Integer> st= new HashSet<>();
        // st.add(1);
        // st.add(1);
        // st.add(2);
        // st.add(3);
        // st.add(48);
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // System.out.println(st); //UNORDER- ORDER IS ENITERLY RANDOM
        // st.remove(2);
        // System.out.println(st.contains(2));
        // System.out.println(st.size());

        // LinkedHashSet<Integer> st= new LinkedHashSet<>();
        // st.add(1);
        // st.add(1);
        // st.add(2);
        // st.add(3);
        // st.add(48);
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // System.out.println(st);

        TreeSet<Integer> st= new TreeSet<>();
        st.add(1);
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(10);
        st.add(20);
        st.add(30);
        System.out.println(st);

    }
}
