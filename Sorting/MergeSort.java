package Sorting;

public class MergeSort {
    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {// base case- single sized array
            return;
        }
            int mid = (l+r) / 2;
            // Sort first and second halves
            //recursion
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            // Merge the sorted halves
            merge(arr, l, mid, r);
        
    }
    public static void merge(int[] arr, int l, int mid, int r) {
        //O(n)
        // Find sizes of two subarrays to be merged
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        //i , j , k are the pointers
        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++]; 
            } else {
                arr[k++] = R[j++]; 
            }
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n= arr.length;
        System.out.println("Unsorted array:");
        display(arr);
        mergeSort(arr, 0, n-1);
        System.out.println("Sorted array:");
        display(arr);
        
    }
}
