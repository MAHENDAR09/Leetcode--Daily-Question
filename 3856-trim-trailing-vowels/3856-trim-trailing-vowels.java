class Solution {
    public String trimTrailingVowels(String s) {

        StringBuilder sb = new StringBuilder(s);
        int n = sb.length()-1;

        while (n >= 0 && isOvel(sb.charAt(n)) ){
            sb.deleteCharAt(n);
            --n;
        }

        return sb.toString();
    }
    public static boolean isOvel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
            return true;
        return false;
    }
}