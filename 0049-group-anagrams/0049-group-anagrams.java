class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (String s : strs){

            String sortedStr = sort(s);

            if (! hm.containsKey(sortedStr))
                hm.put(sortedStr,new ArrayList<>());

            hm.get(sortedStr).add(s);
        }

        for (Map.Entry m : hm.entrySet()){
            ans.add((ArrayList) m.getValue());
        }

        return ans;
    }

    private String sort(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}