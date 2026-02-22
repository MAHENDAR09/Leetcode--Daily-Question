class Solution {
    public int binaryGap(int n) {

        int onesPos = 0;
        int maxLen = 0;
        while ( n != 0){
            int rem = n % 2;
            if (rem == 1){
                maxLen = Math.max(maxLen,onesPos);
                onesPos = 1;
            }
            else if (onesPos != 0)
                onesPos++;
            n = n / 2;
            
        }
        return maxLen;
    }
}