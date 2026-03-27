class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

        List<Integer> ans = new ArrayList<Integer>();
        
        PriorityQueue<Node> pq = new PriorityQueue<>( (a,b) ->  {

            int res = Integer.compare(b.rating,a.rating);

            if (res != 0)
                return res;
            return Integer.compare(b.id,a.id);
        }  
        );

        for (int ar[] : restaurants){
                if (accept(ar,maxPrice,maxDistance,veganFriendly))
                    pq.add(processData(ar));
        }

        while (!pq.isEmpty()){
            ans.add(pq.poll().getIdx());
        }

        return ans;
    }

    public static boolean accept(int d[],int maxP,int maxD,int veganFriendly){

        if (d[3] > maxP || d[4] > maxD)
            return false;

        return d[2] >= veganFriendly;
    }
    public static Node processData(int d[]){
        return new Node(d[0],d[1],d[2],d[3],d[4]);
    }
}
class Node {

    public int id;
    public int rating;
    public int veganFriendly;
    public int maxPrice;
    public int maxDistance;

    Node (int id,int rating,int veganFriendly,int maxPrice,int maxDistance){
        this.id = id;
        this.rating = rating;
        this.veganFriendly = veganFriendly;
        this.maxPrice = maxPrice;
        this.maxDistance = maxDistance;
    }

    public int getIdx(){
        return id;
    }
    public String toString(){
        // return veganFriendly+" "+maxPrice+" "+maxDistance;
        return id +" ";
    }
        
}