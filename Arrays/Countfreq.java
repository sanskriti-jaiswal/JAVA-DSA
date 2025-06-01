package Arrays;

public class Countfreq {
    void countelement(int age[], int ele){
        int count=0;
        for(int i=0; i<age.length; i++){
            if(age[i]==ele){
                count++;
            }
        }
        System.out.println("The frequency of element "+ele+" is "+count);
    }
}
