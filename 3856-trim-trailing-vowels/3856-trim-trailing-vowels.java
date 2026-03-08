class Solution {
    public String trimTrailingVowels(String s) {

        int n = s.length()-1;

        while (n >= 0 && isOvel(s.charAt(n)) ){
            --n;
        }
        
        return s.substring(0,++n);
    }
    public static boolean isOvel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
            return true;
        return false;
    }
}