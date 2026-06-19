class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer,Integer> tm = new HashMap<>();
        int ans = 0;

        for (int e : nums)
           tm.put(e, tm.getOrDefault(e, 0) + 1);

       
        for (Map.Entry m : tm.entrySet()){

            int key = (int) m.getKey();
            if (tm.containsKey(key + 1)){
                ans = Math.max(ans, (int) m.getValue() + (int) tm.get(key+1));
            }

        }
        return ans;
    }
}

