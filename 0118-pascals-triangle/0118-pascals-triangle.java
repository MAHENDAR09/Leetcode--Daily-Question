class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1));

        if (numRows == 1){
            return ans;
        }
        
        ans.add(List.of(1,1));
        if (numRows == 2){
            return ans;
        }

        int curRow = 2;
        int col = 1;

        while (curRow < numRows){

            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for (int i=0;i<col;i++){

                temp.add( ans.get(curRow-1).get(i) + ans.get(curRow-1).get(i+1) );

            }
            temp.add(1);
            ans.add(temp);
            col++;
            curRow++;
        }
        return ans;
    }
}