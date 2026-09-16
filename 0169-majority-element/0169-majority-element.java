class Solution {
    public int majorityElement(int[] nums) {
       
       int ele = 0;
       int cnt = 0;

       for (int e : nums){

        if (cnt == 0)
            ele = e;

        if (ele == e)
            cnt++;
        else
            cnt--;

       }
        return ele;
    }
}