class Solution {
    public int scoreDifference(int[] nums) {

        int n = nums.length;
        int firstPlayerScore = 0;
        int secondPlayerScore = 0;
        boolean firstPlayerActive = true;
        int nextSwap = 5;

       for (int i=0;i<n;i++){

        if (nums[i] %2 != 0){
            firstPlayerActive = !(firstPlayerActive);
        }
        if (i == nextSwap){
            firstPlayerActive = !firstPlayerActive;
            nextSwap += 6;
        }

        if (firstPlayerActive)
            firstPlayerScore += nums[i];
        else
            secondPlayerScore += nums[i];
       }
       return firstPlayerScore - secondPlayerScore;
    }
} 