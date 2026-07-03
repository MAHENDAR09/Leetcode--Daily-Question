class Solution {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int ans = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        int ps = 0;

        for (int e : nums){

            ps += e;

            if (ps == k){
                ans++;
            }

            if (hm.containsKey(ps-k)){
                ans += hm.get(ps-k);
            }

            hm.put(ps,hm.getOrDefault(ps,0)+1);
        }

        return ans;
    }
}