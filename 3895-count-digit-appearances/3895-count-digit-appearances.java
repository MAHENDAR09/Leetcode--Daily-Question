class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        
        int count = 0;

        for (int e : nums){

            for (char ch : Integer.toString(e).toCharArray()){
                    if ( ((int) (ch-'0')) == digit)
                        count++;
            }
        }
        return  count;
    }
}