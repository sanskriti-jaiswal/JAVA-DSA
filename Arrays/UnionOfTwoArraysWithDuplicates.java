package Arrays;

public class UnionOfTwoArraysWithDuplicates {
    // User function Template for Java
    public static int findUnion(int a[], int b[]){
       
        int[] result = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (result[j] == a[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = a[i];
            }
        }
        for(int i = 0; i < b.length; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < index; j++) {
                if(result[j] == b[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                result[index++] = b[i];
            }
        }
        return index; 
    
}
}
