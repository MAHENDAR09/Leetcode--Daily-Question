class Solution {
    public String findLatestTime(String s) {
       
       char ch [] = s.toCharArray();

       if (ch[0] == '?' && ch[1] == '?'){
        ch[0] = '1';
        ch[1] = '1';
       }
       else if ((ch[1] == '0' || ch[1] == '1') && ch[0] == '?')
            ch[0] = '1';
        else if (ch[0] == '?' && ch[1] != '?')
            ch[0] = '0';
        else if (ch[0] == '0' && ch[1] == '?')
            ch[1] = '9';
        else if (ch[0] == '1' && ch[1] == '?')
            ch[1] = '1';

        if (ch[3] == '?')
            ch[3] = '5';
        if (ch[4] == '?')
            ch[4] = '9';

        return new String(ch);
    }
}