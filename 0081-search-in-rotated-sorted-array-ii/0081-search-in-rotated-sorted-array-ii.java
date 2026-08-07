class Solution {
    public boolean search(int[] ar, int target) {

        int low = 0;
        int high = ar.length - 1;

        while (low <= high){

            int mid = low + (high - low) / 2;

            if (ar[mid] == target)
                return true;
            else if(ar[mid] == ar[low] && ar[low] == ar[high]){
                low++;
                high--;
            }
            // Left half
            else if (ar[low] <= ar[mid]) {

                if (ar[low] <= target && ar[mid] >= target){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                // right half
                if (ar[mid] <= target && ar[high] >= target){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

        }
        return false;
    }
}