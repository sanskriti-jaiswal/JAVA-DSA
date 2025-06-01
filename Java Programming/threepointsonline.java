public class threepointsonline {
    public static void main(String args[]){
        int x1=1, y1=1, x2=2, y2=2, x3=3, y3=3;
        int m1= (y2-y1)/(x2-x1);
        int m2= (y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.println("Points are on the same line");
        }
        else{
            System.out.println("Points are not on the same line");
        }
    }
}
