//to find the first multiple of 5 which is also multiple of 7 ie. 35
public class loop2{
    public static void main(String args[]){
        int i=1;
        while(true){
            if(i%5==0 && i%7==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}