package Arrays;

public class Search {
    void findElement(int age[], int ele){
        int flag=0;
        for(int i=0; i<age.length; i++){
            if(age[i]==ele){
                System.out.println("Element found at index "+i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        int ages[]= {12, 34, 56, 78, 90, 23, 45, 67, 89, 100};
        int ele= 45;
        Search obj= new Search();
        obj.findElement(ages, ele);
    }
}
