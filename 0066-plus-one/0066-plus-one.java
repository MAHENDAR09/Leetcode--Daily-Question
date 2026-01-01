class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        if (digits[n-1] < 9){
            digits[n-1]++;
            return digits;
        }
        int ans[] = new int[n+1];
        digits[n-1]++;
        int num = 0,carry = 0;

        for (int i=n;i>=0;i--){
            num = carry + ( i == 0 ? 0 : digits[i-1]);
            carry = num >= 10 ? num/10 : 0;
            ans[i] =  num >= 10 ? num % 10 : num;
        }
        if (ans[0] == 0)
            return Arrays.copyOfRange(ans,1,n+1);
        return ans;
    }
}
