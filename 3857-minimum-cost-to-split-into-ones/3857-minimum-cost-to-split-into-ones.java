class Solution {
    public int minCost(int n) {

        int totalCost = 0;

        while (n != 1){

            n = n - 1;
            totalCost += n;

        }
        return totalCost;
    }
}


// 1 3 -> 3
// 1 2 -> 2
// 1 1 -> 1