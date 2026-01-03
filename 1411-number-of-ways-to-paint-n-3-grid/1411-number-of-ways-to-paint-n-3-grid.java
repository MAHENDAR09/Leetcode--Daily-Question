class Solution {
    private static int Mode = (int)1e9 + 7;
    int dp[][][][];
    public int numOfWays(int n) {
         dp = new int[n][4][4][4];
         a.fill (dp,n);
        return f(0,-1,-1,-1,n);
    }
    private int f(int i,int p1,int p2,int p3,int n){
        if (i == n) return 1;

        if (dp[i][p1+1][p2+1][p3+1] != -1)
            return dp[i][p1+1][p2+1][p3+1];

        int ans = 0;

        for (int c1 = 0; c1 < 3; c1++) {
            for (int c2 = 0; c2 < 3; c2++) {
                for (int c3 = 0; c3 < 3; c3++) {
                    if (c1 != c2 && c2 != c3 && c1 != p1 && c2 != p2 && c3 != p3) {

                        ans = (ans + f(i + 1, c1, c2, c3, n)) % Mode;
                    }
                }
            }
        }

        return dp[i][p1+1][p2+1][p3+1] = ans;
    }
}
class a {
    public static void fill(int dp[][][][],int n){
        for (int i = 0; i < n; i++)
            for (int a = 0; a < 4; a++)
                for (int b = 0; b < 4; b++)
                    for (int c = 0; c < 4; c++)
                        dp[i][a][b][c] = -1;
    }
}