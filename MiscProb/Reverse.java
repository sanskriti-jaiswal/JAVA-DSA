package MiscProb;

public class Reverse {
    //IN-PLACE
    static void swapInArray(int arr[], int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    static void reverseArray(int arr[]) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    //USING EXTRA SPACE (ans array)
    // static int[] reverseArray(int arr[]) {
    //     int n=arr.length;
    //     int ans[]=new int[n];
    //     int j=0;
    //     for(int i=n-1; i>=0; i--){
    //         ans[j]=arr[i];
    //         j++;
    //     }
    //     return ans;
    // }





    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
