import java.util.*;
class Solution {
    public int[] sortByBits(int[] arr) {
       
       Integer temp[] = Arrays.stream(arr)
                        .boxed()
                        .toArray(Integer[]::new);

        Arrays.sort(temp, (a,b) -> {
           int res = Integer.compare(Integer.bitCount(a),Integer.bitCount(b));
           if (res != 0)
            return res;
            return Integer.compare(a,b);
        });
        for (int i = 0; i < arr.length; i++) 
            arr[i] = temp[i];
    return arr;
    }
}