class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b) -> {
            int res = Integer.compare(a[1],b[1]);
            if (res != 0)
                return res;
            return Integer.compare(a[0],b[0]);
        });

        int overlapping = 0;
        int trackLast = intervals[0][1];

        for (int i=1;i<intervals.length;i++){

            int start = intervals[i][0];
            int end = intervals[i][1];

            if (trackLast > start){
                overlapping++;
            }
            else {
                trackLast = end;
            }
        }
        return overlapping;
    }
}