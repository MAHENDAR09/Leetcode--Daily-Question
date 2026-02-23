class Solution {
    public int jump(int[] nums) {

        if (nums.length == 1)
            return 0;
            
        int max = 0;
        int cur = nums[0];
        int jumpCnt = 1;

        for (int i=1;i<nums.length;i++){
            --max;
            --cur;
            max = Math.max(nums[i],max);
            if (cur == 0 && (i+1) != nums.length){
                cur = Math.max(max,nums[i]);
                jumpCnt++;
                System.out.println(i);
            }
        }
        return jumpCnt;
    }
}