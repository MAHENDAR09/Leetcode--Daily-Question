class Solution {
    public static int MOD = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {

        int xor = 0;

        for (int q[] : queries){

            int l = q[0];
            int r = q[1];
            int k = q[2];
            long v = q[3];

            while (l <= r && l < nums.length){

                nums[l] = (int) (((long) nums[l] * v) % MOD);               
                l += k;
            }
        }

        for (int e: nums)
            xor = xor ^ e;

        return  xor;
    }
} 