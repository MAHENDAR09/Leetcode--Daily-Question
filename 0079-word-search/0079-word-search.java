class Solution {
    public boolean exist(char[][] board, String word) {

        boolean used[] [] = new boolean [board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    if (helper(board,i,j,0,word,used))
                        return true;
                }
            }
        }
        return false;
    }
    public static boolean helper(char[][] board, int i,int j, int idx,String            word,boolean[][] used){

        if (idx == word.length()){
            System.out.println("ss"+i +"  "+j);
            return true;
        }

        if (i < 0 || j < 0 || i == board.length || j == board[0].length){
            return false;
        }

        boolean x = false;

        if (board[i][j] == word.charAt(idx) && used[i][j] == false){
            used[i][j] = true;
            x = helper(board,i+1,j,idx+1,word,used) ||
            helper(board,i-1,j,idx+1,word,used) ||
            helper(board,i,j-1,idx+1,word,used) ||
            helper(board,i,j+1,idx+1,word,used);
            used[i][j] = false;
        }
        return x;
        
    }
} 