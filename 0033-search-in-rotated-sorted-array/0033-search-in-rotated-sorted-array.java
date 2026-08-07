class Solution {
    public int search(int[] ar, int target) {

        int low = 0;
        int high = ar.length - 1;

        while (low <= high){

            int mid = low + (high - low) / 2;

            if (ar[mid] == target)
                return mid;

            else if (ar[low] <= ar[mid]){

                if (ar[low] <= target && ar[mid] >= target){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if (ar[mid] <= target && ar[high] >= target){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}