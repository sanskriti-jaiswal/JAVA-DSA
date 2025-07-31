package Sorting;

public class BubbleSort {
    static void bubblesort(int[] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){  //last i elements are already sorted
                if(arr[j] > arr[j+1]){
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true; // set swapped to true if a swap occurs
                }
            }
            if(swapped== false) { // if no two elements were swapped, the array already is sorted
                return;
            }
        } 
    }
    public static void main(String[] args) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        bubblesort(arr);
        System.out.println("Sorted array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
