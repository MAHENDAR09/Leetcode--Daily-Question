class Solution {
    public int minimumDeletions(String s) {

        int n = s.length();
        int la = 0 ,lb = 0, ra = 0, rb = 0;

        int lla[] = new int[n];
        int llb[] = new int[n];
        int rra[] = new int[n];
        int rrb[] = new int[n];

        for (int i=0;i<n;i++){
            if (s.charAt(i) == 'a')
                la++;
            else 
                lb++;
            lla[i] = la;
            llb[i] = lb;
        }

        for (int i=n-1;i>=0;i--){
            if (s.charAt(i) == 'a')
                ra++;
            else 
                rb++;
           rra[i] = ra;
           rrb[i] = rb;
        }

        int ans = 0;
        for (int i=0;i<n;i++){
        int len = lla[i] + rrb[i];
        System.out.print(len+"  ");
        ans = Math.max(ans,len);
        }
        System.out.println(n-ans);
        return n-ans;
    }
}
