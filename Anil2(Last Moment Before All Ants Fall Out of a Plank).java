class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ans = 0;
        
        // when ant moves towards the left
        for(int i=0; i<left.length; i++){
            // time taken by last ant will be maximum in left array
            // By observation
            ans = Math.max(ans,left[i]);
        }
        // when moves towards the right 
        for(int i = 0; i<right.length; i++){
            // time taken of last ant = last index - current index
            ans = Math.max(ans,n-right[i]);
        }
        return ans;
    }
}
