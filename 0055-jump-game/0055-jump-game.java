class Solution {
    public boolean canJump(int[] nums) {
        
        int steps = nums[0];
        int i = 1;

        for (i=i;i<nums.length && steps != 0;i++){
            steps = steps - 1;
            steps = Math.max(steps,nums[i]);
        }

        return i == nums.length;
    }
}