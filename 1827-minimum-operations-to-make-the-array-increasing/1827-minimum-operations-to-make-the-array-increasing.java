class Solution {
    public int minOperations(int[] nums) {

        int min = nums[0];
        nums[0] = 0;

        for (int i=1;i<nums.length;i++){

            if (min >= nums[i]){
                nums[0] =  nums[0] + (min + 1) - nums[i];
                min++;
            }
            else 
                min = nums[i];
        }
        return nums[0];
    }
}


    