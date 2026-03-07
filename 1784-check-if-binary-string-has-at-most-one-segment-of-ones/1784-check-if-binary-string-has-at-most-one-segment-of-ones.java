class Solution {
    public boolean checkOnesSegment(String s) {

        boolean foundZero = false;

        for (char ch : s.toCharArray()){

            if (ch == '0')
                foundZero = true;
            if (foundZero && ch == '1')
                return false;
        }
        return true;
    }
}