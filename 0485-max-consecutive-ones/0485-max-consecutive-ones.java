class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int cnt = 0;
        int maxCnt = 0;

        for (int e : nums){
            
           cnt +=  (e == 1 ? 1 : -cnt);
           
            maxCnt = Math.max(cnt,maxCnt);
        }
        return maxCnt;
    }
}