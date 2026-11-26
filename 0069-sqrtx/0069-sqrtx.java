class Solution {
    public int mySqrt(int x) {

        int low = 1;
        int high = x;
        int notAperfectSQ = 0;

        while (low <= high){

            int mid = low + (high-low) / 2;

            long ans = mid * (mid * 1L);

            if (ans == x)
                return mid;
            else if (ans < x){
                low = mid + 1;
                notAperfectSQ = mid;
            }
            else {
                high = mid - 1;
            }
        }
        return notAperfectSQ;
    }
}