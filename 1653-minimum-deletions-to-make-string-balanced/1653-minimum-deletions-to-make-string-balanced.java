class Solution {
    public int minimumDeletions(String s) {
        
        int n = s.length();
        int leftAs[] = new int[n];
        int rightBs[] = new int[n];

        int aS = 0;
        int bS = 0;

        for (int i=0,j=n-1;i<n;i++,j--){

            if (s.charAt(i) == 'a'){
                aS++;
            }
            if (s.charAt(j) == 'b'){
                bS++;
            }
            leftAs[i] = aS;
            rightBs[j] = bS;
        }

        int maxLen =  0;

        for (int i=0;i<n;i++){
            maxLen = Math.max(maxLen,(leftAs[i] + rightBs[i]));
        }

        return n - maxLen;
    }
}