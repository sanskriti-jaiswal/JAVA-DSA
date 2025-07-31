package Sorting;

public class LexicographicalOrder {
    public static void sortWords(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            // Find the minimum element in unsorted array
            for (int j = i+1; j < n; j++) {
                // Compare adjacent strings
                if (arr[j].compareTo(arr[min_index]) < 0) {
                    min_index = j; // Update min_index if a smaller string is found
                }
            }
            // Swap 
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    } 
    public static void main(String[] args) {
        String[] words = {"papaya","apple", "kiwi", "date", "banana","mango", "cherry"};
        System.out.println("Unsorted array:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // // Sort the array in lexicographical order
        // java.util.Arrays.sort(words);
        sortWords(words);
        System.out.println("Sorted array in lexicographical order:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
