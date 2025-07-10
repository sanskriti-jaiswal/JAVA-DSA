package MultiDimensionArray;

public class RichestWealthCustomer {
    class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] res= new int[accounts.length];
        int k=0;
        for(int i=0; i<accounts.length; i++){
            int max=0;
            for(int j=0; j<accounts[i].length; j++){
                max+= accounts[i][j];
            }
            res[k++]= max;
        }
        
        //finding out max ele
        int maximum=res[0];
        for( k=1; k<res.length; k++){
            if(res[k]>maximum){
                maximum= res[k];
            }
        }

        return maximum;
    }
}
}
