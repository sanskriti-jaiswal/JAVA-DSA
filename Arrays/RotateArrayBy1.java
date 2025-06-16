package Arrays;

public class RotateArrayBy1 {
    // // User function Template for Java


    public void rotate(int[] arr) {
        // code here
        int n= arr.length;
        int[] temp= new int[n];
        int index=0;
        temp[index++]= arr[n-1];
        for(int i=0; i<n-1; i++){
            temp[index++]= arr[i];
        }
        for(int i=0; i<temp.length; i++){
            arr[i]= temp[i];
        }
    
}
}
