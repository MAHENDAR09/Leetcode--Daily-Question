class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        for (int i=1;i<s.length();i++){

            int c1 = s.charAt(i);
            int c2 = s.charAt(i-1);

            if (Math.abs(c1-c2) > 2)
                return false;
        }
        return true;
    }
}