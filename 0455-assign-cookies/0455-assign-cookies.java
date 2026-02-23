class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;
        for (int i=0;i<g.length;i++) {
            for (int j=0;j<s.length;j++) {
                if (s[j] >= g[i]) {
                    System.out.println (i+" "+j);
                    cnt++;
                    s[j] = 0;
                    g[i] = Integer.MAX_VALUE;
                }
            }
        }
        return cnt;
    }
}