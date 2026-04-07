class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
       
        int encodedStrLen = encodedText.length();
         if (encodedStrLen == 0)
            return "";
        int column = encodedStrLen / rows;
        char ch[][] = new char[rows][column];
        StringBuilder ans = new StringBuilder();
        // System.out.println(column);
        int idx = 0;

        for (int i=0;i<rows;i++){
            for (int j=0;j<column  ;j++){
                // if (encodedText.charAt(idx) == ' ')
                //     ch[i][j] = '*';
                // else
                    ch[i][j] = encodedText.charAt(idx);
                idx++;
                // System.out.print(ch[i][j]);
            }
            // System.out.println();
        }

        for (int i=0;i<column;i++){
            ans.append( diagnoalTrav(i,ch,rows,column) );
        }

        idx = ans.length() - 1;
        while (idx >= 0 && ans.charAt(idx) == ' '){
            ans.deleteCharAt(idx);
            idx--;
        }
        return ans.toString();
    }
    public static StringBuilder diagnoalTrav(int j, char ch[][],int row,int column){

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < row && j < column) {
            
             
                sb.append(ch[i][j]);
            i++;
            j++;
        }
        return sb;
    }
}