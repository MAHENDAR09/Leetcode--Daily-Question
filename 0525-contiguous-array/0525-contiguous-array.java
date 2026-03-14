class Solution {
    public int findMaxLength(int[] nums) {

        Map<Integer,Integer> ps = new HashMap<>();
        int ans = 0;
        int sum = 0;
        ps.put(0,-1);

        for (int i=0;i<nums.length;i++){
            
            sum += nums[i] == 0 ? -1 : 1;

            if (ps.containsKey(sum)){
                ans = Math.max(ans,i - ps.get(sum));
            }
            else 
                ps.put(sum,i);
        }
        return ans;
    }
}