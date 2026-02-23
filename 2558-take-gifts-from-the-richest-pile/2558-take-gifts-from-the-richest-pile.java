class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int e : gifts)
            pq.add(e);

    while (k-- >0){

        int max = pq.poll();

        pq.add( (int) Math.floor( (int) Math.sqrt(max)) );
    }

    long ans = 0;
    while (pq.size() != 0)
        ans += pq.poll();
    
    return ans;
    } 
}