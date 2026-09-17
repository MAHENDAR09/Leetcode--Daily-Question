class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer,Integer> hm = new HashMap<>();
        PriorityQueue<Node> pq =
                    new PriorityQueue<>((x,y) -> {

                        if (x.b != y.b)
                            return Integer.compare(y.b,x.b);
                        return Integer.compare(y.a,x.a);
                    });

        int ans[] = new int[k];
        int idx = 0;

        for (int e : nums)
            hm.put(e,hm.getOrDefault(e,0)+1);

        for(Map.Entry m : hm.entrySet()){
            int key = (int) m.getKey();
            int val = (int) m.getValue();
            pq.add(new Node(key,val));
        }

        while (k-->0 && pq.size() > 0){
            ans[idx++] = pq.poll().getKey();
        }

        return ans;
    }
}
class Node {
    int a,b;
    public Node(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int getKey(){
        return a;
    }
}