class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[Math.max(2,nums.length)];
        int n = nums.length;

        dp[0] = nums[0];

        for (int i=1;i<n;i++){

            int take = nums[i];
            if (i >= 2)
                take = nums[i] + dp[i-2];
            int skip = dp[i-1];
            
            dp[i] = Math.max(take,skip);
        }
        
        return dp[n-1];
    }

    public static int helper(int nums[],int idx,int dp[]){

        if (idx <= 0){
            return idx == 0 ? nums[0] : 0;
        }

        if (dp[idx] != -1){
            return dp[idx];
        }
        int take = nums[idx] + helper(nums,idx-2,dp);
        int skip = helper(nums,idx-1,dp);

        return dp[idx] = Math.max(take,skip);

    }
} 