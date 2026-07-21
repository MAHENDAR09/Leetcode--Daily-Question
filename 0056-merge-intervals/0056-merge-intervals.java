class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int n = intervals.length;
        ArrayList<Integer> li = new ArrayList<>();

        li.add(intervals[0][0]);
        li.add(intervals[0][1]);


        for (int i=1;i<n;i++){

            if (li.get(li.size()-1) >=  intervals[i][0]){

                li.set(li.size()-1,Math.max(li.get(li.size()-1),intervals[i][1]));
            }
            else{
                li.add(intervals[i][0]);
                li.add(intervals[i][1]);
            }
        }




        n = li.size();

        int[][] ans = new int[n / 2][2];

        int row = 0;
        int idx = 0;

        while (idx < n) {
            ans[row][0] = li.get(idx++);
            ans[row][1] = li.get(idx++);
            row++;
        }
        return ans;
    }
}