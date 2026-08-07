class Solution {
    public int findMin(int[] ar) {

        int low = 0;
        int high = ar.length - 1;
        int min = 90000;

        while (low <= high){

            int mid = (low+high) / 2;

            // System.out.println(low+"  "+mid+"  "+high);

            if (ar[mid] == ar[low] && ar[mid] == ar[high]){
                min = Math.min(ar[mid],min);
                low++;
                high--;
            }
            else if (ar[low] <= ar[mid]){

                min = Math.min(ar[low],min);
                low = mid + 1;
            }
            else {
                min = Math.min(ar[mid],min);
                high = mid - 1;
            }

        }
        return min;
    }
}