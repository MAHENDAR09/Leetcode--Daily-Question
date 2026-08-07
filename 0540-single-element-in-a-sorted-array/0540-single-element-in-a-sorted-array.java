class Solution {
    public int singleNonDuplicate(int[] ar) {

        int n = ar.length;
        
        if (n == 1){
            return ar[0];
        }
        else if (ar[0] != ar[1]){
            return ar[0];
        }
        else if (ar[n-2] != ar[n-1]){
            return ar[n-1];
        }

        int low = 1;
        int high = n - 2;
        int ele = 0;

        while (low <= high){

            int mid = low + (high - low)/2;

            if (ar[mid-1] != ar[mid] && ar[mid] != ar[mid+1]){
                ele = ar[mid];
                break;
            }
            else if ( (mid % 2 == 0 && ar[mid] == ar[mid+1] ) || (mid %2 == 1 && ar[mid] == ar[mid-1]) ){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ele;
    }
} 