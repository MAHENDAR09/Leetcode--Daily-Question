class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;

        for (int e : nums)
            hs.add(e);

        for (int i=0;i<nums.length;i++){

            if (! hs.contains( 1 + nums[i])){

                int data = nums[i];
                int cnt = 0;

                while (hs.contains(data)){
                    cnt++;
                    hs.remove(data);
                    data--;
                }
                ans = Math.max(ans,cnt);
            }
        }
        return ans;
    }
}