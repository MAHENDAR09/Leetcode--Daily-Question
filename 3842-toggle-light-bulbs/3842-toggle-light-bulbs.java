class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
        Map<Integer,Integer> hm = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int b : bulbs)
            hm.put(b,hm.getOrDefault(b,0)+1);

        for (Map.Entry m : hm.entrySet()){

            int val = (int) m.getValue();

            if (val %2 == 1){
                ans.add((int)m.getKey());
            }
        }
        
        return ans;
    }
}