class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int sIdx = 0;
        int gIdx = 0;
        int cookies = 0;
        
        while (sIdx < s.length && gIdx < g.length){
            if(g[gIdx] <= s[sIdx]){
                cookies++;
                sIdx++;
                gIdx++;
            }
            else if (g[gIdx] > s[sIdx]){
                sIdx++;
            }
            
        }
        return cookies;
    }
}
