class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;

        for (int i=0;i<k;i++){
            sum += nums[i];
        }
        
        double ans = sum / k;
        int i = 0;

        while ((k+i) < nums.length){
            sum = sum + nums[i+k] - nums[i];
            ans = Math.max(ans, (sum/k));
            i++;
        }

        return ans;
    }
}