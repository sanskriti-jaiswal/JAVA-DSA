package Queue;

public class ArrayImpOfCircularQueues {
    public static class cqueueA{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr= new int[5];

        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("queue is full");
            }
            else if(size==0){
                f=r=0;
                arr[0]=val;
                
            }
            else if(r<arr.length-1){ //normal case
                arr[++r]= val;
            }else if(r==arr.length-1){ //r is at last index
                r=0;
                arr[0]= val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
                // System.out.println("queue is empty");
                // return -1;
            }else{
                int val=arr[f];
                if(f==arr.length-1){
                    f=0;
                }else{
                    f++;
                }
                size--;
                return val;
            }
            
        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            }else{
                return arr[f];
            }
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }else{
                return false;
            }
        }

        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            }
            else if(f<=r){
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            else{ //r<f
                for(int i=f; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }

        }
    }
    public static void main(String[] args) throws Exception{
        cqueueA cq= new cqueueA();
        cq.display();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.display();
        cq.remove();
        cq.remove();
        cq.display();
        cq.add(6); // actual- 6 3 4 5
        cq.display();
        cq.add(7);// actual- 6 7 3 4 5 
        cq.display();
        // cq.add(8);
        // cq.display(); //3 4 5 6 7
        for(int i=0; i<cq.arr.length; i++){
            System.out.print(cq.arr[i]+" ");
        }

    }
}
