 class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

        return 
    Arrays.stream(restaurants)
    .filter(e -> e[3] <= maxPrice && e[4] <= maxDistance && e[2] >= veganFriendly)
    .sorted( (a,b) -> {
        int res = Integer.compare(b[1],a[1]);
            if (res != 0)
                return res;
            return Integer.compare(b[0],a[0]);
    })
    .mapToInt(e -> e[0])
    .boxed()
    .toList()
    ;
    }
}