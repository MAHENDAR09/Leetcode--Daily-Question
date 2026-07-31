class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int ps[] = new int[n];
        int ss[] = new int[n];
        ps[0] = 1;
        ss[n-1] = 1;

        for (int i=1;i<n;i++)
            ps[i] = ps[i-1] * nums[i-1];
        

        for (int i=n-2;i>=0;i--){
            ss[i] = nums[i+1] * ss[i+1];
        }

        for (int i=0;i<n;i++){
            nums[i] = ps[i] * ss[i];
        }

        return nums;
    }
}
