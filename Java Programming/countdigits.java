public class countdigits {
    public static void main(String args[]){
        int n=12345;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("no. of digits"+count);
    }
    
}
