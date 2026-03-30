class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int idx = 0;
        int iceCream = 0;

        while (idx < costs.length && coins > 0 && (coins - costs[idx]) >= 0){
            coins = coins - costs[idx++];
            iceCream++;
        }
        return iceCream;
    }
}