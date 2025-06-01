package MiscProb;
//METHOD 2: IN-PLACE
// This method is more efficient than the first one as it does not use any extra space.
public class RotateArray2 {
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void rotateInPlace(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1); // start
        reverse(arr, n - k, n - 1); // end
        reverse(arr, 0, n - 1); // reversing the whole array
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        rotateInPlace(arr, k);
        
        System.out.println("Array after in-place rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        
    }
}
