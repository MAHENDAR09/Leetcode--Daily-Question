class Solution {
    static List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {

        ans.clear();
        if (n == 2 || n == 3){
            return ans;
        }
        char ch[][] = new char[n][n];
        helper(ch,0,n);
        return ans;
    }
    public static void helper(char Queens[][],int row,int n){

        if (row == n){
            print(Queens);
            return;
        }

        for (int i=0;i<n;i++){
            if(canIPlace(Queens,row,i)){
                Queens[row][i] = 'Q';
                helper(Queens,row+1,n);
                Queens[row][i] = '.';
            }
        }
    }
    public static boolean canIPlace(char[][] Queens,int row,int col){

        int n = Queens.length;

        for (int i=0;i<row;i++){
            if (Queens[i][col] == 'Q')
                return false;
        }

        int i = row;
        int j = col;

        while (i >= 0 && j >= 0){
            if (Queens[i][j] == 'Q')
                return false;
                i--;
                j--;
        }

        i = row;
        j = col;

        while (i >= 0 && j < n){
            if (Queens[i][j] == 'Q')
                return false;
                i--;
                j++;
        }
        return true;
    }
    public static void print(char[][] Queens){

        List<String> li = new ArrayList<>();
        for (char ch[] : Queens){
            String s = "";
            for (char c : ch){
                if (c == 'Q')
                    s = s + "Q";
                else
                    s = s + ".";
            }
            li.add(s);
        }
        ans.add(new ArrayList<>(li));

    }
}