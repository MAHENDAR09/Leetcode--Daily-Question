class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int ans1 = 0;
        int ans2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        List<Integer> ans = new ArrayList<>();

        for (int e : nums){

            if (cnt1 == 0 && e != ans2){
                ans1 = e;
                cnt1 = 1;
            }
            else if (cnt2 == 0 &&  e != ans1){
                ans2 = e;
                cnt2 = 1;
            }

            else if (ans1 == e)
                cnt1++;
            else if (ans2 == e)
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }


        cnt1 = 0;
        cnt2 = 0;
        int min = nums.length / 3;

        for (int e : nums){
            if (e == ans1)
                cnt1++;
            else if (e == ans2)
                cnt2++;
        }
        
        if (min < cnt1)
            ans.add(ans1);
        if (min < cnt2)
            ans.add(ans2);

        return ans;
    }
}