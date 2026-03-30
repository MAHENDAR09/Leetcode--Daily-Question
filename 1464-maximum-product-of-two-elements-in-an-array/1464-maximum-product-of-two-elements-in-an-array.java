class Solution {
    public int maxProduct(int[] nums) {
        
        int max = 0;
        int sMax = 0;

        for (int e: nums){

            if (e >= max ){
                sMax = max;
                max = e;
            }
            if (sMax < e && e < max) {
                sMax = e;
            }
        }

        return (max-1) * (sMax-1);
    }
}