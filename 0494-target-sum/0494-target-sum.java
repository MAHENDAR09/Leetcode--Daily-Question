class Solution {

    public int findTargetSumWays(int[] nums, int target) {
    
        return helper(nums,0,target,0);
    }
    public static int helper(int[] nums,int sum,int target,int idx){

        if (idx == nums.length){
            if (sum == target){
                return 1;
            }
            return 0;
        }

        return helper(nums,sum + nums[idx],target,idx+1) + 
                                    helper(nums,sum - nums[idx],target,idx+1);
    }
}