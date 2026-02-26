class Solution {
    public int firstUniqueFreq(int[] nums) {

        HashMap<Integer,Integer> freq = new LinkedHashMap<>();
        HashMap<Integer,Integer> freqCnt = new HashMap<>();



        for (int e : nums){
            freq.put(e,freq.getOrDefault(e,0)+1);
        }
        

        for (Map.Entry m : freq.entrySet()){

            int val = (int) m.getValue();

            freqCnt.put(val,freqCnt.getOrDefault(val,0)+1);
        }
        
        for (Map.Entry m : freq.entrySet()){

            int key = (int) m.getKey();
            int value = (int) m.getValue();

            if (freqCnt.get(value) == 1){
                return key;
            }
        }
        return -1;
    }
}