class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x = 1;

        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = x;
            x *= nums[i];
        }

        x = 1; 

        for(int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= x;
            x *= nums[i];
        }

        return arr;
        
    }
}