class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;
        int rsum = 0;

        for (int e: gain)
            max = Math.max(max,(rsum += e));

        return max;
    }
}