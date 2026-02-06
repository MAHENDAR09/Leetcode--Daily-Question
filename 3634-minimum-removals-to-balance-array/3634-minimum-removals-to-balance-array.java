class Solution {
    public int minRemoval(int[] nums, int k) {

        int n = nums.length;
        int maxLen = 1;
        Arrays.sort(nums);
        int l = 0;

        for (int r = 1;r<n;r++){

            long max = nums[l] * (k * 1L);
            if (nums[r] <= max){
                maxLen = Math.max(maxLen,(r-l+1));
                continue;
            }
            else {
                l++;
            }
        }
        return n - maxLen;
    }
}

