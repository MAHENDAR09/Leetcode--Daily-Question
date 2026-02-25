class Solution {
    public String reorganizeString(String s) {

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> {
            return Integer.compare(b.f,a.f);
        });

        int limit = (s.length() + 1)/ 2;
        Map<Character,Integer> hm = new HashMap<>();
        for (int i=0;i<s.length();i++){

            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);

            int val = hm.get(s.charAt(i));

            if (val > limit)
                return "";
        }

        for (Map.Entry m : hm.entrySet()){
            char ch = (char) m.getKey();
            int f = (int) m.getValue();

            pq.add(new Node(ch,f));
        }

        StringBuilder ans = new StringBuilder("");
        
        Node prev = null;
        while (pq.size() != 0){
            Node maxdata = pq.poll();
            if (maxdata != null){
                maxdata.f = maxdata.f - 1;
                ans.append(maxdata.ch);
                if (maxdata.f == 0)
                    maxdata = null;
            }
            if (prev != null){
                pq.offer(prev);
            }
            prev = maxdata;
        }
        System.out.println(hm+" "+pq+"  "+ans);

        return ans.toString();
    }
}

class Node {
    char ch;
    int f;
    Node (char ch,int f){
        this.ch = ch;
        this.f = f;
    }
    public String toString(){
        return ch+" "+f;
    }
}


