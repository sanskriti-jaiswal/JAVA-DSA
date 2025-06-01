package Arrays;


    public class Max{
        void findMax(int age[]){
            int maxele= age[0];
            for(int i=1; i<age.length; i++){
                if(age[i]>maxele){
                    maxele=age[i];
                }
            }
            System.out.println("The maximum element in the array is "+maxele);
        }
        public static void main(String[] args) {
            int ages[]= {12, 34, 56, 78, 90, 23, 45, 67, 89, 100};
            Max obj= new Max();
            obj.findMax(ages);
        }
    }
    

