class Solution {
    public boolean makeEqual(String[] words) {

        int freq[] = new int [26];
        int n = words.length;

        for (String s : words){
            for (char c : s.toCharArray()){
                freq[c-'a']++;
            }
        }

        for (int i=0;i<26;i++){
            if (freq[i] % n != 0)
                return false;
        }
        return true;
    }
}