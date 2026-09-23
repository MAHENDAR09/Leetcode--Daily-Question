class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i=0;i<9;i++){
            if (! checkRow(board,i))
                return false;
            
            if (! checkCol(board,i))
                return false;
        }

        int p1 = 0;
        int p2 = 0;

        for (int i=0;i<3;i++){

            if (! checkSQR(board,p1,p2))
                return false;
            if (! checkSQR(board,p1,p2+3))
                return false;
            if (! checkSQR(board,p1,p2+6))
                return false;

            p1 = p1 + 3;
        }
        return true;
    }

    private static boolean checkSQR(char board[][],int s,int e){

        HashSet<Character> hs = new HashSet<>();

        for (int i=s;i<(s+3);i++){
            for (int j=e;j<(e+3);j++){
                 if (hs.contains(board[i][j]))
                return false;
            if (isValidNum(board[i][j]))
                hs.add(board[i][j]);
            }
        }

        return true;
    }

    private static boolean checkCol(char board[][],int row){

        HashSet<Character> hs = new HashSet<>();

        for (int i=0;i<9;i++){
            
            if (hs.contains(board[row][i]))
                return false;
            if (isValidNum(board[row][i]))
            hs.add(board[row][i]);
        }
        return true;
    }
    private static boolean checkRow(char board[][],int col){

        HashSet<Character> hs = new HashSet<>();

        for (int i=0;i<9;i++){
            
            if (hs.contains(board[i][col]))
                return false;
            if (isValidNum(board[i][col]))
            hs.add(board[i][col]);
        }
        return true;
    }

    private static boolean isValidNum(char e){
        return e >= '0' && e <= '9';
    }
}