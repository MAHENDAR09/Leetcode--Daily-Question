class Solution {
    public int[] xorQueries(int[] ps, int[][] queries) {

        int n = queries.length;
        int ans[] = new int[n];

        for (int i=1;i<ps.length;i++){

            ps[i] = ps[i-1] ^ ps[i];
        }


        for (int i=0;i<n;i++){

            int sVal = (queries[i][0] - 1) == -1 ? 0 : ps[queries[i][0] - 1];
            int lVal = ps[queries[i][1]];

            ans[i] = sVal ^ lVal;
        }

        return ans;
        
    }
}