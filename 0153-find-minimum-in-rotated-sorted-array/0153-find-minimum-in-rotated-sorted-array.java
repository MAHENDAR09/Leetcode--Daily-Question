class Solution {
    public int findMin(int[] ar) {

        int min = 600000;
        int low = 0;
        int high = ar.length - 1;
        
        while (low <= high){

            int mid = (high + low) / 2;

            if (ar[low] <= ar[high]){ 
                min = Math.min(min,ar[low]);
                break;
            }

            else if (ar[low] <= ar[mid]){
                min = Math.min(min,ar[low]);
                low = mid + 1;
            }
            else {
                min = Math.min(min,ar[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
}