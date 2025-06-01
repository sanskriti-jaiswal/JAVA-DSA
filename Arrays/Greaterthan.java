package Arrays;

public class Greaterthan {
    void strictyGreaterThan(int age[], int ele){
        int count=0;
        for(int i=0; i<age.length; i++){
            if(age[i]>ele){
                count++;
            }
        }
        System.out.println("The number of elements greater than "+ele+" is "+count);
    }
}
//strictly greater than