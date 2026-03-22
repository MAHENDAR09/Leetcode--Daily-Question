class Solution {
    public boolean uniformArray(int[] nums1) {

        int oddCnt = 0;
        int evenCnt = 0;
        int minOdd = Integer.MAX_VALUE;

        for (int e : nums1){

            if (e%2 == 0)
                evenCnt++;
            else{
                oddCnt++;
                minOdd = Math.min(minOdd,e);
            }    
        }

        // System.out.println(evenCnt+"  "+oddCnt);
        if (evenCnt == 0 || oddCnt == 0)
            return true;

        for (int e : nums1){
            if (e%2 == 0 && (e - minOdd) <= 0){
                return false;
            }
        }

        return true; 
    }
}