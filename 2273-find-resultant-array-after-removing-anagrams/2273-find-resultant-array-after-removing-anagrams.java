class Solution {
    public List<String> removeAnagrams(String[] words) {

     ArrayList<String> ans = new ArrayList<>(); 
     String word = words[0];
     String sortedWord = getAnagrams(words[0]);


     for (int i=1;i<words.length;i++){
        
        String curSortedWord = getAnagrams(words[i]);

        if (!sortedWord.equals(curSortedWord)){
            ans.add(word);
            word = words[i];
            sortedWord = getAnagrams(words[i]);
        }
     }

     if (sortedWord != getAnagrams(words[words.length-1])){
        ans.add(word);
     }

     return ans; 
    }

    public String getAnagrams(String word){

        char ch[] = word.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}