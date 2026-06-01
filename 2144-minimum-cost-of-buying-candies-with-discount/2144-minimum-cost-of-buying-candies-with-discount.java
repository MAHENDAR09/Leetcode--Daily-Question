class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int idx = cost.length - 1;
        int cnt = 1;
        int ans = 0;

        while (idx >= 0){
            
            ans += cost[idx];

            if (cnt == 3){
                ans -= cost[idx];
                cnt = 0;
            }
            cnt++;
            idx--;
        }
        return ans;
    }
}