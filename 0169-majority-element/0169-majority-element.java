class Solution {
    public int majorityElement(int[] nums) {

        int majEle  = -1;
        int cnt = 0;

        for (int e : nums){

            if (cnt == 0){
                majEle = e;
                cnt = 1;
            }
            else if (majEle == e)
                cnt++;
            else
                cnt--;
            
        }

        return majEle;
    }
}