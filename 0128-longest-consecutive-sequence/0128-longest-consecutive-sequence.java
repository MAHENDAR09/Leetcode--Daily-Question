class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int len = 1;
        int maxLen = 0;

        for (int e : nums)
            hs.add(e);

        for (int i=0;i<n;i++){

            int key = nums[i];
            len = 0;
            if (! hs.contains(key + 1)){

                while (hs.contains(key--)){
                    hs.remove(key+1);
                    len++;
                }

            }

            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}