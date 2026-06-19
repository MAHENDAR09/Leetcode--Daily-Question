class Solution {
    public int findLHS(int[] nums) {

        TreeMap<Integer,Integer> tm = new TreeMap<>();

        for (int e : nums)
           tm.put(e, tm.getOrDefault(e, 0) + 1);

        int prevKey = Integer.MAX_VALUE;
        int prevVal = 0;
        int ans = 0;


        System.out.println(tm);

        for (Map.Entry m : tm.entrySet()){

            if (prevKey != Integer.MAX_VALUE){

                if (((int) m.getKey() - prevKey) == 1)
                    ans = Math.max(ans,(int)m.getValue() + prevVal);
            }

            prevKey = (int) m.getKey();
            prevVal = (int) m.getValue();

        }
        return ans;
    }
}


// 1 : 1
// 2 : 3
// 3 : 2
// 5 : 1
// 7 : 1
